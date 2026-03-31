package com.kammoun.utils.jackson.databind.jsontype.impl;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.annotation.JsonTypeInfo;
import com.kammoun.utils.jackson.databind.DatabindContext;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import java.io.IOException;

public class MinimalClassNameIdResolver extends ClassNameIdResolver {
    private static final long serialVersionUID = 1;
    protected final String _basePackageName;
    protected final String _basePackagePrefix;

    protected MinimalClassNameIdResolver(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory, polymorphicTypeValidator);
        String name = javaType.getRawClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this._basePackageName = JsonProperty.USE_DEFAULT_NAME;
            this._basePackagePrefix = ".";
        } else {
            this._basePackagePrefix = name.substring(0, lastIndexOf + 1);
            this._basePackageName = name.substring(0, lastIndexOf);
        }
    }

    public static MinimalClassNameIdResolver construct(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new MinimalClassNameIdResolver(javaType, mapperConfig.getTypeFactory(), polymorphicTypeValidator);
    }

    @Override
    public JsonTypeInfo.Id getMechanism() {
        return JsonTypeInfo.Id.MINIMAL_CLASS;
    }

    @Override
    public String idFromValue(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this._basePackagePrefix) ? name.substring(this._basePackagePrefix.length() - 1) : name;
    }

    @Override
    public JavaType _typeFromId(String str, DatabindContext databindContext) throws IOException {
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder(str.length() + this._basePackageName.length());
            if (this._basePackageName.isEmpty()) {
                sb.append(str.substring(1));
            } else {
                sb.append(this._basePackageName).append(str);
            }
            str = sb.toString();
        }
        return super._typeFromId(str, databindContext);
    }
}
