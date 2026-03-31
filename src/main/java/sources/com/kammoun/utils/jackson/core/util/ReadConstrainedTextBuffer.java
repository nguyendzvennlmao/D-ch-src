package com.kammoun.utils.jackson.core.util;

import com.kammoun.utils.jackson.core.StreamReadConstraints;
import com.kammoun.utils.jackson.core.exc.StreamConstraintsException;

public final class ReadConstrainedTextBuffer extends TextBuffer {
    private final StreamReadConstraints _streamReadConstraints;

    public ReadConstrainedTextBuffer(StreamReadConstraints streamReadConstraints, BufferRecycler bufferRecycler) {
        super(bufferRecycler);
        this._streamReadConstraints = streamReadConstraints;
    }

    @Override
    protected void validateStringLength(int i) throws StreamConstraintsException {
        this._streamReadConstraints.validateStringLength(i);
    }
}
