package com.kammoun.utils.jackson.databind.introspect;

import com.kammoun.utils.jackson.databind.AnnotationIntrospector;
import com.kammoun.utils.jackson.databind.BeanDescription;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.MapperFeature;
import com.kammoun.utils.jackson.databind.annotation.JsonPOJOBuilder;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.introspect.AccessorNamingStrategy;
import com.kammoun.utils.jackson.databind.jdk14.JDK14Util;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class DefaultAccessorNamingStrategy extends AccessorNamingStrategy {
    protected final MapperConfig<?> _config;
    protected final AnnotatedClass _forClass;
    protected final BaseNameValidator _baseNameValidator;
    protected final boolean _stdBeanNaming;
    protected final boolean _isGettersNonBoolean;
    protected final String _getterPrefix;
    protected final String _isGetterPrefix;
    protected final String _mutatorPrefix;

    public interface BaseNameValidator {
        boolean accept(char c, String str, int i);
    }

    public static class FirstCharBasedValidator implements BaseNameValidator {
        private final boolean _allowLowerCaseFirstChar;
        private final boolean _allowNonLetterFirstChar;

        protected FirstCharBasedValidator(boolean z, boolean z2) {
            this._allowLowerCaseFirstChar = z;
            this._allowNonLetterFirstChar = z2;
        }

        public static BaseNameValidator forFirstNameRule(boolean z, boolean z2) {
            if (z || z2) {
                return new FirstCharBasedValidator(z, z2);
            }
            return null;
        }

        @Override
        public boolean accept(char c, String str, int i) {
            return Character.isLetter(c) ? this._allowLowerCaseFirstChar || !Character.isLowerCase(c) : this._allowNonLetterFirstChar;
        }
    }

    public static class Provider extends AccessorNamingStrategy.Provider implements Serializable {
        private static final long serialVersionUID = 1;
        protected final String _setterPrefix;
        protected final String _withPrefix;
        protected final String _getterPrefix;
        protected final String _isGetterPrefix;
        protected final BaseNameValidator _baseNameValidator;

        public Provider() {
            this("set", JsonPOJOBuilder.DEFAULT_WITH_PREFIX, "get", "is", (BaseNameValidator) null);
        }

        protected Provider(Provider provider, String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, provider._baseNameValidator);
        }

        protected Provider(Provider provider, BaseNameValidator baseNameValidator) {
            this(provider._setterPrefix, provider._withPrefix, provider._getterPrefix, provider._isGetterPrefix, baseNameValidator);
        }

        protected Provider(String str, String str2, String str3, String str4, BaseNameValidator baseNameValidator) {
            this._setterPrefix = str;
            this._withPrefix = str2;
            this._getterPrefix = str3;
            this._isGetterPrefix = str4;
            this._baseNameValidator = baseNameValidator;
        }

        public Provider withSetterPrefix(String str) {
            return new Provider(this, str, this._withPrefix, this._getterPrefix, this._isGetterPrefix);
        }

        public Provider withBuilderPrefix(String str) {
            return new Provider(this, this._setterPrefix, str, this._getterPrefix, this._isGetterPrefix);
        }

        public Provider withGetterPrefix(String str) {
            return new Provider(this, this._setterPrefix, this._withPrefix, str, this._isGetterPrefix);
        }

        public Provider withIsGetterPrefix(String str) {
            return new Provider(this, this._setterPrefix, this._withPrefix, this._getterPrefix, str);
        }

        public Provider withFirstCharAcceptance(boolean z, boolean z2) {
            return withBaseNameValidator(FirstCharBasedValidator.forFirstNameRule(z, z2));
        }

        public Provider withBaseNameValidator(BaseNameValidator baseNameValidator) {
            return new Provider(this, baseNameValidator);
        }

        @Override
        public AccessorNamingStrategy forPOJO(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
            return new DefaultAccessorNamingStrategy(mapperConfig, annotatedClass, this._setterPrefix, this._getterPrefix, this._isGetterPrefix, this._baseNameValidator);
        }

        @Override
        public AccessorNamingStrategy forBuilder(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, BeanDescription beanDescription) {
            AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
            JsonPOJOBuilder.Value findPOJOBuilderConfig = annotationIntrospector == null ? null : annotationIntrospector.findPOJOBuilderConfig(annotatedClass);
            return new DefaultAccessorNamingStrategy(mapperConfig, annotatedClass, findPOJOBuilderConfig == null ? this._withPrefix : findPOJOBuilderConfig.withPrefix, this._getterPrefix, this._isGetterPrefix, this._baseNameValidator);
        }

        @Override
        public AccessorNamingStrategy forRecord(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
            return new RecordNaming(mapperConfig, annotatedClass);
        }
    }

    public static class RecordNaming extends DefaultAccessorNamingStrategy {
        protected final Set<String> _fieldNames;

        public RecordNaming(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
            super(mapperConfig, annotatedClass, null, "get", "is", null);
            String[] recordFieldNames = JDK14Util.getRecordFieldNames(annotatedClass.getRawType());
            this._fieldNames = recordFieldNames == null ? Collections.emptySet() : new HashSet<>(Arrays.asList(recordFieldNames));
        }

        @Override
        public String findNameForRegularGetter(AnnotatedMethod annotatedMethod, String str) {
            return this._fieldNames.contains(str) ? str : super.findNameForRegularGetter(annotatedMethod, str);
        }
    }

    protected DefaultAccessorNamingStrategy(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, String str, String str2, String str3, BaseNameValidator baseNameValidator) {
        this._config = mapperConfig;
        this._forClass = annotatedClass;
        this._stdBeanNaming = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
        this._isGettersNonBoolean = mapperConfig.isEnabled(MapperFeature.ALLOW_IS_GETTERS_FOR_NON_BOOLEAN);
        this._mutatorPrefix = str;
        this._getterPrefix = str2;
        this._isGetterPrefix = str3;
        this._baseNameValidator = baseNameValidator;
    }

    @Override
    public String findNameForIsGetter(AnnotatedMethod annotatedMethod, String str) {
        if (this._isGetterPrefix == null) {
            return null;
        }
        if ((this._isGettersNonBoolean || _booleanType(annotatedMethod.getType())) && str.startsWith(this._isGetterPrefix)) {
            return this._stdBeanNaming ? stdManglePropertyName(str, this._isGetterPrefix.length()) : legacyManglePropertyName(str, this._isGetterPrefix.length());
        }
        return null;
    }

    private boolean _booleanType(JavaType javaType) {
        if (javaType.isReferenceType()) {
            javaType = javaType.getReferencedType();
        }
        return javaType.hasRawClass(Boolean.TYPE) || javaType.hasRawClass(Boolean.class) || javaType.hasRawClass(AtomicBoolean.class);
    }

    @Override
    public String findNameForRegularGetter(AnnotatedMethod annotatedMethod, String str) {
        if (this._getterPrefix == null || !str.startsWith(this._getterPrefix)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (_isCglibGetCallbacks(annotatedMethod)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && _isGroovyMetaClassGetter(annotatedMethod)) {
            return null;
        }
        return this._stdBeanNaming ? stdManglePropertyName(str, this._getterPrefix.length()) : legacyManglePropertyName(str, this._getterPrefix.length());
    }

    @Override
    public String findNameForMutator(AnnotatedMethod annotatedMethod, String str) {
        if (this._mutatorPrefix == null || !str.startsWith(this._mutatorPrefix)) {
            return null;
        }
        return this._stdBeanNaming ? stdManglePropertyName(str, this._mutatorPrefix.length()) : legacyManglePropertyName(str, this._mutatorPrefix.length());
    }

    @Override
    public String modifyFieldName(AnnotatedField annotatedField, String str) {
        return str;
    }

    protected String legacyManglePropertyName(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        if (this._baseNameValidator != null && !this._baseNameValidator.accept(charAt, str, i)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        int i2 = i + 1;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt2 = str.charAt(i2);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb.append((CharSequence) str, i2, length);
                break;
            }
            sb.append(lowerCase2);
            i2++;
        }
        return sb.toString();
    }

    protected String stdManglePropertyName(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        if (this._baseNameValidator != null && !this._baseNameValidator.accept(charAt, str, i)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        if (i + 1 < length && Character.isUpperCase(str.charAt(i + 1))) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        sb.append((CharSequence) str, i + 1, length);
        return sb.toString();
    }

    protected boolean _isCglibGetCallbacks(AnnotatedMethod annotatedMethod) {
        Class<?> rawType = annotatedMethod.getRawType();
        if (!rawType.isArray()) {
            return false;
        }
        String name = rawType.getComponentType().getName();
        if (name.contains(".cglib")) {
            return name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib");
        }
        return false;
    }

    protected boolean _isGroovyMetaClassGetter(AnnotatedMethod annotatedMethod) {
        return annotatedMethod.getRawType().getName().startsWith("groovy.lang");
    }
}
