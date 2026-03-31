package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.core.JsonStreamContext;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.databind.JsonNode;
import java.util.Iterator;
import java.util.Map;

public abstract class NodeCursor extends JsonStreamContext {
    protected final NodeCursor _parent;
    protected String _currentName;
    protected Object _currentValue;

    protected static final class ArrayCursor extends NodeCursor {
        protected Iterator<JsonNode> _contents;
        protected JsonNode _currentElement;

        public ArrayCursor(JsonNode jsonNode, NodeCursor nodeCursor) {
            super(1, nodeCursor);
            this._contents = jsonNode.elements();
        }

        @Override
        public JsonToken nextToken() {
            if (!this._contents.hasNext()) {
                this._currentElement = null;
                return JsonToken.END_ARRAY;
            }
            this._index++;
            this._currentElement = this._contents.next();
            return this._currentElement.asToken();
        }

        @Override
        public JsonNode currentNode() {
            return this._currentElement;
        }

        @Override
        public NodeCursor startArray() {
            return new ArrayCursor(this._currentElement, this);
        }

        @Override
        public NodeCursor startObject() {
            return new ObjectCursor(this._currentElement, this);
        }

        @Override
        public JsonStreamContext getParent() {
            return super.getParent();
        }
    }

    protected static final class ObjectCursor extends NodeCursor {
        protected Iterator<Map.Entry<String, JsonNode>> _contents;
        protected Map.Entry<String, JsonNode> _current;
        protected boolean _needEntry;

        public ObjectCursor(JsonNode jsonNode, NodeCursor nodeCursor) {
            super(2, nodeCursor);
            this._contents = jsonNode.fields();
            this._needEntry = true;
        }

        @Override
        public JsonToken nextToken() {
            if (!this._needEntry) {
                this._needEntry = true;
                return this._current.getValue().asToken();
            }
            if (!this._contents.hasNext()) {
                this._currentName = null;
                this._current = null;
                return JsonToken.END_OBJECT;
            }
            this._index++;
            this._needEntry = false;
            this._current = this._contents.next();
            this._currentName = this._current == null ? null : this._current.getKey();
            return JsonToken.FIELD_NAME;
        }

        @Override
        public JsonNode currentNode() {
            if (this._current == null) {
                return null;
            }
            return this._current.getValue();
        }

        @Override
        public NodeCursor startArray() {
            return new ArrayCursor(currentNode(), this);
        }

        @Override
        public NodeCursor startObject() {
            return new ObjectCursor(currentNode(), this);
        }

        @Override
        public JsonStreamContext getParent() {
            return super.getParent();
        }
    }

    protected static final class RootCursor extends NodeCursor {
        protected JsonNode _node;
        protected boolean _done;

        public RootCursor(JsonNode jsonNode, NodeCursor nodeCursor) {
            super(0, nodeCursor);
            this._done = false;
            this._node = jsonNode;
        }

        @Override
        public void overrideCurrentName(String str) {
        }

        @Override
        public JsonToken nextToken() {
            if (this._done) {
                this._node = null;
                return null;
            }
            this._index++;
            this._done = true;
            return this._node.asToken();
        }

        @Override
        public JsonNode currentNode() {
            if (this._done) {
                return this._node;
            }
            return null;
        }

        @Override
        public NodeCursor startArray() {
            return new ArrayCursor(this._node, this);
        }

        @Override
        public NodeCursor startObject() {
            return new ObjectCursor(this._node, this);
        }

        @Override
        public JsonStreamContext getParent() {
            return super.getParent();
        }
    }

    public NodeCursor(int i, NodeCursor nodeCursor) {
        this._type = i;
        this._index = -1;
        this._parent = nodeCursor;
    }

    @Override
    public final NodeCursor getParent() {
        return this._parent;
    }

    @Override
    public final String getCurrentName() {
        return this._currentName;
    }

    public void overrideCurrentName(String str) {
        this._currentName = str;
    }

    @Override
    public Object getCurrentValue() {
        return this._currentValue;
    }

    @Override
    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    public abstract JsonToken nextToken();

    public abstract JsonNode currentNode();

    public abstract NodeCursor startObject();

    public abstract NodeCursor startArray();

    public final NodeCursor iterateChildren() {
        JsonNode currentNode = currentNode();
        if (currentNode == null) {
            throw new IllegalStateException("No current node");
        }
        if (currentNode.isArray()) {
            return new ArrayCursor(currentNode, this);
        }
        if (currentNode.isObject()) {
            return new ObjectCursor(currentNode, this);
        }
        throw new IllegalStateException("Current node of type " + currentNode.getClass().getName());
    }
}
