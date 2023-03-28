package jp.co.plusvision.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void test() {
        assertEquals(Calculator.sum(1, 1), 2);
    }
}
