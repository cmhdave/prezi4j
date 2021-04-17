package io.github.prezi4j;

import java.util.HashMap;
import java.util.Map;

public enum ViewingDirection {
    LTR("left-to-right"),
    RTL("right-to-left"),
    TTB("top-to-bottom"),
    BTT("bottom-to-top");

    private static final Map<String, ViewingDirection> BY_LABEL = new HashMap<>();

    static {
        for (ViewingDirection e : values()) {
            BY_LABEL.put(e.value, e);
        }
    }

    public final String value;

    ViewingDirection(String value) {
        this.value = value;
    }

    public static ViewingDirection valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }
}
