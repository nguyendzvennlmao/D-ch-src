package com.kammoun.utils.nbtapi.utils.metrics.charts;

import com.kammoun.utils.nbtapi.utils.metrics.json.JsonObjectBuilder;
import java.util.function.BiConsumer;

public abstract class CustomChart {
    private final String chartId;

    public CustomChart(String str) {
        if (str == null) {
            throw new IllegalArgumentException("chartId must not be null");
        }
        this.chartId = str;
    }

    public JsonObjectBuilder.JsonObject getRequestJsonObject(BiConsumer<String, Throwable> biConsumer, boolean z) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        jsonObjectBuilder.appendField("chartId", this.chartId);
        try {
            JsonObjectBuilder.JsonObject chartData = getChartData();
            if (chartData == null) {
                return null;
            }
            jsonObjectBuilder.appendField("data", chartData);
            return jsonObjectBuilder.build();
        } catch (Throwable th) {
            if (!z) {
                return null;
            }
            biConsumer.accept("Failed to get data for custom chart with id " + this.chartId, th);
            return null;
        }
    }

    protected abstract JsonObjectBuilder.JsonObject getChartData() throws Exception;
}
