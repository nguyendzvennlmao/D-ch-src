package com.kammoun.utils.jackson.databind.jsontype.impl;

import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;
import com.kammoun.utils.jackson.databind.jsontype.PolymorphicTypeValidator;

public final class LaissezFaireSubTypeValidator extends PolymorphicTypeValidator.Base {
    private static final long serialVersionUID = 1;
    public static final LaissezFaireSubTypeValidator instance = new LaissezFaireSubTypeValidator();

    @Override
    public PolymorphicTypeValidator.Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    @Override
    public PolymorphicTypeValidator.Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str) {
        return PolymorphicTypeValidator.Validity.ALLOWED;
    }

    @Override
    public PolymorphicTypeValidator.Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
        return PolymorphicTypeValidator.Validity.ALLOWED;
    }
}
