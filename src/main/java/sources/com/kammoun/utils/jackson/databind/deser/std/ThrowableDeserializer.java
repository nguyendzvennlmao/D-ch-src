package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.deser.BeanDeserializer;
import com.kammoun.utils.jackson.databind.deser.SettableBeanProperty;
import com.kammoun.utils.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Arrays;

public class ThrowableDeserializer extends BeanDeserializer {
    private static final long serialVersionUID = 1;
    protected static final String PROP_NAME_MESSAGE = "message";
    protected static final String PROP_NAME_SUPPRESSED = "suppressed";
    protected static final String PROP_NAME_LOCALIZED_MESSAGE = "localizedMessage";

    protected ThrowableDeserializer(BeanDeserializer beanDeserializer, NameTransformer nameTransformer) {
        super(beanDeserializer, nameTransformer);
        this._vanillaProcessing = false;
    }

    @Deprecated
    public ThrowableDeserializer(BeanDeserializer beanDeserializer) {
        this(beanDeserializer, null);
    }

    public static ThrowableDeserializer construct(DeserializationContext deserializationContext, BeanDeserializer beanDeserializer) {
        return new ThrowableDeserializer(beanDeserializer, (NameTransformer) null);
    }

    @Override
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return getClass() != ThrowableDeserializer.class ? this : new ThrowableDeserializer(this, nameTransformer);
    }

    @Override
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        if (this._delegateDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, this._delegateDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._beanType.isAbstract()) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "abstract type (need to add/enable type information?)", new Object[0]);
        }
        boolean canCreateFromString = this._valueInstantiator.canCreateFromString();
        boolean canCreateUsingDefault = this._valueInstantiator.canCreateUsingDefault();
        if (!canCreateFromString && !canCreateUsingDefault) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
        }
        Throwable th = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        Throwable[] thArr = null;
        int i = 0;
        while (!jsonParser.hasToken(JsonToken.END_OBJECT)) {
            String currentName = jsonParser.currentName();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            jsonParser.nextToken();
            if (find != null) {
                if (!"cause".equals(find.getName()) || !jsonParser.hasToken(JsonToken.VALUE_NULL)) {
                    if (th != null) {
                        find.deserializeAndSet(jsonParser, deserializationContext, th);
                    } else {
                        if (settableBeanPropertyArr == null) {
                            int size = this._beanProperties.size();
                            settableBeanPropertyArr = new Object[size + size];
                        } else if (i == settableBeanPropertyArr.length) {
                            settableBeanPropertyArr = Arrays.copyOf(settableBeanPropertyArr, i + 16);
                        }
                        int i2 = i;
                        int i3 = i + 1;
                        settableBeanPropertyArr[i2] = find;
                        i = i3 + 1;
                        settableBeanPropertyArr[i3] = find.deserialize(jsonParser, deserializationContext);
                    }
                }
            } else if (PROP_NAME_MESSAGE.equalsIgnoreCase(currentName)) {
                th = _instantiate(deserializationContext, canCreateFromString, jsonParser.getValueAsString());
            } else if (this._ignorableProps != null && this._ignorableProps.contains(currentName)) {
                jsonParser.skipChildren();
            } else if (PROP_NAME_SUPPRESSED.equalsIgnoreCase(currentName)) {
                thArr = jsonParser.hasToken(JsonToken.VALUE_NULL) ? null : (Throwable[]) deserializationContext.findRootValueDeserializer(deserializationContext.constructType(Throwable[].class)).deserialize(jsonParser, deserializationContext);
            } else if (PROP_NAME_LOCALIZED_MESSAGE.equalsIgnoreCase(currentName)) {
                jsonParser.skipChildren();
            } else if (this._anySetter != null) {
                if (th == null) {
                    th = _instantiate(deserializationContext, canCreateFromString, null);
                }
                this._anySetter.deserializeAndSet(jsonParser, deserializationContext, th, currentName);
            } else if (PROP_NAME_MESSAGE.equalsIgnoreCase(currentName)) {
                jsonParser.skipChildren();
            } else {
                handleUnknownProperty(jsonParser, deserializationContext, th, currentName);
            }
            jsonParser.nextToken();
        }
        if (th == null) {
            th = _instantiate(deserializationContext, canCreateFromString, null);
        }
        if (settableBeanPropertyArr != null) {
            int i4 = i;
            for (int i5 = 0; i5 < i4; i5 += 2) {
                settableBeanPropertyArr[i5].set(th, settableBeanPropertyArr[i5 + 1]);
            }
        }
        if (thArr != null) {
            for (Throwable th2 : thArr) {
                if (th2 != null) {
                    th.addSuppressed(th2);
                }
            }
        }
        return th;
    }

    private Throwable _instantiate(DeserializationContext deserializationContext, boolean z, String str) throws IOException {
        return z ? str != null ? (Throwable) this._valueInstantiator.createFromString(deserializationContext, str) : (Throwable) this._valueInstantiator.createFromString(deserializationContext, null) : (Throwable) this._valueInstantiator.createUsingDefault(deserializationContext);
    }
}
