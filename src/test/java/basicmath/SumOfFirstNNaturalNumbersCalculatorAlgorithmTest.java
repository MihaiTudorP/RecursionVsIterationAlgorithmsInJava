package basicmath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfFirstNNaturalNumbersCalculatorAlgorithmTest {

    @Test
    void sumNumbersIteratively() {
        assertEquals(10, SumOfFirstNNaturalNumbersCalculatorAlgorithm.sumNumbersIteratively(4));
        assertEquals(210, SumOfFirstNNaturalNumbersCalculatorAlgorithm.sumNumbersIteratively(20));
    }

    @Test
    void sumNumbersRecursively() {
        assertEquals(10, SumOfFirstNNaturalNumbersCalculatorAlgorithm.sumNumbersRecursively(4));
        assertEquals(210, SumOfFirstNNaturalNumbersCalculatorAlgorithm.sumNumbersRecursively(20));
    }

    @Test
    void sumNumbersFormula() {
        assertEquals(10, SumOfFirstNNaturalNumbersCalculatorAlgorithm.sumNumbersFormula(4));
        assertEquals(210, SumOfFirstNNaturalNumbersCalculatorAlgorithm.sumNumbersFormula(20));
    }
}