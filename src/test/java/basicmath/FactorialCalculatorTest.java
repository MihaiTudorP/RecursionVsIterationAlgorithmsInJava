package basicmath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void calculateFactorialIteratively() {
        assertEquals(24, FactorialCalculator.calculateFactorialIteratively(4));
        assertEquals(3628800, FactorialCalculator.calculateFactorialIteratively(10));
    }

    @Test
    void calculateFactorialRecursively() {
        assertEquals(24, FactorialCalculator.calculateFactorialRecursively(4));
        assertEquals(3628800, FactorialCalculator.calculateFactorialRecursively(10));
    }
}