package io.github.prezi4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

class LabelTest {

    private Label label;
    private List<String> values;

    @BeforeEach
    void setup() {
        values = new ArrayList<>(Collections.singletonList("IIIF manifests are fun"));
        label = new Label(Locale.ENGLISH, values);
    }

    @Test
    @DisplayName("Test that converting a label to a JsonObject is correct")
    void toJsonObject() {
        Assertions.assertEquals(label.toJsonObject().toString(),
                "{\"en\":[\"IIIF manifests are fun\"]}");
    }

    @Test
    @DisplayName("Test that we get 'none' as the language if Locale is null")
    void testNullLocale() {
        Label nullLocale = new Label(null, values);
        Assertions.assertEquals(nullLocale.toJsonObject().toString(),
                "{\"none\":[\"IIIF manifests are fun\"]}");
    }

    @Test
    @DisplayName("Test that adding a second language builds correctly")
    void testSecondLanguage() {
        label.addEntry(Locale.FRENCH,
                new ArrayList<>(Collections.singletonList("les manifestes de IIIF sont amusants")));
        Assertions.assertEquals(label.toJsonObject().toString(),
                "{\"fr\":[\"les manifestes de IIIF sont amusants\"]," +
                        "\"en\":[\"IIIF manifests are fun\"]}");
    }

    @Test
    @DisplayName("Test that we just add a second string if locale already exists")
    void testAddingSecondString() {
        label.addEntry(Locale.ENGLISH,
                new ArrayList<>(Collections.singletonList("as a box of mice")));
        Assertions.assertEquals(label.toJsonObject().toString(),
                "{\"en\":[\"IIIF manifests are fun\",\"as a box of mice\"]}");
    }

}