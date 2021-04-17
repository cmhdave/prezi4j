package io.github.prezi4j;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Label {
    Map<Locale, List<String>> entries;

    public Label(Locale locale, List<String> values) {
        entries = new HashMap<>();
        entries.put(locale, values);
    }

    public void addEntry(Locale locale, List<String> values) {
        if (entries.containsKey(locale)) {
            entries.get(locale).addAll(values);
        } else {
            entries.put(locale, values);
        }
    }

    JsonObject toJsonObject() {
        JsonObjectBuilder keyBuilder = Json.createObjectBuilder();
        entries.forEach((key, values) -> {
            JsonArrayBuilder valueBuilder = Json.createArrayBuilder();
            values.forEach(valueBuilder::add);
            keyBuilder.add(key != null ? key.toLanguageTag() : "none", valueBuilder);
        });

        return keyBuilder.build();
    }
}
