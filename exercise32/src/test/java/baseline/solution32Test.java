package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution32Test {

    @Test
    void dif1() {
        double expected = (int)(Math.random() * 10 + 1);
        double actual = (int)(Math.random() * 10 + 1);
    }
    @Test
    void dif2() {
        double expected = (int)(Math.random() * 100 + 1);
        double actual = (int)(Math.random() * 100 + 1);
    }
    @Test
    void dif3() {
        double expected = (int)(Math.random() * 1000 + 1);
        double actual = (int)(Math.random() * 1000 + 1);
    }
    @Test
    void letTheGameBegin() {
    }

    @Test
    void guessTheNumber() {
    }
}