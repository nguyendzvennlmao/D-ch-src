package com.kammoun.utils.jackson.core.async;

public interface NonBlockingInputFeeder {
    boolean needMoreInput();

    void endOfInput();
}
