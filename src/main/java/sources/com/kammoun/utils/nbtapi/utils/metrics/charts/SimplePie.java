package com.kammoun.utils.nbtapi.utils.metrics.charts;

import com.kammoun.utils.nbtapi.utils.metrics.json.JsonObjectBuilder;
import java.util.concurrent.Callable;

public class SimplePie extends CustomChart {
    private final Callable<String> callable;

    public SimplePie(String str, Callable<String> callable) {
        super(str);
        this.callable = callable;
    }

    @Override
    protected JsonObjectBuilder.JsonObject getChartData() throws Exception {
        String call = this.callable.call();
        if (call == null || call.isEmpty()) {
            return null;
        }
        return new JsonObjectBuilder().appendField("value", call).build();
    }
}
