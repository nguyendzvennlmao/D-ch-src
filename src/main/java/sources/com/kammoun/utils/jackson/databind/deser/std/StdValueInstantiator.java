package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.annotation.JacksonStdImpl;
import com.kammoun.utils.jackson.databind.deser.SettableBeanProperty;
import com.kammoun.utils.jackson.databind.deser.ValueInstantiator;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedWithParams;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;

@JacksonStdImpl
public class StdValueInstantiator extends ValueInstantiator implements Serializable {
    private static final long serialVersionUID = 1;
    protected final String _valueTypeDesc;
    protected final Class<?> _valueClass;
    protected AnnotatedWithParams _defaultCreator;
    protected AnnotatedWithParams _withArgsCreator;
    protected SettableBeanProperty[] _constructorArguments;
    protected JavaType _delegateType;
    protected AnnotatedWithParams _delegateCreator;
    protected SettableBeanProperty[] _delegateArguments;
    protected JavaType _arrayDelegateType;
    protected AnnotatedWithParams _arrayDelegateCreator;
    protected SettableBeanProperty[] _arrayDelegateArguments;
    protected AnnotatedWithParams _fromStringCreator;
    protected AnnotatedWithParams _fromIntCreator;
    protected AnnotatedWithParams _fromLongCreator;
    protected AnnotatedWithParams _fromBigIntegerCreator;
    protected AnnotatedWithParams _fromDoubleCreator;
    protected AnnotatedWithParams _fromBigDecimalCreator;
    protected AnnotatedWithParams _fromBooleanCreator;

    @Deprecated
    public StdValueInstantiator(DeserializationConfig deserializationConfig, Class<?> cls) {
        this._valueTypeDesc = ClassUtil.nameOf(cls);
        this._valueClass = cls == null ? Object.class : cls;
    }

    public StdValueInstantiator(DeserializationConfig deserializationConfig, JavaType javaType) {
        this._valueTypeDesc = javaType == null ? "UNKNOWN TYPE" : javaType.toString();
        this._valueClass = javaType == null ? Object.class : javaType.getRawClass();
    }

    protected StdValueInstantiator(StdValueInstantiator stdValueInstantiator) {
        this._valueTypeDesc = stdValueInstantiator._valueTypeDesc;
        this._valueClass = stdValueInstantiator._valueClass;
        this._defaultCreator = stdValueInstantiator._defaultCreator;
        this._constructorArguments = stdValueInstantiator._constructorArguments;
        this._withArgsCreator = stdValueInstantiator._withArgsCreator;
        this._delegateType = stdValueInstantiator._delegateType;
        this._delegateCreator = stdValueInstantiator._delegateCreator;
        this._delegateArguments = stdValueInstantiator._delegateArguments;
        this._arrayDelegateType = stdValueInstantiator._arrayDelegateType;
        this._arrayDelegateCreator = stdValueInstantiator._arrayDelegateCreator;
        this._arrayDelegateArguments = stdValueInstantiator._arrayDelegateArguments;
        this._fromStringCreator = stdValueInstantiator._fromStringCreator;
        this._fromIntCreator = stdValueInstantiator._fromIntCreator;
        this._fromLongCreator = stdValueInstantiator._fromLongCreator;
        this._fromBigIntegerCreator = stdValueInstantiator._fromBigIntegerCreator;
        this._fromDoubleCreator = stdValueInstantiator._fromDoubleCreator;
        this._fromBigDecimalCreator = stdValueInstantiator._fromBigDecimalCreator;
        this._fromBooleanCreator = stdValueInstantiator._fromBooleanCreator;
    }

    public void configureFromObjectSettings(AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr, AnnotatedWithParams annotatedWithParams3, SettableBeanProperty[] settableBeanPropertyArr2) {
        this._defaultCreator = annotatedWithParams;
        this._delegateCreator = annotatedWithParams2;
        this._delegateType = javaType;
        this._delegateArguments = settableBeanPropertyArr;
        this._withArgsCreator = annotatedWithParams3;
        this._constructorArguments = settableBeanPropertyArr2;
    }

    public void configureFromArraySettings(AnnotatedWithParams annotatedWithParams, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr) {
        this._arrayDelegateCreator = annotatedWithParams;
        this._arrayDelegateType = javaType;
        this._arrayDelegateArguments = settableBeanPropertyArr;
    }

    public void configureFromStringCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromStringCreator = annotatedWithParams;
    }

    public void configureFromIntCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromIntCreator = annotatedWithParams;
    }

    public void configureFromLongCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromLongCreator = annotatedWithParams;
    }

    public void configureFromBigIntegerCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromBigIntegerCreator = annotatedWithParams;
    }

    public void configureFromDoubleCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromDoubleCreator = annotatedWithParams;
    }

    public void configureFromBigDecimalCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromBigDecimalCreator = annotatedWithParams;
    }

    public void configureFromBooleanCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromBooleanCreator = annotatedWithParams;
    }

    @Override
    public String getValueTypeDesc() {
        return this._valueTypeDesc;
    }

    @Override
    public Class<?> getValueClass() {
        return this._valueClass;
    }

    @Override
    public boolean canCreateFromString() {
        return this._fromStringCreator != null;
    }

    @Override
    public boolean canCreateFromInt() {
        return this._fromIntCreator != null;
    }

    @Override
    public boolean canCreateFromLong() {
        return this._fromLongCreator != null;
    }

    @Override
    public boolean canCreateFromBigInteger() {
        return this._fromBigIntegerCreator != null;
    }

    @Override
    public boolean canCreateFromDouble() {
        return this._fromDoubleCreator != null;
    }

    @Override
    public boolean canCreateFromBigDecimal() {
        return this._fromBigDecimalCreator != null;
    }

    @Override
    public boolean canCreateFromBoolean() {
        return this._fromBooleanCreator != null;
    }

    @Override
    public boolean canCreateUsingDefault() {
        return this._defaultCreator != null;
    }

    @Override
    public boolean canCreateUsingDelegate() {
        return this._delegateType != null;
    }

    @Override
    public boolean canCreateUsingArrayDelegate() {
        return this._arrayDelegateType != null;
    }

    @Override
    public boolean canCreateFromObjectWith() {
        return this._withArgsCreator != null;
    }

    @Override
    public boolean canInstantiate() {
        return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
    }

    @Override
    public JavaType getDelegateType(DeserializationConfig deserializationConfig) {
        return this._delegateType;
    }

    @Override
    public JavaType getArrayDelegateType(DeserializationConfig deserializationConfig) {
        return this._arrayDelegateType;
    }

    @Override
    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        return this._constructorArguments;
    }

    @Override
    public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
        if (this._defaultCreator == null) {
            return super.createUsingDefault(deserializationContext);
        }
        try {
            return this._defaultCreator.call();
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this._valueClass, null, rewrapCtorProblem(deserializationContext, e));
        }
    }

    @Override
    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        if (this._withArgsCreator == null) {
            return super.createFromObjectWith(deserializationContext, objArr);
        }
        try {
            return this._withArgsCreator.call(objArr);
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this._valueClass, objArr, rewrapCtorProblem(deserializationContext, e));
        }
    }

    @Override
    public Object createUsingDefaultOrWithoutArguments(DeserializationContext deserializationContext) throws IOException {
        return this._defaultCreator != null ? createUsingDefault(deserializationContext) : this._withArgsCreator != null ? createFromObjectWith(deserializationContext, new Object[this._constructorArguments.length]) : super.createUsingDefaultOrWithoutArguments(deserializationContext);
    }

    @Override
    public Object createUsingDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        return (this._delegateCreator != null || this._arrayDelegateCreator == null) ? _createUsingDelegate(this._delegateCreator, this._delegateArguments, deserializationContext, obj) : _createUsingDelegate(this._arrayDelegateCreator, this._arrayDelegateArguments, deserializationContext, obj);
    }

    @Override
    public Object createUsingArrayDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        return (this._arrayDelegateCreator != null || this._delegateCreator == null) ? _createUsingDelegate(this._arrayDelegateCreator, this._arrayDelegateArguments, deserializationContext, obj) : createUsingDelegate(deserializationContext, obj);
    }

    @Override
    public Object createFromString(DeserializationContext deserializationContext, String str) throws IOException {
        if (this._fromStringCreator == null) {
            return super.createFromString(deserializationContext, str);
        }
        try {
            return this._fromStringCreator.call1(str);
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this._fromStringCreator.getDeclaringClass(), str, rewrapCtorProblem(deserializationContext, e));
        }
    }

    @Override
    public Object createFromInt(DeserializationContext deserializationContext, int i) throws IOException {
        if (this._fromIntCreator != null) {
            Integer valueOf = Integer.valueOf(i);
            try {
                return this._fromIntCreator.call1(valueOf);
            } catch (Exception e) {
                return deserializationContext.handleInstantiationProblem(this._fromIntCreator.getDeclaringClass(), valueOf, rewrapCtorProblem(deserializationContext, e));
            }
        }
        if (this._fromLongCreator != null) {
            Long valueOf2 = Long.valueOf(i);
            try {
                return this._fromLongCreator.call1(valueOf2);
            } catch (Exception e2) {
                return deserializationContext.handleInstantiationProblem(this._fromLongCreator.getDeclaringClass(), valueOf2, rewrapCtorProblem(deserializationContext, e2));
            }
        }
        if (this._fromBigIntegerCreator == null) {
            return super.createFromInt(deserializationContext, i);
        }
        BigInteger valueOf3 = BigInteger.valueOf(i);
        try {
            return this._fromBigIntegerCreator.call1(valueOf3);
        } catch (Exception e3) {
            return deserializationContext.handleInstantiationProblem(this._fromBigIntegerCreator.getDeclaringClass(), valueOf3, rewrapCtorProblem(deserializationContext, e3));
        }
    }

    @Override
    public Object createFromLong(DeserializationContext deserializationContext, long j) throws IOException {
        if (this._fromLongCreator != null) {
            Long valueOf = Long.valueOf(j);
            try {
                return this._fromLongCreator.call1(valueOf);
            } catch (Exception e) {
                return deserializationContext.handleInstantiationProblem(this._fromLongCreator.getDeclaringClass(), valueOf, rewrapCtorProblem(deserializationContext, e));
            }
        }
        if (this._fromBigIntegerCreator == null) {
            return super.createFromLong(deserializationContext, j);
        }
        BigInteger valueOf2 = BigInteger.valueOf(j);
        try {
            return this._fromBigIntegerCreator.call1(valueOf2);
        } catch (Exception e2) {
            return deserializationContext.handleInstantiationProblem(this._fromBigIntegerCreator.getDeclaringClass(), valueOf2, rewrapCtorProblem(deserializationContext, e2));
        }
    }

    @Override
    public Object createFromBigInteger(DeserializationContext deserializationContext, BigInteger bigInteger) throws IOException {
        if (this._fromBigIntegerCreator == null) {
            return super.createFromBigInteger(deserializationContext, bigInteger);
        }
        try {
            return this._fromBigIntegerCreator.call1(bigInteger);
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this._fromBigIntegerCreator.getDeclaringClass(), bigInteger, rewrapCtorProblem(deserializationContext, e));
        }
    }

    @Override
    public Object createFromDouble(DeserializationContext deserializationContext, double d) throws IOException {
        if (this._fromDoubleCreator != null) {
            Double valueOf = Double.valueOf(d);
            try {
                return this._fromDoubleCreator.call1(valueOf);
            } catch (Exception e) {
                return deserializationContext.handleInstantiationProblem(this._fromDoubleCreator.getDeclaringClass(), valueOf, rewrapCtorProblem(deserializationContext, e));
            }
        }
        if (this._fromBigDecimalCreator == null) {
            return super.createFromDouble(deserializationContext, d);
        }
        BigDecimal valueOf2 = BigDecimal.valueOf(d);
        try {
            return this._fromBigDecimalCreator.call1(valueOf2);
        } catch (Exception e2) {
            return deserializationContext.handleInstantiationProblem(this._fromBigDecimalCreator.getDeclaringClass(), valueOf2, rewrapCtorProblem(deserializationContext, e2));
        }
    }

    @Override
    public Object createFromBigDecimal(DeserializationContext deserializationContext, BigDecimal bigDecimal) throws IOException {
        Double tryConvertToDouble;
        if (this._fromBigDecimalCreator != null) {
            try {
                return this._fromBigDecimalCreator.call1(bigDecimal);
            } catch (Exception e) {
                return deserializationContext.handleInstantiationProblem(this._fromBigDecimalCreator.getDeclaringClass(), bigDecimal, rewrapCtorProblem(deserializationContext, e));
            }
        }
        if (this._fromDoubleCreator == null || (tryConvertToDouble = tryConvertToDouble(bigDecimal)) == null) {
            return super.createFromBigDecimal(deserializationContext, bigDecimal);
        }
        try {
            return this._fromDoubleCreator.call1(tryConvertToDouble);
        } catch (Exception e2) {
            return deserializationContext.handleInstantiationProblem(this._fromDoubleCreator.getDeclaringClass(), tryConvertToDouble, rewrapCtorProblem(deserializationContext, e2));
        }
    }

    static Double tryConvertToDouble(BigDecimal bigDecimal) {
        double doubleValue = bigDecimal.doubleValue();
        if (Double.isInfinite(doubleValue)) {
            return null;
        }
        return Double.valueOf(doubleValue);
    }

    @Override
    public Object createFromBoolean(DeserializationContext deserializationContext, boolean z) throws IOException {
        if (this._fromBooleanCreator == null) {
            return super.createFromBoolean(deserializationContext, z);
        }
        Boolean valueOf = Boolean.valueOf(z);
        try {
            return this._fromBooleanCreator.call1(valueOf);
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this._fromBooleanCreator.getDeclaringClass(), valueOf, rewrapCtorProblem(deserializationContext, e));
        }
    }

    @Override
    public AnnotatedWithParams getDelegateCreator() {
        return this._delegateCreator;
    }

    @Override
    public AnnotatedWithParams getArrayDelegateCreator() {
        return this._arrayDelegateCreator;
    }

    @Override
    public AnnotatedWithParams getDefaultCreator() {
        return this._defaultCreator;
    }

    @Override
    public AnnotatedWithParams getWithArgsCreator() {
        return this._withArgsCreator;
    }

    @Deprecated
    protected JsonMappingException wrapException(Throwable th) {
        Throwable th2 = th;
        while (true) {
            Throwable th3 = th2;
            if (th3 == null) {
                return new JsonMappingException((Closeable) null, "Instantiation of " + getValueTypeDesc() + " value failed: " + ClassUtil.exceptionMessage(th), th);
            }
            if (th3 instanceof JsonMappingException) {
                return (JsonMappingException) th3;
            }
            th2 = th3.getCause();
        }
    }

    @Deprecated
    protected JsonMappingException unwrapAndWrapException(DeserializationContext deserializationContext, Throwable th) {
        Throwable th2 = th;
        while (true) {
            Throwable th3 = th2;
            if (th3 == null) {
                return deserializationContext.instantiationException(getValueClass(), th);
            }
            if (th3 instanceof JsonMappingException) {
                return (JsonMappingException) th3;
            }
            th2 = th3.getCause();
        }
    }

    protected JsonMappingException wrapAsJsonMappingException(DeserializationContext deserializationContext, Throwable th) {
        return th instanceof JsonMappingException ? (JsonMappingException) th : deserializationContext.instantiationException(getValueClass(), th);
    }

    protected JsonMappingException rewrapCtorProblem(DeserializationContext deserializationContext, Throwable th) {
        Throwable cause;
        if (((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) && (cause = th.getCause()) != null) {
            th = cause;
        }
        return wrapAsJsonMappingException(deserializationContext, th);
    }

    private Object _createUsingDelegate(AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (annotatedWithParams == null) {
            throw new IllegalStateException("No delegate constructor for " + getValueTypeDesc());
        }
        try {
            if (settableBeanPropertyArr == null) {
                return annotatedWithParams.call1(obj);
            }
            int length = settableBeanPropertyArr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty == null) {
                    objArr[i] = obj;
                } else {
                    objArr[i] = deserializationContext.findInjectableValue(settableBeanProperty.getInjectableValueId(), settableBeanProperty, null);
                }
            }
            return annotatedWithParams.call(objArr);
        } catch (Exception e) {
            throw rewrapCtorProblem(deserializationContext, e);
        }
    }
}
