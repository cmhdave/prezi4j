package io.github.prezi4j;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ViewingDirectionTest {

    @Test
    @DisplayName("Test that we can get a viewingDirection string")
    void testViewingDirectionString() {
        Assertions.assertEquals(ViewingDirection.RTL.value, "right-to-left");
    }

    @Test
    @DisplayName("Test that we can convert a string to a valid ViewingDirection")
    void testToViewingDirection() {
        Assertions.assertEquals(ViewingDirection.valueOfLabel("left-to-right"),
                ViewingDirection.LTR);
    }

}