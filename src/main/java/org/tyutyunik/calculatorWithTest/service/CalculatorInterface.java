package org.tyutyunik.calculatorWithTest.service;

public interface CalculatorInterface {
    String standardAnswer();

    String plus(Double num1, Double num2);

    String minus(Double num1, Double num2);

    String multiply(Double num1, Double num2);

    String divide(Double num1, Double num2);
}
