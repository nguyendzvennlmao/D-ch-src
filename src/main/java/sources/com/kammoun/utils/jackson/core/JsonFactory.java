package com.kammoun.utils.jackson.core;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.format.InputAccessor;
import com.kammoun.utils.jackson.core.format.MatchStrength;
import com.kammoun.utils.jackson.core.io.CharacterEscapes;
import com.kammoun.utils.jackson.core.io.ContentReference;
import com.kammoun.utils.jackson.core.io.IOContext;
import com.kammoun.utils.jackson.core.io.InputDecorator;
import com.kammoun.utils.jackson.core.io.OutputDecorator;
import com.kammoun.utils.jackson.core.io.SerializedString;
import com.kammoun.utils.jackson.core.io.UTF8Writer;
import com.kammoun.utils.jackson.core.json.ByteSourceJsonBootstrapper;
import com.kammoun.utils.jackson.core.json.PackageVersion;
import com.kammoun.utils.jackson.core.json.ReaderBasedJsonParser;
import com.kammoun.utils.jackson.core.json.UTF8DataInputJsonParser;
import com.kammoun.utils.jackson.core.json.UTF8JsonGenerator;
import com.kammoun.utils.jackson.core.json.WriterBasedJsonGenerator;
import com.kammoun.utils.jackson.core.json.async.NonBlockingByteBufferJsonParser;
import com.kammoun.utils.jackson.core.json.async.NonBlockingJsonParser;
import com.kammoun.utils.jackson.core.sym.ByteQuadsCanonicalizer;
import com.kammoun.utils.jackson.core.sym.CharsToNameCanonicalizer;
import com.kammoun.utils.jackson.core.util.BufferRecycler;
import com.kammoun.utils.jackson.core.util.JacksonFeature;
import com.kammoun.utils.jackson.core.util.JsonGeneratorDecorator;
import com.kammoun.utils.jackson.core.util.JsonRecyclerPools;
import com.kammoun.utils.jackson.core.util.RecyclerPool;
import java.io.CharArrayReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class JsonFactory extends TokenStreamFactory implements Serializable {
    private static final long serialVersionUID = 2;
    public static final String FORMAT_NAME_JSON = "JSON";
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    public static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
    public static final char DEFAULT_QUOTE_CHAR = '\"';
    protected transient CharsToNameCanonicalizer _rootCharSymbols;
    protected final transient ByteQuadsCanonicalizer _byteSymbolCanonicalizer;
    protected int _factoryFeatures;
    protected int _parserFeatures;
    protected int _generatorFeatures;
    protected RecyclerPool<BufferRecycler> _recyclerPool;
    protected ObjectCodec _objectCodec;
    protected CharacterEscapes _characterEscapes;
    protected StreamReadConstraints _streamReadConstraints;
    protected ErrorReportConfiguration _errorReportConfiguration;
    protected StreamWriteConstraints _streamWriteConstraints;
    protected InputDecorator _inputDecorator;
    protected OutputDecorator _outputDecorator;
    protected final List<JsonGeneratorDecorator> _generatorDecorators;
    protected SerializableString _rootValueSeparator;
    protected int _maximumNonEscapedChar;
    protected final char _quoteChar;

    public enum Feature implements JacksonFeature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true),
        CHARSET_DETECTION(true);

        private final boolean _defaultState;

        public static int collectDefaults() {
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        Feature(boolean z) {
            this._defaultState = z;
        }

        @Override
        public boolean enabledByDefault() {
            return this._defaultState;
        }

        @Override
        public boolean enabledIn(int i) {
            return (i & getMask()) != 0;
        }

        @Override
        public int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this((ObjectCodec) null);
    }

    public JsonFactory(ObjectCodec objectCodec) {
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._recyclerPool = JsonRecyclerPools.defaultPool();
        this._objectCodec = objectCodec;
        this._quoteChar = '\"';
        this._streamReadConstraints = StreamReadConstraints.defaults();
        this._streamWriteConstraints = StreamWriteConstraints.defaults();
        this._errorReportConfiguration = ErrorReportConfiguration.defaults();
        this._generatorDecorators = null;
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot(this);
    }

    public JsonFactory(JsonFactory jsonFactory, ObjectCodec objectCodec) {
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._recyclerPool = jsonFactory._recyclerPool;
        this._objectCodec = objectCodec;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._generatorDecorators = _copy(jsonFactory._generatorDecorators);
        this._streamReadConstraints = (StreamReadConstraints) Objects.requireNonNull(jsonFactory._streamReadConstraints);
        this._streamWriteConstraints = (StreamWriteConstraints) Objects.requireNonNull(jsonFactory._streamWriteConstraints);
        this._errorReportConfiguration = (ErrorReportConfiguration) Objects.requireNonNull(jsonFactory._errorReportConfiguration);
        this._characterEscapes = jsonFactory._characterEscapes;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactory._maximumNonEscapedChar;
        this._quoteChar = jsonFactory._quoteChar;
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot(this);
    }

    public JsonFactory(JsonFactoryBuilder jsonFactoryBuilder) {
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._recyclerPool = jsonFactoryBuilder._recyclerPool;
        this._objectCodec = null;
        this._factoryFeatures = jsonFactoryBuilder._factoryFeatures;
        this._parserFeatures = jsonFactoryBuilder._streamReadFeatures;
        this._generatorFeatures = jsonFactoryBuilder._streamWriteFeatures;
        this._inputDecorator = jsonFactoryBuilder._inputDecorator;
        this._outputDecorator = jsonFactoryBuilder._outputDecorator;
        this._generatorDecorators = _copy(jsonFactoryBuilder._generatorDecorators);
        this._streamReadConstraints = (StreamReadConstraints) Objects.requireNonNull(jsonFactoryBuilder._streamReadConstraints);
        this._streamWriteConstraints = (StreamWriteConstraints) Objects.requireNonNull(jsonFactoryBuilder._streamWriteConstraints);
        this._errorReportConfiguration = (ErrorReportConfiguration) Objects.requireNonNull(jsonFactoryBuilder._errorReportConfiguration);
        this._characterEscapes = jsonFactoryBuilder._characterEscapes;
        this._rootValueSeparator = jsonFactoryBuilder._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactoryBuilder._maximumNonEscapedChar;
        this._quoteChar = jsonFactoryBuilder._quoteChar;
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot(this);
    }

    protected JsonFactory(TSFBuilder<?, ?> tSFBuilder, boolean z) {
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._recyclerPool = tSFBuilder._recyclerPool;
        this._objectCodec = null;
        this._factoryFeatures = tSFBuilder._factoryFeatures;
        this._parserFeatures = tSFBuilder._streamReadFeatures;
        this._generatorFeatures = tSFBuilder._streamWriteFeatures;
        this._inputDecorator = tSFBuilder._inputDecorator;
        this._outputDecorator = tSFBuilder._outputDecorator;
        this._generatorDecorators = _copy(tSFBuilder._generatorDecorators);
        this._streamReadConstraints = (StreamReadConstraints) Objects.requireNonNull(tSFBuilder._streamReadConstraints);
        this._streamWriteConstraints = (StreamWriteConstraints) Objects.requireNonNull(tSFBuilder._streamWriteConstraints);
        this._errorReportConfiguration = (ErrorReportConfiguration) Objects.requireNonNull(tSFBuilder._errorReportConfiguration);
        this._characterEscapes = null;
        this._rootValueSeparator = null;
        this._maximumNonEscapedChar = 0;
        this._quoteChar = '\"';
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot(this);
    }

    public TSFBuilder<?, ?> rebuild() {
        _requireJSONFactory("Factory implementation for format (%s) MUST override `rebuild()` method");
        return new JsonFactoryBuilder(this);
    }

    public static TSFBuilder<?, ?> builder() {
        return new JsonFactoryBuilder();
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(this, (ObjectCodec) null);
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() != cls) {
            throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
        }
    }

    protected static <T> List<T> _copy(List<T> list) {
        return list == null ? list : new ArrayList(list);
    }

    protected Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    @Override
    public boolean requiresPropertyOrdering() {
        return false;
    }

    @Override
    public boolean canHandleBinaryNatively() {
        return false;
    }

    public boolean canUseCharArrays() {
        return true;
    }

    @Override
    public boolean canParseAsync() {
        return _isJSONFactory();
    }

    @Override
    public Class<? extends FormatFeature> getFormatReadFeatureType() {
        return null;
    }

    @Override
    public Class<? extends FormatFeature> getFormatWriteFeatureType() {
        return null;
    }

    @Override
    public boolean canUseSchema(FormatSchema formatSchema) {
        String formatName;
        return (formatSchema == null || (formatName = getFormatName()) == null || !formatName.equals(formatSchema.getSchemaType())) ? false : true;
    }

    @Override
    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return FORMAT_NAME_JSON;
        }
        return null;
    }

    public MatchStrength hasFormat(InputAccessor inputAccessor) throws IOException {
        if (getClass() == JsonFactory.class) {
            return hasJSONFormat(inputAccessor);
        }
        return null;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public MatchStrength hasJSONFormat(InputAccessor inputAccessor) throws IOException {
        return ByteSourceJsonBootstrapper.hasJSONFormat(inputAccessor);
    }

    @Override
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Deprecated
    public final JsonFactory configure(Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonFactory enable(Feature feature) {
        this._factoryFeatures |= feature.getMask();
        return this;
    }

    @Deprecated
    public JsonFactory disable(Feature feature) {
        this._factoryFeatures &= feature.getMask() ^ (-1);
        return this;
    }

    @Override
    public final boolean isEnabled(Feature feature) {
        return (this._factoryFeatures & feature.getMask()) != 0;
    }

    @Override
    public final int getFactoryFeatures() {
        return this._factoryFeatures;
    }

    @Override
    public final int getParserFeatures() {
        return this._parserFeatures;
    }

    @Override
    public final int getGeneratorFeatures() {
        return this._generatorFeatures;
    }

    @Override
    public int getFormatParserFeatures() {
        return 0;
    }

    @Override
    public int getFormatGeneratorFeatures() {
        return 0;
    }

    @Override
    public StreamReadConstraints streamReadConstraints() {
        return this._streamReadConstraints;
    }

    @Override
    public StreamWriteConstraints streamWriteConstraints() {
        return this._streamWriteConstraints;
    }

    public JsonFactory setStreamReadConstraints(StreamReadConstraints streamReadConstraints) {
        int maxNameLength = this._streamReadConstraints.getMaxNameLength();
        this._streamReadConstraints = (StreamReadConstraints) Objects.requireNonNull(streamReadConstraints);
        if (this._streamReadConstraints.getMaxNameLength() != maxNameLength) {
            this._rootCharSymbols = CharsToNameCanonicalizer.createRoot(this);
        }
        return this;
    }

    public JsonFactory setErrorReportConfiguration(ErrorReportConfiguration errorReportConfiguration) {
        this._errorReportConfiguration = (ErrorReportConfiguration) Objects.requireNonNull(errorReportConfiguration, "Cannot pass null ErrorReportConfiguration");
        return this;
    }

    public JsonFactory setStreamWriteConstraints(StreamWriteConstraints streamWriteConstraints) {
        this._streamWriteConstraints = (StreamWriteConstraints) Objects.requireNonNull(streamWriteConstraints);
        return this;
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory enable(JsonParser.Feature feature) {
        this._parserFeatures |= feature.getMask();
        return this;
    }

    public JsonFactory disable(JsonParser.Feature feature) {
        this._parserFeatures &= feature.getMask() ^ (-1);
        return this;
    }

    @Override
    public final boolean isEnabled(JsonParser.Feature feature) {
        return (this._parserFeatures & feature.getMask()) != 0;
    }

    @Override
    public final boolean isEnabled(StreamReadFeature streamReadFeature) {
        return (this._parserFeatures & streamReadFeature.mappedFeature().getMask()) != 0;
    }

    public InputDecorator getInputDecorator() {
        return this._inputDecorator;
    }

    @Deprecated
    public JsonFactory setInputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return this;
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory enable(JsonGenerator.Feature feature) {
        this._generatorFeatures |= feature.getMask();
        return this;
    }

    public JsonFactory disable(JsonGenerator.Feature feature) {
        this._generatorFeatures &= feature.getMask() ^ (-1);
        return this;
    }

    @Override
    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (this._generatorFeatures & feature.getMask()) != 0;
    }

    @Override
    public final boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return (this._generatorFeatures & streamWriteFeature.mappedFeature().getMask()) != 0;
    }

    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    public JsonFactory setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        return this;
    }

    public OutputDecorator getOutputDecorator() {
        return this._outputDecorator;
    }

    @Deprecated
    public JsonFactory setOutputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return this;
    }

    public JsonFactory setRootValueSeparator(String str) {
        this._rootValueSeparator = str == null ? null : new SerializedString(str);
        return this;
    }

    public String getRootValueSeparator() {
        if (this._rootValueSeparator == null) {
            return null;
        }
        return this._rootValueSeparator.getValue();
    }

    public JsonFactory setRecyclerPool(RecyclerPool<BufferRecycler> recyclerPool) {
        this._recyclerPool = (RecyclerPool) Objects.requireNonNull(recyclerPool);
        return this;
    }

    public JsonFactory setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override
    public JsonParser createParser(File file) throws IOException, JsonParseException {
        IOContext _createContext = _createContext(_createContentReference(file), true);
        return _createParser(_decorate(_fileInputStream(file), _createContext), _createContext);
    }

    @Override
    public JsonParser createParser(URL url) throws IOException, JsonParseException {
        IOContext _createContext = _createContext(_createContentReference(url), true);
        return _createParser(_decorate(_optimizedStreamFromURL(url), _createContext), _createContext);
    }

    @Override
    public JsonParser createParser(InputStream inputStream) throws IOException, JsonParseException {
        IOContext _createContext = _createContext(_createContentReference(inputStream), false);
        return _createParser(_decorate(inputStream, _createContext), _createContext);
    }

    @Override
    public JsonParser createParser(Reader reader) throws IOException, JsonParseException {
        IOContext _createContext = _createContext(_createContentReference(reader), false);
        return _createParser(_decorate(reader, _createContext), _createContext);
    }

    @Override
    public JsonParser createParser(byte[] bArr) throws IOException, JsonParseException {
        InputStream decorate;
        IOContext _createContext = _createContext(_createContentReference(bArr), true);
        return (this._inputDecorator == null || (decorate = this._inputDecorator.decorate(_createContext, bArr, 0, bArr.length)) == null) ? _createParser(bArr, 0, bArr.length, _createContext) : _createParser(decorate, _createContext);
    }

    @Override
    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException, JsonParseException {
        InputStream decorate;
        _checkRangeBoundsForByteArray(bArr, i, i2);
        IOContext _createContext = _createContext(_createContentReference(bArr, i, i2), true);
        return (this._inputDecorator == null || (decorate = this._inputDecorator.decorate(_createContext, bArr, i, i2)) == null) ? _createParser(bArr, i, i2, _createContext) : _createParser(decorate, _createContext);
    }

    @Override
    public JsonParser createParser(String str) throws IOException, JsonParseException {
        int length = str.length();
        if (this._inputDecorator != null || length > 32768 || !canUseCharArrays()) {
            return createParser(new StringReader(str));
        }
        IOContext _createContext = _createContext(_createContentReference(str), true);
        char[] allocTokenBuffer = _createContext.allocTokenBuffer(length);
        str.getChars(0, length, allocTokenBuffer, 0);
        return _createParser(allocTokenBuffer, 0, length, _createContext, true);
    }

    @Override
    public JsonParser createParser(char[] cArr) throws IOException {
        return createParser(cArr, 0, cArr.length);
    }

    @Override
    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        _checkRangeBoundsForCharArray(cArr, i, i2);
        return this._inputDecorator != null ? createParser(new CharArrayReader(cArr, i, i2)) : _createParser(cArr, i, i2, _createContext(_createContentReference(cArr, i, i2), true), false);
    }

    @Override
    public JsonParser createParser(DataInput dataInput) throws IOException {
        IOContext _createContext = _createContext(_createContentReference(dataInput), false);
        return _createParser(_decorate(dataInput, _createContext), _createContext);
    }

    @Override
    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        _requireJSONFactory("Non-blocking source not (yet?) supported for this format (%s)");
        return new NonBlockingJsonParser(_createNonBlockingContext(null), this._parserFeatures, this._byteSymbolCanonicalizer.makeChildOrPlaceholder(this._factoryFeatures));
    }

    @Override
    public JsonParser createNonBlockingByteBufferParser() throws IOException {
        _requireJSONFactory("Non-blocking source not (yet?) supported for this format (%s)");
        return new NonBlockingByteBufferJsonParser(_createNonBlockingContext(null), this._parserFeatures, this._byteSymbolCanonicalizer.makeChildOrPlaceholder(this._factoryFeatures));
    }

    @Override
    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        IOContext _createContext = _createContext(_createContentReference(outputStream), false);
        _createContext.setEncoding(jsonEncoding);
        return jsonEncoding == JsonEncoding.UTF8 ? _createUTF8Generator(_decorate(outputStream, _createContext), _createContext) : _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    @Override
    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Override
    public JsonGenerator createGenerator(Writer writer) throws IOException {
        IOContext _createContext = _createContext(_createContentReference(writer), false);
        return _createGenerator(_decorate(writer, _createContext), _createContext);
    }

    @Override
    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        OutputStream _fileOutputStream = _fileOutputStream(file);
        IOContext _createContext = _createContext(_createContentReference(_fileOutputStream), true);
        _createContext.setEncoding(jsonEncoding);
        return jsonEncoding == JsonEncoding.UTF8 ? _createUTF8Generator(_decorate(_fileOutputStream, _createContext), _createContext) : _createGenerator(_decorate(_createWriter(_fileOutputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    @Override
    public JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), jsonEncoding);
    }

    @Override
    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(File file) throws IOException, JsonParseException {
        return createParser(file);
    }

    @Deprecated
    public JsonParser createJsonParser(URL url) throws IOException, JsonParseException {
        return createParser(url);
    }

    @Deprecated
    public JsonParser createJsonParser(InputStream inputStream) throws IOException, JsonParseException {
        return createParser(inputStream);
    }

    @Deprecated
    public JsonParser createJsonParser(Reader reader) throws IOException, JsonParseException {
        return createParser(reader);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr) throws IOException, JsonParseException {
        return createParser(bArr);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr, int i, int i2) throws IOException, JsonParseException {
        return createParser(bArr, i, i2);
    }

    @Deprecated
    public JsonParser createJsonParser(String str) throws IOException, JsonParseException {
        return createParser(str);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(outputStream, jsonEncoding);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(Writer writer) throws IOException {
        return createGenerator(writer);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    protected JsonParser _createParser(InputStream inputStream, IOContext iOContext) throws IOException {
        try {
            return new ByteSourceJsonBootstrapper(iOContext, inputStream).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
        } catch (IOException | RuntimeException e) {
            if (iOContext.isResourceManaged()) {
                try {
                    inputStream.close();
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
            }
            iOContext.close();
            throw e;
        }
    }

    protected JsonParser _createParser(Reader reader, IOContext iOContext) throws IOException {
        return new ReaderBasedJsonParser(iOContext, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.makeChild());
    }

    protected JsonParser _createParser(char[] cArr, int i, int i2, IOContext iOContext, boolean z) throws IOException {
        return new ReaderBasedJsonParser(iOContext, this._parserFeatures, null, this._objectCodec, this._rootCharSymbols.makeChild(), cArr, i, i + i2, z);
    }

    protected JsonParser _createParser(byte[] bArr, int i, int i2, IOContext iOContext) throws IOException {
        return new ByteSourceJsonBootstrapper(iOContext, bArr, i, i2).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    protected JsonParser _createParser(DataInput dataInput, IOContext iOContext) throws IOException {
        _requireJSONFactory("InputData source not (yet?) supported for this format (%s)");
        int skipUTF8BOM = ByteSourceJsonBootstrapper.skipUTF8BOM(dataInput);
        return new UTF8DataInputJsonParser(iOContext, this._parserFeatures, dataInput, this._objectCodec, this._byteSymbolCanonicalizer.makeChildOrPlaceholder(this._factoryFeatures), skipUTF8BOM);
    }

    protected JsonGenerator _createGenerator(Writer writer, IOContext iOContext) throws IOException {
        WriterBasedJsonGenerator writerBasedJsonGenerator = new WriterBasedJsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, writer, this._quoteChar);
        if (this._maximumNonEscapedChar > 0) {
            writerBasedJsonGenerator.setHighestNonEscapedChar(this._maximumNonEscapedChar);
        }
        if (this._characterEscapes != null) {
            writerBasedJsonGenerator.setCharacterEscapes(this._characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            writerBasedJsonGenerator.setRootValueSeparator(serializableString);
        }
        return _decorate(writerBasedJsonGenerator);
    }

    protected JsonGenerator _createUTF8Generator(OutputStream outputStream, IOContext iOContext) throws IOException {
        UTF8JsonGenerator uTF8JsonGenerator = new UTF8JsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, outputStream, this._quoteChar);
        if (this._maximumNonEscapedChar > 0) {
            uTF8JsonGenerator.setHighestNonEscapedChar(this._maximumNonEscapedChar);
        }
        if (this._characterEscapes != null) {
            uTF8JsonGenerator.setCharacterEscapes(this._characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            uTF8JsonGenerator.setRootValueSeparator(serializableString);
        }
        return _decorate(uTF8JsonGenerator);
    }

    protected Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, IOContext iOContext) throws IOException {
        return jsonEncoding == JsonEncoding.UTF8 ? new UTF8Writer(iOContext, outputStream) : new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    protected final InputStream _decorate(InputStream inputStream, IOContext iOContext) throws IOException {
        InputStream decorate;
        return (this._inputDecorator == null || (decorate = this._inputDecorator.decorate(iOContext, inputStream)) == null) ? inputStream : decorate;
    }

    protected final Reader _decorate(Reader reader, IOContext iOContext) throws IOException {
        Reader decorate;
        return (this._inputDecorator == null || (decorate = this._inputDecorator.decorate(iOContext, reader)) == null) ? reader : decorate;
    }

    protected final DataInput _decorate(DataInput dataInput, IOContext iOContext) throws IOException {
        DataInput decorate;
        return (this._inputDecorator == null || (decorate = this._inputDecorator.decorate(iOContext, dataInput)) == null) ? dataInput : decorate;
    }

    protected final OutputStream _decorate(OutputStream outputStream, IOContext iOContext) throws IOException {
        OutputStream decorate;
        return (this._outputDecorator == null || (decorate = this._outputDecorator.decorate(iOContext, outputStream)) == null) ? outputStream : decorate;
    }

    protected final Writer _decorate(Writer writer, IOContext iOContext) throws IOException {
        Writer decorate;
        return (this._outputDecorator == null || (decorate = this._outputDecorator.decorate(iOContext, writer)) == null) ? writer : decorate;
    }

    protected JsonGenerator _decorate(JsonGenerator jsonGenerator) {
        if (this._generatorDecorators != null) {
            Iterator<JsonGeneratorDecorator> it = this._generatorDecorators.iterator();
            while (it.hasNext()) {
                jsonGenerator = it.next().decorate(this, jsonGenerator);
            }
        }
        return jsonGenerator;
    }

    public BufferRecycler _getBufferRecycler() {
        return _getRecyclerPool().acquireAndLinkPooled();
    }

    public RecyclerPool<BufferRecycler> _getRecyclerPool() {
        return !Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures) ? JsonRecyclerPools.nonRecyclingPool() : this._recyclerPool;
    }

    protected IOContext _createContext(ContentReference contentReference, boolean z) {
        BufferRecycler bufferRecycler = null;
        boolean z2 = false;
        if (contentReference == null) {
            contentReference = ContentReference.unknown();
        } else {
            Object rawContent = contentReference.getRawContent();
            if (rawContent instanceof BufferRecycler.Gettable) {
                bufferRecycler = ((BufferRecycler.Gettable) rawContent).bufferRecycler();
                z2 = bufferRecycler != null;
            }
        }
        if (bufferRecycler == null) {
            bufferRecycler = _getBufferRecycler();
        }
        IOContext iOContext = new IOContext(this._streamReadConstraints, this._streamWriteConstraints, this._errorReportConfiguration, bufferRecycler, contentReference, z);
        if (z2) {
            iOContext.markBufferRecyclerReleased();
        }
        return iOContext;
    }

    @Deprecated
    protected IOContext _createContext(Object obj, boolean z) {
        return new IOContext(this._streamReadConstraints, this._streamWriteConstraints, this._errorReportConfiguration, _getBufferRecycler(), _createContentReference(obj), z);
    }

    protected IOContext _createNonBlockingContext(Object obj) {
        return new IOContext(this._streamReadConstraints, this._streamWriteConstraints, this._errorReportConfiguration, _getBufferRecycler(), _createContentReference(obj), false);
    }

    protected ContentReference _createContentReference(Object obj) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj, this._errorReportConfiguration);
    }

    protected ContentReference _createContentReference(Object obj, int i, int i2) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj, i, i2, this._errorReportConfiguration);
    }

    private final void _requireJSONFactory(String str) {
        if (!_isJSONFactory()) {
            throw new UnsupportedOperationException(String.format(str, getFormatName()));
        }
    }

    private final boolean _isJSONFactory() {
        return getFormatName() == FORMAT_NAME_JSON;
    }
}
