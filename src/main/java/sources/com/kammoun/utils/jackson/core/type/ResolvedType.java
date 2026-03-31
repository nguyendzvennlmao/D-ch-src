package com.kammoun.utils.jackson.core.type;

public abstract class ResolvedType {
    public abstract Class<?> getRawClass();

    public abstract boolean hasRawClass(Class<?> cls);

    public abstract boolean isAbstract();

    public abstract boolean isConcrete();

    public abstract boolean isThrowable();

    public abstract boolean isArrayType();

    public abstract boolean isEnumType();

    public abstract boolean isInterface();

    public abstract boolean isPrimitive();

    public abstract boolean isFinal();

    public abstract boolean isContainerType();

    public abstract boolean isCollectionLikeType();

    public boolean isReferenceType() {
        return getReferencedType() != null;
    }

    public abstract boolean isMapLikeType();

    public abstract boolean hasGenericTypes();

    @Deprecated
    public Class<?> getParameterSource() {
        return null;
    }

    public abstract ResolvedType getKeyType();

    public abstract ResolvedType getContentType();

    public abstract ResolvedType getReferencedType();

    public abstract int containedTypeCount();

    public abstract ResolvedType containedType(int i);

    public abstract String containedTypeName(int i);

    public abstract String toCanonical();
}
