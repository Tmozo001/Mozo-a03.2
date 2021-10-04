package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution28Test {

    @Test
    void loop() {
        int expected = 15;
        int actual = solution28.loop();
        assertEquals(expected,actual);
    }
}