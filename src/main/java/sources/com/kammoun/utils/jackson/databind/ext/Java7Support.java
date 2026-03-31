package com.kammoun.utils.jackson.databind.ext;

import com.kammoun.utils.jackson.databind.PropertyName;
import com.kammoun.utils.jackson.databind.introspect.Annotated;
import com.kammoun.utils.jackson.databind.introspect.AnnotatedParameter;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import com.kammoun.utils.jackson.databind.util.ExceptionUtil;

public abstract class Java7Support {
    private static final Java7Support IMPL;

    public static Java7Support instance() {
        return IMPL;
    }

    public abstract Boolean findTransient(Annotated annotated);

    public abstract Boolean hasCreatorAnnotation(Annotated annotated);

    public abstract PropertyName findConstructorName(AnnotatedParameter annotatedParameter);

    static {
        Java7Support java7Support = null;
        try {
            java7Support = (Java7Support) ClassUtil.createInstance(Class.forName("com.kammoun.utils.jackson.databind.ext.Java7SupportImpl"), false);
        } catch (IllegalAccessError e) {
        } catch (Throwable th) {
            ExceptionUtil.rethrowIfFatal(th);
        }
        IMPL = java7Support;
    }
}
