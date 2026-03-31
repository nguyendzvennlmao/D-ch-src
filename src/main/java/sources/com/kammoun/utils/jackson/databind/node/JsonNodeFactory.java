package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.databind.JsonNode;
import com.kammoun.utils.jackson.databind.util.RawValue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonNodeFactory implements Serializable, JsonNodeCreator {
    private static final long serialVersionUID = 1;
    protected static final int MAX_ELEMENT_INDEX_FOR_INSERT = 9999;

    @Deprecated
    private final boolean _cfgBigDecimalExact;
    public static final JsonNodeFactory instance = new JsonNodeFactory();

    public JsonNodeFactory(boolean z) {
        this._cfgBigDecimalExact = z;
    }

    protected JsonNodeFactory() {
        this(false);
    }

    @Deprecated
    public static JsonNodeFactory withExactBigDecimals(boolean z) {
        return new JsonNodeFactory(z);
    }

    public int getMaxElementIndexForInsert() {
        return MAX_ELEMENT_INDEX_FOR_INSERT;
    }

    public boolean willStripTrailingBigDecimalZeroes() {
        return !this._cfgBigDecimalExact;
    }

    @Override
    public BooleanNode booleanNode(boolean z) {
        return z ? BooleanNode.getTrue() : BooleanNode.getFalse();
    }

    @Override
    public NullNode nullNode() {
        return NullNode.getInstance();
    }

    public JsonNode missingNode() {
        return MissingNode.getInstance();
    }

    @Override
    public NumericNode numberNode(byte b) {
        return IntNode.valueOf(b);
    }

    @Override
    public ValueNode numberNode(Byte b) {
        return b == null ? nullNode() : IntNode.valueOf(b.intValue());
    }

    @Override
    public NumericNode numberNode(short s) {
        return ShortNode.valueOf(s);
    }

    @Override
    public ValueNode numberNode(Short sh) {
        return sh == null ? nullNode() : ShortNode.valueOf(sh.shortValue());
    }

    @Override
    public NumericNode numberNode(int i) {
        return IntNode.valueOf(i);
    }

    @Override
    public ValueNode numberNode(Integer num) {
        return num == null ? nullNode() : IntNode.valueOf(num.intValue());
    }

    @Override
    public NumericNode numberNode(long j) {
        return LongNode.valueOf(j);
    }

    @Override
    public ValueNode numberNode(Long l) {
        return l == null ? nullNode() : LongNode.valueOf(l.longValue());
    }

    @Override
    public ValueNode numberNode(BigInteger bigInteger) {
        return bigInteger == null ? nullNode() : BigIntegerNode.valueOf(bigInteger);
    }

    @Override
    public NumericNode numberNode(float f) {
        return FloatNode.valueOf(f);
    }

    @Override
    public ValueNode numberNode(Float f) {
        return f == null ? nullNode() : FloatNode.valueOf(f.floatValue());
    }

    @Override
    public NumericNode numberNode(double d) {
        return DoubleNode.valueOf(d);
    }

    @Override
    public ValueNode numberNode(Double d) {
        return d == null ? nullNode() : DoubleNode.valueOf(d.doubleValue());
    }

    @Override
    public ValueNode numberNode(BigDecimal bigDecimal) {
        return bigDecimal == null ? nullNode() : DecimalNode.valueOf(bigDecimal);
    }

    @Override
    public TextNode textNode(String str) {
        return TextNode.valueOf(str);
    }

    @Override
    public BinaryNode binaryNode(byte[] bArr) {
        return BinaryNode.valueOf(bArr);
    }

    @Override
    public BinaryNode binaryNode(byte[] bArr, int i, int i2) {
        return BinaryNode.valueOf(bArr, i, i2);
    }

    @Override
    public ArrayNode arrayNode() {
        return new ArrayNode(this);
    }

    @Override
    public ArrayNode arrayNode(int i) {
        return new ArrayNode(this, i);
    }

    @Override
    public ObjectNode objectNode() {
        return new ObjectNode(this);
    }

    @Override
    public ValueNode pojoNode(Object obj) {
        return new POJONode(obj);
    }

    @Override
    public ValueNode rawValueNode(RawValue rawValue) {
        return new POJONode(rawValue);
    }

    protected boolean _inIntRange(long j) {
        return ((long) ((int) j)) == j;
    }
}
