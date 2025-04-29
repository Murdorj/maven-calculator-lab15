package lab15.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    void testMultiplyPositive() {
        Multiplication calc = new Multiplication();
        assertEquals(6.0, calc.multiply(2.0, 3.0), "2 * 3 нь 6 байх ёстой");
    }

    @Test
    void testMultiplyNegative() {
        Multiplication calc = new Multiplication();
        assertEquals(-6.0, calc.multiply(-2.0, 3.0), "-2 * 3 нь -6 байх ёстой");
    }
}
