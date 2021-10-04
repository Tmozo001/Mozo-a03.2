package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution26Test {

    @Test
    void calcMonths() {
        int expected = 70;

        int actual = solution26.calcMonths(5000, (12.0/100)/365 , 100);

        assertEquals(expected,actual);
    }
}