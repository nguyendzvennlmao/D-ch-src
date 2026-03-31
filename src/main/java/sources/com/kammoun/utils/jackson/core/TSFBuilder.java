package com.kammoun.utils.jackson.core;

import com.kammoun.utils.jackson.core.JsonFactory;
import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.TSFBuilder;
import com.kammoun.utils.jackson.core.io.InputDecorator;
import com.kammoun.utils.jackson.core.io.OutputDecorator;
import com.kammoun.utils.jackson.core.json.JsonReadFeature;
import com.kammoun.utils.jackson.core.json.JsonWriteFeature;
import com.kammoun.utils.jackson.core.util.BufferRecycler;
import com.kammoun.utils.jackson.core.util.JsonGeneratorDecorator;
import com.kammoun.utils.jackson.core.util.JsonRecyclerPools;
import com.kammoun.utils.jackson.core.util.RecyclerPool;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class TSFBuilder<F extends JsonFactory, B extends TSFBuilder<F, B>> {
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = JsonFactory.Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    protected int _factoryFeatures;
    protected int _streamReadFeatures;
    protected int _streamWriteFeatures;
    protected RecyclerPool<BufferRecycler> _recyclerPool;
    protected InputDecorator _inputDecorator;
    protected OutputDecorator _outputDecorator;
    protected StreamReadConstraints _streamReadConstraints;
    protected StreamWriteConstraints _streamWriteConstraints;
    protected ErrorReportConfiguration _errorReportConfiguration;
    protected List<JsonGeneratorDecorator> _generatorDecorators;

    public TSFBuilder() {
        this(DEFAULT_FACTORY_FEATURE_FLAGS, DEFAULT_PARSER_FEATURE_FLAGS, DEFAULT_GENERATOR_FEATURE_FLAGS);
    }

    public TSFBuilder(JsonFactory jsonFactory) {
        this(jsonFactory._factoryFeatures, jsonFactory._parserFeatures, jsonFactory._generatorFeatures);
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._streamReadConstraints = jsonFactory._streamReadConstraints;
        this._streamWriteConstraints = jsonFactory._streamWriteConstraints;
        this._errorReportConfiguration = jsonFactory._errorReportConfiguration;
        this._generatorDecorators = _copy(jsonFactory._generatorDecorators);
    }

    protected TSFBuilder(int i, int i2, int i3) {
        this._recyclerPool = JsonRecyclerPools.defaultPool();
        this._factoryFeatures = i;
        this._streamReadFeatures = i2;
        this._streamWriteFeatures = i3;
        this._inputDecorator = null;
        this._outputDecorator = null;
        this._streamReadConstraints = StreamReadConstraints.defaults();
        this._streamWriteConstraints = StreamWriteConstraints.defaults();
        this._errorReportConfiguration = ErrorReportConfiguration.defaults();
        this._generatorDecorators = null;
    }

    protected static <T> List<T> _copy(List<T> list) {
        return list == null ? list : new ArrayList(list);
    }

    public int factoryFeaturesMask() {
        return this._factoryFeatures;
    }

    public int streamReadFeatures() {
        return this._streamReadFeatures;
    }

    public int streamWriteFeatures() {
        return this._streamWriteFeatures;
    }

    public RecyclerPool<BufferRecycler> recyclerPool() {
        return this._recyclerPool;
    }

    public InputDecorator inputDecorator() {
        return this._inputDecorator;
    }

    public OutputDecorator outputDecorator() {
        return this._outputDecorator;
    }

    public B enable(JsonFactory.Feature feature) {
        this._factoryFeatures |= feature.getMask();
        return _this();
    }

    public B disable(JsonFactory.Feature feature) {
        this._factoryFeatures &= feature.getMask() ^ (-1);
        return _this();
    }

    public B configure(JsonFactory.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public B enable(StreamReadFeature streamReadFeature) {
        this._streamReadFeatures |= streamReadFeature.mappedFeature().getMask();
        return _this();
    }

    public B enable(StreamReadFeature streamReadFeature, StreamReadFeature... streamReadFeatureArr) {
        this._streamReadFeatures |= streamReadFeature.mappedFeature().getMask();
        for (StreamReadFeature streamReadFeature2 : streamReadFeatureArr) {
            this._streamReadFeatures |= streamReadFeature2.mappedFeature().getMask();
        }
        return _this();
    }

    public B disable(StreamReadFeature streamReadFeature) {
        this._streamReadFeatures &= streamReadFeature.mappedFeature().getMask() ^ (-1);
        return _this();
    }

    public B disable(StreamReadFeature streamReadFeature, StreamReadFeature... streamReadFeatureArr) {
        this._streamReadFeatures &= streamReadFeature.mappedFeature().getMask() ^ (-1);
        for (StreamReadFeature streamReadFeature2 : streamReadFeatureArr) {
            this._streamReadFeatures &= streamReadFeature2.mappedFeature().getMask() ^ (-1);
        }
        return _this();
    }

    public B configure(StreamReadFeature streamReadFeature, boolean z) {
        return z ? enable(streamReadFeature) : disable(streamReadFeature);
    }

    public B enable(StreamWriteFeature streamWriteFeature) {
        this._streamWriteFeatures |= streamWriteFeature.mappedFeature().getMask();
        return _this();
    }

    public B enable(StreamWriteFeature streamWriteFeature, StreamWriteFeature... streamWriteFeatureArr) {
        this._streamWriteFeatures |= streamWriteFeature.mappedFeature().getMask();
        for (StreamWriteFeature streamWriteFeature2 : streamWriteFeatureArr) {
            this._streamWriteFeatures |= streamWriteFeature2.mappedFeature().getMask();
        }
        return _this();
    }

    public B disable(StreamWriteFeature streamWriteFeature) {
        this._streamWriteFeatures &= streamWriteFeature.mappedFeature().getMask() ^ (-1);
        return _this();
    }

    public B disable(StreamWriteFeature streamWriteFeature, StreamWriteFeature... streamWriteFeatureArr) {
        this._streamWriteFeatures &= streamWriteFeature.mappedFeature().getMask() ^ (-1);
        for (StreamWriteFeature streamWriteFeature2 : streamWriteFeatureArr) {
            this._streamWriteFeatures &= streamWriteFeature2.mappedFeature().getMask() ^ (-1);
        }
        return _this();
    }

    public B configure(StreamWriteFeature streamWriteFeature, boolean z) {
        return z ? enable(streamWriteFeature) : disable(streamWriteFeature);
    }

    public B enable(JsonReadFeature jsonReadFeature) {
        return _failNonJSON(jsonReadFeature);
    }

    public B enable(JsonReadFeature jsonReadFeature, JsonReadFeature... jsonReadFeatureArr) {
        return _failNonJSON(jsonReadFeature);
    }

    public B disable(JsonReadFeature jsonReadFeature) {
        return _failNonJSON(jsonReadFeature);
    }

    public B disable(JsonReadFeature jsonReadFeature, JsonReadFeature... jsonReadFeatureArr) {
        return _failNonJSON(jsonReadFeature);
    }

    public B configure(JsonReadFeature jsonReadFeature, boolean z) {
        return _failNonJSON(jsonReadFeature);
    }

    private B _failNonJSON(Object obj) {
        throw new IllegalArgumentException("Feature " + obj.getClass().getName() + "#" + obj.toString() + " not supported for non-JSON backend");
    }

    public B enable(JsonWriteFeature jsonWriteFeature) {
        return _failNonJSON(jsonWriteFeature);
    }

    public B enable(JsonWriteFeature jsonWriteFeature, JsonWriteFeature... jsonWriteFeatureArr) {
        return _failNonJSON(jsonWriteFeature);
    }

    public B disable(JsonWriteFeature jsonWriteFeature) {
        return _failNonJSON(jsonWriteFeature);
    }

    public B disable(JsonWriteFeature jsonWriteFeature, JsonWriteFeature... jsonWriteFeatureArr) {
        return _failNonJSON(jsonWriteFeature);
    }

    public B configure(JsonWriteFeature jsonWriteFeature, boolean z) {
        return _failNonJSON(jsonWriteFeature);
    }

    public B recyclerPool(RecyclerPool<BufferRecycler> recyclerPool) {
        this._recyclerPool = (RecyclerPool) Objects.requireNonNull(recyclerPool);
        return _this();
    }

    public B inputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return _this();
    }

    public B outputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return _this();
    }

    public B addDecorator(JsonGeneratorDecorator jsonGeneratorDecorator) {
        if (this._generatorDecorators == null) {
            this._generatorDecorators = new ArrayList();
        }
        this._generatorDecorators.add(jsonGeneratorDecorator);
        return _this();
    }

    public B streamReadConstraints(StreamReadConstraints streamReadConstraints) {
        this._streamReadConstraints = (StreamReadConstraints) Objects.requireNonNull(streamReadConstraints);
        return _this();
    }

    public B streamWriteConstraints(StreamWriteConstraints streamWriteConstraints) {
        this._streamWriteConstraints = (StreamWriteConstraints) Objects.requireNonNull(streamWriteConstraints);
        return _this();
    }

    public B errorReportConfiguration(ErrorReportConfiguration errorReportConfiguration) {
        this._errorReportConfiguration = (ErrorReportConfiguration) Objects.requireNonNull(errorReportConfiguration);
        return _this();
    }

    public abstract F build();

    protected final B _this() {
        return this;
    }

    public void _legacyEnable(JsonParser.Feature feature) {
        if (feature != null) {
            this._streamReadFeatures |= feature.getMask();
        }
    }

    public void _legacyDisable(JsonParser.Feature feature) {
        if (feature != null) {
            this._streamReadFeatures &= feature.getMask() ^ (-1);
        }
    }

    public void _legacyEnable(JsonGenerator.Feature feature) {
        if (feature != null) {
            this._streamWriteFeatures |= feature.getMask();
        }
    }

    public void _legacyDisable(JsonGenerator.Feature feature) {
        if (feature != null) {
            this._streamWriteFeatures &= feature.getMask() ^ (-1);
        }
    }
}
