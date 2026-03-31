package com.kammoun.utils.jackson.core.util;

import com.kammoun.utils.jackson.core.io.JsonStringEncoder;
import java.lang.ref.SoftReference;

@Deprecated
public class BufferRecyclers {
    public static final String SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS = "com.kammoun.utils.jackson.core.util.BufferRecyclers.trackReusableBuffers";
    private static final ThreadLocalBufferManager _bufferRecyclerTracker;
    protected static final ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef;

    @Deprecated
    public static BufferRecycler getBufferRecycler() {
        SoftReference<BufferRecycler> softReference = _recyclerRef.get();
        BufferRecycler bufferRecycler = softReference == null ? null : softReference.get();
        if (bufferRecycler == null) {
            bufferRecycler = new BufferRecycler();
            _recyclerRef.set(_bufferRecyclerTracker != null ? _bufferRecyclerTracker.wrapAndTrack(bufferRecycler) : new SoftReference<>(bufferRecycler));
        }
        return bufferRecycler;
    }

    public static int releaseBuffers() {
        if (_bufferRecyclerTracker != null) {
            return _bufferRecyclerTracker.releaseBuffers();
        }
        return -1;
    }

    @Deprecated
    public static JsonStringEncoder getJsonStringEncoder() {
        return JsonStringEncoder.getInstance();
    }

    @Deprecated
    public static byte[] encodeAsUTF8(String str) {
        return JsonStringEncoder.getInstance().encodeAsUTF8(str);
    }

    @Deprecated
    public static char[] quoteAsJsonText(String str) {
        return JsonStringEncoder.getInstance().quoteAsString(str);
    }

    @Deprecated
    public static void quoteAsJsonText(CharSequence charSequence, StringBuilder sb) {
        JsonStringEncoder.getInstance().quoteAsString(charSequence, sb);
    }

    @Deprecated
    public static byte[] quoteAsJsonUTF8(String str) {
        return JsonStringEncoder.getInstance().quoteAsUTF8(str);
    }

    static {
        boolean z = false;
        try {
            z = "true".equals(System.getProperty(SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS));
        } catch (SecurityException e) {
        }
        _bufferRecyclerTracker = z ? ThreadLocalBufferManager.instance() : null;
        _recyclerRef = new ThreadLocal<>();
    }
}
