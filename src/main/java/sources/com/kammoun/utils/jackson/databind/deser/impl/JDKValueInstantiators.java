package com.kammoun.utils.jackson.databind.deser.impl;

import com.kammoun.utils.jackson.core.JsonLocation;
import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.deser.ValueInstantiator;
import com.kammoun.utils.jackson.databind.deser.std.JsonLocationInstantiator;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public abstract class JDKValueInstantiators {

    private static class ArrayListInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;
        static final ArrayListInstantiator INSTANCE = new ArrayListInstantiator();

        public ArrayListInstantiator() {
            super(ArrayList.class);
        }

        @Override
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new ArrayList();
        }
    }

    private static class ConcurrentHashMapInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;

        public ConcurrentHashMapInstantiator() {
            super(ConcurrentHashMap.class);
        }

        @Override
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new ConcurrentHashMap();
        }
    }

    private static class ConstantValueInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;
        protected final Object _value;

        public ConstantValueInstantiator(Object obj) {
            super(obj.getClass());
            this._value = obj;
        }

        @Override
        public final Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return this._value;
        }
    }

    private static class HashMapInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;
        static final HashMapInstantiator INSTANCE = new HashMapInstantiator();

        public HashMapInstantiator() {
            super(HashMap.class);
        }

        @Override
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new HashMap();
        }
    }

    private static class HashSetInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;
        static final HashSetInstantiator INSTANCE = new HashSetInstantiator();

        public HashSetInstantiator() {
            super(HashSet.class);
        }

        @Override
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new HashSet();
        }
    }

    private static abstract class JDKValueInstantiator extends ValueInstantiator.Base implements Serializable {
        private static final long serialVersionUID = 2;

        public JDKValueInstantiator(Class<?> cls) {
            super(cls);
        }

        @Override
        public final boolean canInstantiate() {
            return true;
        }

        @Override
        public final boolean canCreateUsingDefault() {
            return true;
        }

        @Override
        public abstract Object createUsingDefault(DeserializationContext deserializationContext) throws IOException;
    }

    private static class LinkedHashMapInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;
        static final LinkedHashMapInstantiator INSTANCE = new LinkedHashMapInstantiator();

        public LinkedHashMapInstantiator() {
            super(LinkedHashMap.class);
        }

        @Override
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new LinkedHashMap();
        }
    }

    private static class LinkedListInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;

        public LinkedListInstantiator() {
            super(LinkedList.class);
        }

        @Override
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new LinkedList();
        }
    }

    private static class TreeMapInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;

        public TreeMapInstantiator() {
            super(TreeMap.class);
        }

        @Override
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new TreeMap();
        }
    }

    private static class TreeSetInstantiator extends JDKValueInstantiator {
        private static final long serialVersionUID = 2;

        public TreeSetInstantiator() {
            super(TreeSet.class);
        }

        @Override
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new TreeSet();
        }
    }

    public static ValueInstantiator findStdValueInstantiator(DeserializationConfig deserializationConfig, Class<?> cls) {
        if (cls == JsonLocation.class) {
            return new JsonLocationInstantiator();
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls == ArrayList.class) {
                return ArrayListInstantiator.INSTANCE;
            }
            if (cls == HashSet.class) {
                return HashSetInstantiator.INSTANCE;
            }
            if (cls == LinkedList.class) {
                return new LinkedListInstantiator();
            }
            if (cls == TreeSet.class) {
                return new TreeSetInstantiator();
            }
            if (cls == Collections.emptySet().getClass()) {
                return new ConstantValueInstantiator(Collections.emptySet());
            }
            if (cls == Collections.emptyList().getClass()) {
                return new ConstantValueInstantiator(Collections.emptyList());
            }
            return null;
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (cls == LinkedHashMap.class) {
            return LinkedHashMapInstantiator.INSTANCE;
        }
        if (cls == HashMap.class) {
            return HashMapInstantiator.INSTANCE;
        }
        if (cls == ConcurrentHashMap.class) {
            return new ConcurrentHashMapInstantiator();
        }
        if (cls == TreeMap.class) {
            return new TreeMapInstantiator();
        }
        if (cls == Collections.emptyMap().getClass()) {
            return new ConstantValueInstantiator(Collections.emptyMap());
        }
        return null;
    }
}
