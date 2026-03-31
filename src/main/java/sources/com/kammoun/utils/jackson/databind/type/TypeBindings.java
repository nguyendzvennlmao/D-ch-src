package com.kammoun.utils.jackson.databind.type;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TypeBindings implements Serializable {
    private static final long serialVersionUID = 1;
    private static final String[] NO_STRINGS = new String[0];
    private static final JavaType[] NO_TYPES = new JavaType[0];
    private static final TypeBindings EMPTY = new TypeBindings(NO_STRINGS, NO_TYPES, null);
    private final String[] _names;
    private final JavaType[] _types;
    private final String[] _unboundVariables;
    private final int _hashCode;

    static final class AsKey {
        private final Class<?> _raw;
        private final JavaType[] _params;
        private final int _hash;

        public AsKey(Class<?> cls, JavaType[] javaTypeArr, int i) {
            this._raw = cls;
            this._params = javaTypeArr;
            this._hash = (31 * cls.hashCode()) + i;
        }

        public int hashCode() {
            return this._hash;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            AsKey asKey = (AsKey) obj;
            if (this._hash != asKey._hash || this._raw != asKey._raw) {
                return false;
            }
            JavaType[] javaTypeArr = asKey._params;
            int length = this._params.length;
            if (length != javaTypeArr.length) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                if (!Objects.equals(this._params[i], javaTypeArr[i])) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return this._raw.getName() + "<>";
        }
    }

    public static class TypeParamStash {
        private static final TypeVariable<?>[] VARS_ABSTRACT_LIST = AbstractList.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_COLLECTION = Collection.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_ITERABLE = Iterable.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_LIST = List.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_ARRAY_LIST = ArrayList.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_MAP = Map.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_HASH_MAP = HashMap.class.getTypeParameters();
        private static final TypeVariable<?>[] VARS_LINKED_HASH_MAP = LinkedHashMap.class.getTypeParameters();

        TypeParamStash() {
        }

        public static TypeVariable<?>[] paramsFor1(Class<?> cls) {
            return cls == Collection.class ? VARS_COLLECTION : cls == List.class ? VARS_LIST : cls == ArrayList.class ? VARS_ARRAY_LIST : cls == AbstractList.class ? VARS_ABSTRACT_LIST : cls == Iterable.class ? VARS_ITERABLE : cls.getTypeParameters();
        }

        public static TypeVariable<?>[] paramsFor2(Class<?> cls) {
            return cls == Map.class ? VARS_MAP : cls == HashMap.class ? VARS_HASH_MAP : cls == LinkedHashMap.class ? VARS_LINKED_HASH_MAP : cls.getTypeParameters();
        }
    }

    private TypeBindings(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        this._names = strArr == null ? NO_STRINGS : strArr;
        this._types = javaTypeArr == null ? NO_TYPES : javaTypeArr;
        if (this._names.length != this._types.length) {
            throw new IllegalArgumentException("Mismatching names (" + this._names.length + "), types (" + this._types.length + ")");
        }
        this._unboundVariables = strArr2;
        this._hashCode = Arrays.hashCode(this._types);
    }

    public static TypeBindings emptyBindings() {
        return EMPTY;
    }

    protected Object readResolve() {
        return (this._names == null || this._names.length == 0) ? EMPTY : this;
    }

    public static TypeBindings create(Class<?> cls, List<JavaType> list) {
        return create(cls, (list == null || list.isEmpty()) ? NO_TYPES : (JavaType[]) list.toArray(NO_TYPES));
    }

    public static TypeBindings create(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr != null) {
            switch (javaTypeArr.length) {
                case 1:
                    return create(cls, javaTypeArr[0]);
                case 2:
                    return create(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        javaTypeArr = NO_TYPES;
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = NO_STRINGS;
        } else {
            int length = typeParameters.length;
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        }
        if (strArr.length != javaTypeArr.length) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with " + javaTypeArr.length + " type parameter" + (javaTypeArr.length == 1 ? JsonProperty.USE_DEFAULT_NAME : "s") + ": class expects " + strArr.length);
        }
        return new TypeBindings(strArr, javaTypeArr, null);
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType) {
        TypeVariable<?>[] paramsFor1 = TypeParamStash.paramsFor1(cls);
        int length = paramsFor1 == null ? 0 : paramsFor1.length;
        if (length != 1) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
        }
        return new TypeBindings(new String[]{paramsFor1[0].getName()}, new JavaType[]{javaType}, null);
    }

    public static TypeBindings create(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeVariable<?>[] paramsFor2 = TypeParamStash.paramsFor2(cls);
        int length = paramsFor2 == null ? 0 : paramsFor2.length;
        if (length != 2) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
        }
        return new TypeBindings(new String[]{paramsFor2[0].getName(), paramsFor2[1].getName()}, new JavaType[]{javaType, javaType2}, null);
    }

    public static TypeBindings create(List<String> list, List<JavaType> list2) {
        return (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) ? EMPTY : new TypeBindings((String[]) list.toArray(NO_STRINGS), (JavaType[]) list2.toArray(NO_TYPES), null);
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType javaType) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return EMPTY;
        }
        if (length != 1) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
        }
        return new TypeBindings(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
    }

    public static TypeBindings createIfNeeded(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            return EMPTY;
        }
        if (javaTypeArr == null) {
            javaTypeArr = NO_TYPES;
        }
        int length = typeParameters.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = typeParameters[i].getName();
        }
        if (strArr.length != javaTypeArr.length) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with " + javaTypeArr.length + " type parameter" + (javaTypeArr.length == 1 ? JsonProperty.USE_DEFAULT_NAME : "s") + ": class expects " + strArr.length);
        }
        return new TypeBindings(strArr, javaTypeArr, null);
    }

    public TypeBindings withUnboundVariable(String str) {
        int length = this._unboundVariables == null ? 0 : this._unboundVariables.length;
        String[] strArr = length == 0 ? new String[1] : (String[]) Arrays.copyOf(this._unboundVariables, length + 1);
        strArr[length] = str;
        return new TypeBindings(this._names, this._types, strArr);
    }

    public TypeBindings withoutVariable(String str) {
        int indexOf = Arrays.asList(this._names).indexOf(str);
        if (indexOf == -1) {
            return this;
        }
        JavaType[] javaTypeArr = (JavaType[]) this._types.clone();
        javaTypeArr[indexOf] = null;
        return new TypeBindings(this._names, javaTypeArr, this._unboundVariables);
    }

    public JavaType findBoundType(String str) {
        JavaType selfReferencedType;
        int length = this._names.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(this._names[i])) {
                JavaType javaType = this._types[i];
                if ((javaType instanceof ResolvedRecursiveType) && (selfReferencedType = ((ResolvedRecursiveType) javaType).getSelfReferencedType()) != null) {
                    javaType = selfReferencedType;
                }
                return javaType;
            }
        }
        return null;
    }

    private boolean invalidCacheKey() {
        for (JavaType javaType : this._types) {
            if (javaType instanceof IdentityEqualityType) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return this._types.length == 0;
    }

    public int size() {
        return this._types.length;
    }

    public String getBoundName(int i) {
        if (i < 0 || i >= this._names.length) {
            return null;
        }
        return this._names[i];
    }

    public JavaType getBoundType(int i) {
        if (i < 0 || i >= this._types.length) {
            return null;
        }
        JavaType javaType = this._types[i];
        if (javaType == null) {
            javaType = TypeFactory.unknownType();
        }
        return javaType;
    }

    public JavaType getBoundTypeOrNull(int i) {
        if (i < 0 || i >= this._types.length) {
            return null;
        }
        return this._types[i];
    }

    public List<JavaType> getTypeParameters() {
        if (this._types.length == 0) {
            return Collections.emptyList();
        }
        List<JavaType> asList = Arrays.asList(this._types);
        if (asList.contains(null)) {
            asList = new ArrayList(asList);
            for (int i = 0; i < asList.size(); i++) {
                if (asList.get(i) == null) {
                    asList.set(i, TypeFactory.unknownType());
                }
            }
        }
        return asList;
    }

    public boolean hasUnbound(String str) {
        if (this._unboundVariables == null) {
            return false;
        }
        int length = this._unboundVariables.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(this._unboundVariables[length]));
        return true;
    }

    public Object asKey(Class<?> cls) {
        if (invalidCacheKey()) {
            return null;
        }
        return new AsKey(cls, this._types, this._hashCode);
    }

    public String toString() {
        if (this._types.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int length = this._types.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            JavaType javaType = this._types[i];
            if (javaType == null) {
                sb.append("?");
            } else {
                sb.append(javaType.getGenericSignature());
            }
        }
        sb.append('>');
        return sb.toString();
    }

    public int hashCode() {
        return this._hashCode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        TypeBindings typeBindings = (TypeBindings) obj;
        return this._hashCode == typeBindings._hashCode && Arrays.equals(this._types, typeBindings._types);
    }

    public JavaType[] typeParameterArray() {
        return this._types;
    }
}
