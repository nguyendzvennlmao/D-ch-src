package com.kammoun.utils.jackson.databind.type;

import com.kammoun.utils.jackson.databind.JavaType;
import java.util.ArrayList;
import java.util.Iterator;

public final class ClassStack {
    protected final ClassStack _parent;
    protected final Class<?> _current;
    private ArrayList<ResolvedRecursiveType> _selfRefs;

    public ClassStack(Class<?> cls) {
        this(null, cls);
    }

    private ClassStack(ClassStack classStack, Class<?> cls) {
        this._parent = classStack;
        this._current = cls;
    }

    public ClassStack child(Class<?> cls) {
        return new ClassStack(this, cls);
    }

    public void addSelfReference(ResolvedRecursiveType resolvedRecursiveType) {
        if (this._selfRefs == null) {
            this._selfRefs = new ArrayList<>();
        }
        this._selfRefs.add(resolvedRecursiveType);
    }

    public void resolveSelfReferences(JavaType javaType) {
        if (this._selfRefs != null) {
            Iterator<ResolvedRecursiveType> it = this._selfRefs.iterator();
            while (it.hasNext()) {
                it.next().setReference(javaType);
            }
        }
    }

    public ClassStack find(Class<?> cls) {
        if (this._current == cls) {
            return this;
        }
        ClassStack classStack = this._parent;
        while (true) {
            ClassStack classStack2 = classStack;
            if (classStack2 == null) {
                return null;
            }
            if (classStack2._current == cls) {
                return classStack2;
            }
            classStack = classStack2._parent;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ClassStack (self-refs: ").append(this._selfRefs == null ? "0" : String.valueOf(this._selfRefs.size())).append(')');
        ClassStack classStack = this;
        while (true) {
            ClassStack classStack2 = classStack;
            if (classStack2 == null) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(' ').append(classStack2._current.getName());
            classStack = classStack2._parent;
        }
    }
}
