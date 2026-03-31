package com.kammoun.utils.jackson.databind.json;

import com.kammoun.utils.jackson.core.JsonFactory;
import com.kammoun.utils.jackson.core.Version;
import com.kammoun.utils.jackson.core.json.JsonReadFeature;
import com.kammoun.utils.jackson.core.json.JsonWriteFeature;
import com.kammoun.utils.jackson.databind.ObjectMapper;
import com.kammoun.utils.jackson.databind.cfg.MapperBuilder;
import com.kammoun.utils.jackson.databind.cfg.PackageVersion;

public class JsonMapper extends ObjectMapper {
    private static final long serialVersionUID = 1;

    public static class Builder extends MapperBuilder<JsonMapper, Builder> {
        public Builder(JsonMapper jsonMapper) {
            super(jsonMapper);
        }

        public Builder enable(JsonReadFeature... jsonReadFeatureArr) {
            for (JsonReadFeature jsonReadFeature : jsonReadFeatureArr) {
                ((JsonMapper) this._mapper).enable(jsonReadFeature.mappedFeature());
            }
            return this;
        }

        public Builder disable(JsonReadFeature... jsonReadFeatureArr) {
            for (JsonReadFeature jsonReadFeature : jsonReadFeatureArr) {
                ((JsonMapper) this._mapper).disable(jsonReadFeature.mappedFeature());
            }
            return this;
        }

        public Builder configure(JsonReadFeature jsonReadFeature, boolean z) {
            if (z) {
                ((JsonMapper) this._mapper).enable(jsonReadFeature.mappedFeature());
            } else {
                ((JsonMapper) this._mapper).disable(jsonReadFeature.mappedFeature());
            }
            return this;
        }

        public Builder enable(JsonWriteFeature... jsonWriteFeatureArr) {
            for (JsonWriteFeature jsonWriteFeature : jsonWriteFeatureArr) {
                ((JsonMapper) this._mapper).enable(jsonWriteFeature.mappedFeature());
            }
            return this;
        }

        public Builder disable(JsonWriteFeature... jsonWriteFeatureArr) {
            for (JsonWriteFeature jsonWriteFeature : jsonWriteFeatureArr) {
                ((JsonMapper) this._mapper).disable(jsonWriteFeature.mappedFeature());
            }
            return this;
        }

        public Builder configure(JsonWriteFeature jsonWriteFeature, boolean z) {
            if (z) {
                ((JsonMapper) this._mapper).enable(jsonWriteFeature.mappedFeature());
            } else {
                ((JsonMapper) this._mapper).disable(jsonWriteFeature.mappedFeature());
            }
            return this;
        }
    }

    public JsonMapper() {
        this(new JsonFactory());
    }

    public JsonMapper(JsonFactory jsonFactory) {
        super(jsonFactory);
    }

    protected JsonMapper(JsonMapper jsonMapper) {
        super(jsonMapper);
    }

    @Override
    public JsonMapper copy() {
        _checkInvalidCopy(JsonMapper.class);
        return new JsonMapper(this);
    }

    public static Builder builder() {
        return new Builder(new JsonMapper());
    }

    public static Builder builder(JsonFactory jsonFactory) {
        return new Builder(new JsonMapper(jsonFactory));
    }

    public Builder rebuild() {
        return new Builder(copy());
    }

    @Override
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Override
    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public boolean isEnabled(JsonReadFeature jsonReadFeature) {
        return isEnabled(jsonReadFeature.mappedFeature());
    }

    public boolean isEnabled(JsonWriteFeature jsonWriteFeature) {
        return isEnabled(jsonWriteFeature.mappedFeature());
    }
}
