package com.kammoun.utils.jackson.databind.introspect;

import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.type.TypeBindings;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

public interface TypeResolutionContext {

    public static class Basic implements TypeResolutionContext {
        private final TypeFactory _typeFactory;
        private final TypeBindings _bindings;

        public Basic(TypeFactory typeFactory, TypeBindings typeBindings) {
            this._typeFactory = typeFactory;
            this._bindings = typeBindings;
        }

        @Override
        public JavaType resolveType(Type type) {
            return this._typeFactory.resolveMemberType(type, this._bindings);
        }
    }

    public static class Empty implements TypeResolutionContext {
        private final TypeFactory _typeFactory;

        public Empty(TypeFactory typeFactory) {
            this._typeFactory = typeFactory;
        }

        @Override
        public JavaType resolveType(Type type) {
            return this._typeFactory.constructType(type);
        }
    }

    JavaType resolveType(Type type);
}
