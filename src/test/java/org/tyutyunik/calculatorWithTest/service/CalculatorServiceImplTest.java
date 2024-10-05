package org.tyutyunik.calculatorWithTest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tyutyunik.calculatorWithTest.exceptions.DivideByZeroException;
import org.tyutyunik.calculatorWithTest.exceptions.IllegalArgumentsException;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void standardAnswer() {
        Assertions.assertNotNull(calculatorService.standardAnswer());
    }

    @Test
    public void plus() {
        Assertions.assertEquals("2.0 + 3.0 = 5.0", calculatorService.plus(2.0, 3.0));
    }

    @Test
    public void minus() {
        Assertions.assertEquals("5.0 - 3.0 = 2.0", calculatorService.minus(5.0, 3.0));
    }

    @Test
    public void multiply() {
        Assertions.assertEquals("2.0 * 3.0 = 6.0", calculatorService.multiply(2.0, 3.0));
    }

    @Test
    public void divide() {
        Assertions.assertEquals("6.0 / 2.0 = 3.0", calculatorService.divide(6.0, 2.0));
    }

    @Test
    public void divide_ByZero() {
        Assertions.assertThrows(DivideByZeroException.class, () -> calculatorService.divide(5.0, 0.0));
    }

    @Test
    public void illegalArguments() {
        Assertions.assertThrows(IllegalArgumentsException.class, () -> calculatorService.plus(Double.NaN, 3.0));
    }
}