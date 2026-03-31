package com.kammoun.utils.lib.folialib.util;

import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;

public class InvalidTickDelayNotifier {
    private boolean notified = false;
    private final Logger logger;
    private final FoliaLibOptions options;

    public InvalidTickDelayNotifier(@NotNull Logger logger, @NotNull FoliaLibOptions foliaLibOptions) {
        this.logger = logger;
        this.options = foliaLibOptions;
    }

    public void notifyOnce(long j) {
        if (this.notified || this.options.isDisableNotifications()) {
            return;
        }
        this.notified = true;
        this.logger.warning(String.format("A tick based delay or timer was scheduled with a time span of %d ticks. ", Long.valueOf(j)) + "The server is already processing the current tick and, as such, won't process new tasks in less than 1 tick. FoliaLib will automatically change time spans of <= 0 ticks to 1 tick going forward. This warning is purely informative and won't impact the operation of the plugin. Plugin developers can disable this warning or enable debug mode to location the source of this warning.");
        if (this.options.isInvalidTickDebugMode()) {
            new Exception("Debugging information to track down the location of the invalid tick input value").printStackTrace();
        }
    }
}
