package com.kammoun.utils.nbtapi.utils.metrics.charts;

import com.kammoun.utils.nbtapi.utils.metrics.json.JsonObjectBuilder;
import java.util.Map;
import java.util.concurrent.Callable;

public class DrilldownPie extends CustomChart {
    private final Callable<Map<String, Map<String, Integer>>> callable;

    public DrilldownPie(String str, Callable<Map<String, Map<String, Integer>>> callable) {
        super(str);
        this.callable = callable;
    }

    @Override
    public JsonObjectBuilder.JsonObject getChartData() throws Exception {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        Map<String, Map<String, Integer>> call = this.callable.call();
        if (call == null || call.isEmpty()) {
            return null;
        }
        boolean z = true;
        for (Map.Entry<String, Map<String, Integer>> entry : call.entrySet()) {
            JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
            boolean z2 = true;
            for (Map.Entry<String, Integer> entry2 : call.get(entry.getKey()).entrySet()) {
                jsonObjectBuilder2.appendField(entry2.getKey(), entry2.getValue().intValue());
                z2 = false;
            }
            if (!z2) {
                z = false;
                jsonObjectBuilder.appendField(entry.getKey(), jsonObjectBuilder2.build());
            }
        }
        if (z) {
            return null;
        }
        return new JsonObjectBuilder().appendField("values", jsonObjectBuilder.build()).build();
    }
}
