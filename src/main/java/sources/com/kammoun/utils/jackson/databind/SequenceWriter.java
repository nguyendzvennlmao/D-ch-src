package com.kammoun.utils.jackson.databind;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.Version;
import com.kammoun.utils.jackson.core.Versioned;
import com.kammoun.utils.jackson.databind.ObjectWriter;
import com.kammoun.utils.jackson.databind.cfg.PackageVersion;
import com.kammoun.utils.jackson.databind.jsontype.TypeSerializer;
import com.kammoun.utils.jackson.databind.ser.DefaultSerializerProvider;
import com.kammoun.utils.jackson.databind.ser.impl.PropertySerializerMap;
import com.kammoun.utils.jackson.databind.ser.impl.TypeWrappedSerializer;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public class SequenceWriter implements Versioned, Closeable, Flushable {
    protected final DefaultSerializerProvider _provider;
    protected final SerializationConfig _config;
    protected final JsonGenerator _generator;
    protected final JsonSerializer<Object> _rootSerializer;
    protected final TypeSerializer _typeSerializer;
    protected final boolean _closeGenerator;
    protected final boolean _cfgFlush;
    protected final boolean _cfgCloseCloseable;
    protected PropertySerializerMap _dynamicSerializers = PropertySerializerMap.emptyForRootValues();
    protected boolean _openArray;
    protected boolean _closed;

    public SequenceWriter(DefaultSerializerProvider defaultSerializerProvider, JsonGenerator jsonGenerator, boolean z, ObjectWriter.Prefetch prefetch) throws IOException {
        this._provider = defaultSerializerProvider;
        this._generator = jsonGenerator;
        this._closeGenerator = z;
        this._rootSerializer = prefetch.getValueSerializer();
        this._typeSerializer = prefetch.getTypeSerializer();
        this._config = defaultSerializerProvider.getConfig();
        this._cfgFlush = this._config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE);
        this._cfgCloseCloseable = this._config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE);
    }

    public SequenceWriter init(boolean z) throws IOException {
        if (z) {
            this._generator.writeStartArray();
            this._openArray = true;
        }
        return this;
    }

    @Override
    public Version version() {
        return PackageVersion.VERSION;
    }

    public SequenceWriter write(Object obj) throws IOException {
        if (obj == null) {
            this._provider.serializeValue(this._generator, null);
            return this;
        }
        if (this._cfgCloseCloseable && (obj instanceof Closeable)) {
            return _writeCloseableValue(obj);
        }
        JsonSerializer<Object> jsonSerializer = this._rootSerializer;
        if (jsonSerializer == null) {
            Class<?> cls = obj.getClass();
            jsonSerializer = this._dynamicSerializers.serializerFor(cls);
            if (jsonSerializer == null) {
                jsonSerializer = _findAndAddDynamic(cls);
            }
        }
        this._provider.serializeValue(this._generator, obj, null, jsonSerializer);
        if (this._cfgFlush) {
            this._generator.flush();
        }
        return this;
    }

    public SequenceWriter write(Object obj, JavaType javaType) throws IOException {
        if (obj == null) {
            this._provider.serializeValue(this._generator, null);
            return this;
        }
        if (this._cfgCloseCloseable && (obj instanceof Closeable)) {
            return _writeCloseableValue(obj, javaType);
        }
        JsonSerializer<Object> serializerFor = this._dynamicSerializers.serializerFor(javaType.getRawClass());
        if (serializerFor == null) {
            serializerFor = _findAndAddDynamic(javaType);
        }
        this._provider.serializeValue(this._generator, obj, javaType, serializerFor);
        if (this._cfgFlush) {
            this._generator.flush();
        }
        return this;
    }

    public SequenceWriter writeAll(Object[] objArr) throws IOException {
        for (Object obj : objArr) {
            write(obj);
        }
        return this;
    }

    public <C extends Collection<?>> SequenceWriter writeAll(C c) throws IOException {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            write(it.next());
        }
        return this;
    }

    public SequenceWriter writeAll(Iterable<?> iterable) throws IOException {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            write(it.next());
        }
        return this;
    }

    @Override
    public void flush() throws IOException {
        if (this._closed) {
            return;
        }
        this._generator.flush();
    }

    @Override
    public void close() throws IOException {
        if (this._closed) {
            return;
        }
        this._closed = true;
        if (this._openArray) {
            this._openArray = false;
            this._generator.writeEndArray();
        }
        if (this._closeGenerator) {
            this._generator.close();
        }
    }

    protected SequenceWriter _writeCloseableValue(Object obj) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            JsonSerializer<Object> jsonSerializer = this._rootSerializer;
            if (jsonSerializer == null) {
                Class<?> cls = obj.getClass();
                jsonSerializer = this._dynamicSerializers.serializerFor(cls);
                if (jsonSerializer == null) {
                    jsonSerializer = _findAndAddDynamic(cls);
                }
            }
            this._provider.serializeValue(this._generator, obj, null, jsonSerializer);
            if (this._cfgFlush) {
                this._generator.flush();
            }
            closeable = null;
            closeable.close();
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e) {
                }
            }
            return this;
        } catch (Throwable th) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                }
            }
            throw th;
        }
    }

    protected SequenceWriter _writeCloseableValue(Object obj, JavaType javaType) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            JsonSerializer<Object> serializerFor = this._dynamicSerializers.serializerFor(javaType.getRawClass());
            if (serializerFor == null) {
                serializerFor = _findAndAddDynamic(javaType);
            }
            this._provider.serializeValue(this._generator, obj, javaType, serializerFor);
            if (this._cfgFlush) {
                this._generator.flush();
            }
            closeable = null;
            closeable.close();
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e) {
                }
            }
            return this;
        } catch (Throwable th) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                }
            }
            throw th;
        }
    }

    private final JsonSerializer<Object> _findAndAddDynamic(Class<?> cls) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult findAndAddRootValueSerializer = this._typeSerializer == null ? this._dynamicSerializers.findAndAddRootValueSerializer(cls, this._provider) : this._dynamicSerializers.addSerializer(cls, new TypeWrappedSerializer(this._typeSerializer, this._provider.findValueSerializer(cls, (BeanProperty) null)));
        this._dynamicSerializers = findAndAddRootValueSerializer.map;
        return findAndAddRootValueSerializer.serializer;
    }

    private final JsonSerializer<Object> _findAndAddDynamic(JavaType javaType) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult findAndAddRootValueSerializer = this._typeSerializer == null ? this._dynamicSerializers.findAndAddRootValueSerializer(javaType, this._provider) : this._dynamicSerializers.addSerializer(javaType, new TypeWrappedSerializer(this._typeSerializer, this._provider.findValueSerializer(javaType, (BeanProperty) null)));
        this._dynamicSerializers = findAndAddRootValueSerializer.map;
        return findAndAddRootValueSerializer.serializer;
    }
}
