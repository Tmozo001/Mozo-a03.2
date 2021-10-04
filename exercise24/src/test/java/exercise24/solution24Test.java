package exercise24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution24Test {

    @Test
    void isAnagram() {
        boolean expected = true;
        boolean actual = solution24.isAnagram("note", "tone");
        assertEquals(expected, actual);
    }

    @Test
    void isNotAnagram() {
        boolean expected = false;
        // the actual output should be = to "rainbow" and "sky"
        boolean actual = solution24.isAnagram("square", "circle");
        assertEquals(expected, actual);

    }

}