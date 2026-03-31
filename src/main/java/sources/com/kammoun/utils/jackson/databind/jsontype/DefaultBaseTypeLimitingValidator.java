package com.kammoun.utils.jackson.databind.jsontype;

import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class DefaultBaseTypeLimitingValidator extends PolymorphicTypeValidator implements Serializable {
    private static final long serialVersionUID = 1;

    public static final class UnsafeBaseTypes {
        public static final UnsafeBaseTypes instance = new UnsafeBaseTypes();
        private final Set<String> UNSAFE = new HashSet();

        private UnsafeBaseTypes() {
            this.UNSAFE.add(Object.class.getName());
            this.UNSAFE.add(Closeable.class.getName());
            this.UNSAFE.add(Serializable.class.getName());
            this.UNSAFE.add(AutoCloseable.class.getName());
            this.UNSAFE.add(Cloneable.class.getName());
            this.UNSAFE.add("java.util.logging.Handler");
            this.UNSAFE.add("javax.naming.Referenceable");
            this.UNSAFE.add("javax.sql.DataSource");
        }

        public boolean isUnsafeBaseType(Class<?> cls) {
            return this.UNSAFE.contains(cls.getName());
        }
    }

    @Override
    public PolymorphicTypeValidator.Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
        return isUnsafeBaseType(mapperConfig, javaType) ? PolymorphicTypeValidator.Validity.DENIED : PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override
    public PolymorphicTypeValidator.Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str) {
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override
    public PolymorphicTypeValidator.Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
        return isSafeSubType(mapperConfig, javaType, javaType2) ? PolymorphicTypeValidator.Validity.ALLOWED : PolymorphicTypeValidator.Validity.DENIED;
    }

    protected boolean isUnsafeBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
        return UnsafeBaseTypes.instance.isUnsafeBaseType(javaType.getRawClass());
    }

    protected boolean isSafeSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
        return true;
    }
}
