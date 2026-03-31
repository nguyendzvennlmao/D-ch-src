package com.kammoun.utils.jackson.core.util;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.PrettyPrinter;
import com.kammoun.utils.jackson.core.SerializableString;
import com.kammoun.utils.jackson.core.io.SerializedString;
import com.kammoun.utils.jackson.core.util.Separators;
import java.io.IOException;
import java.io.Serializable;

public class DefaultPrettyPrinter implements PrettyPrinter, Instantiatable<DefaultPrettyPrinter>, Serializable {
    private static final long serialVersionUID = 1;

    @Deprecated
    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
    protected Indenter _arrayIndenter;
    protected Indenter _objectIndenter;
    protected SerializableString _rootSeparator;

    @Deprecated
    protected boolean _spacesInObjectEntries;
    protected transient int _nesting;
    protected Separators _separators;
    protected String _objectFieldValueSeparatorWithSpaces;
    protected String _objectEntrySeparator;
    protected String _objectEmptySeparator;
    protected String _arrayValueSeparator;
    protected String _arrayEmptySeparator;

    public static class FixedSpaceIndenter extends NopIndenter {
        public static final FixedSpaceIndenter instance = new FixedSpaceIndenter();

        @Override
        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
            jsonGenerator.writeRaw(' ');
        }

        @Override
        public boolean isInline() {
            return true;
        }
    }

    public interface Indenter {
        void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException;

        boolean isInline();
    }

    public static class NopIndenter implements Indenter, Serializable {
        public static final NopIndenter instance = new NopIndenter();

        @Override
        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
        }

        @Override
        public boolean isInline() {
            return true;
        }
    }

    public DefaultPrettyPrinter() {
        this(DEFAULT_SEPARATORS);
    }

    @Deprecated
    public DefaultPrettyPrinter(String str) {
        this(str == null ? null : new SerializedString(str));
    }

    @Deprecated
    public DefaultPrettyPrinter(SerializableString serializableString) {
        this(DEFAULT_SEPARATORS.withRootSeparator(serializableString.getValue()));
    }

    @Deprecated
    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter, SerializableString serializableString) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        this._objectIndenter = defaultPrettyPrinter._objectIndenter;
        this._spacesInObjectEntries = defaultPrettyPrinter._spacesInObjectEntries;
        this._nesting = defaultPrettyPrinter._nesting;
        this._separators = defaultPrettyPrinter._separators;
        this._objectFieldValueSeparatorWithSpaces = defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces;
        this._objectEntrySeparator = defaultPrettyPrinter._objectEntrySeparator;
        this._objectEmptySeparator = defaultPrettyPrinter._objectEmptySeparator;
        this._arrayValueSeparator = defaultPrettyPrinter._arrayValueSeparator;
        this._arrayEmptySeparator = defaultPrettyPrinter._arrayEmptySeparator;
        this._rootSeparator = serializableString;
    }

    public DefaultPrettyPrinter(Separators separators) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._separators = separators;
        this._rootSeparator = separators.getRootSeparator() == null ? null : new SerializedString(separators.getRootSeparator());
        this._objectFieldValueSeparatorWithSpaces = separators.getObjectFieldValueSpacing().apply(separators.getObjectFieldValueSeparator());
        this._objectEntrySeparator = separators.getObjectEntrySpacing().apply(separators.getObjectEntrySeparator());
        this._objectEmptySeparator = separators.getObjectEmptySeparator();
        this._arrayValueSeparator = separators.getArrayValueSpacing().apply(separators.getArrayValueSeparator());
        this._arrayEmptySeparator = separators.getArrayEmptySeparator();
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._rootSeparator = defaultPrettyPrinter._rootSeparator;
        this._arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        this._objectIndenter = defaultPrettyPrinter._objectIndenter;
        this._spacesInObjectEntries = defaultPrettyPrinter._spacesInObjectEntries;
        this._nesting = defaultPrettyPrinter._nesting;
        this._separators = defaultPrettyPrinter._separators;
        this._objectFieldValueSeparatorWithSpaces = defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces;
        this._objectEntrySeparator = defaultPrettyPrinter._objectEntrySeparator;
        this._objectEmptySeparator = defaultPrettyPrinter._objectEmptySeparator;
        this._arrayValueSeparator = defaultPrettyPrinter._arrayValueSeparator;
        this._arrayEmptySeparator = defaultPrettyPrinter._arrayEmptySeparator;
    }

    @Deprecated
    public DefaultPrettyPrinter withRootSeparator(SerializableString serializableString) {
        if (this._rootSeparator == serializableString || (serializableString != null && serializableString.equals(this._rootSeparator))) {
            return this;
        }
        return new DefaultPrettyPrinter(this).withSeparators(this._separators.withRootSeparator(serializableString == null ? null : serializableString.getValue()));
    }

    @Deprecated
    public DefaultPrettyPrinter withRootSeparator(String str) {
        return withRootSeparator(str == null ? null : new SerializedString(str));
    }

    public void indentArraysWith(Indenter indenter) {
        this._arrayIndenter = indenter == null ? NopIndenter.instance : indenter;
    }

    public void indentObjectsWith(Indenter indenter) {
        this._objectIndenter = indenter == null ? NopIndenter.instance : indenter;
    }

    public DefaultPrettyPrinter withArrayIndenter(Indenter indenter) {
        if (indenter == null) {
            indenter = NopIndenter.instance;
        }
        if (this._arrayIndenter == indenter) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._arrayIndenter = indenter;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withObjectIndenter(Indenter indenter) {
        if (indenter == null) {
            indenter = NopIndenter.instance;
        }
        if (this._objectIndenter == indenter) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._objectIndenter = indenter;
        return defaultPrettyPrinter;
    }

    @Deprecated
    public DefaultPrettyPrinter withSpacesInObjectEntries() {
        return _withSpaces(true);
    }

    @Deprecated
    public DefaultPrettyPrinter withoutSpacesInObjectEntries() {
        return _withSpaces(false);
    }

    protected DefaultPrettyPrinter _withSpaces(boolean z) {
        if (this._spacesInObjectEntries == z) {
            return this;
        }
        DefaultPrettyPrinter withSeparators = withSeparators(this._separators.withObjectFieldValueSpacing(z ? Separators.Spacing.BOTH : Separators.Spacing.NONE));
        withSeparators._spacesInObjectEntries = z;
        return withSeparators;
    }

    public DefaultPrettyPrinter withSeparators(Separators separators) {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._separators = separators;
        defaultPrettyPrinter._rootSeparator = separators.getRootSeparator() == null ? null : new SerializedString(separators.getRootSeparator());
        defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces = separators.getObjectFieldValueSpacing().apply(separators.getObjectFieldValueSeparator());
        defaultPrettyPrinter._objectEntrySeparator = separators.getObjectEntrySpacing().apply(separators.getObjectEntrySeparator());
        defaultPrettyPrinter._objectEmptySeparator = separators.getObjectEmptySeparator();
        defaultPrettyPrinter._arrayValueSeparator = separators.getArrayValueSpacing().apply(separators.getArrayValueSeparator());
        defaultPrettyPrinter._arrayEmptySeparator = separators.getArrayEmptySeparator();
        return defaultPrettyPrinter;
    }

    @Override
    public DefaultPrettyPrinter createInstance() {
        if (getClass() != DefaultPrettyPrinter.class) {
            throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
        }
        return new DefaultPrettyPrinter(this);
    }

    @Override
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        if (this._rootSeparator != null) {
            jsonGenerator.writeRaw(this._rootSeparator);
        }
    }

    @Override
    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw('{');
        if (this._objectIndenter.isInline()) {
            return;
        }
        this._nesting++;
    }

    @Override
    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(this._objectFieldValueSeparatorWithSpaces);
    }

    @Override
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(this._objectEntrySeparator);
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override
    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this._objectIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.writeRaw(this._objectEmptySeparator);
        }
        jsonGenerator.writeRaw('}');
    }

    @Override
    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting++;
        }
        jsonGenerator.writeRaw('[');
    }

    @Override
    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.writeRaw(this._arrayValueSeparator);
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override
    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.writeRaw(this._arrayEmptySeparator);
        }
        jsonGenerator.writeRaw(']');
    }
}
