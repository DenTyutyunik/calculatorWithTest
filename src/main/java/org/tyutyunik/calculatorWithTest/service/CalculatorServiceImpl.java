package org.tyutyunik.calculatorWithTest.service;

import org.springframework.stereotype.Service;
import org.tyutyunik.calculatorWithTest.exceptions.DivideByZeroException;
import org.tyutyunik.calculatorWithTest.exceptions.IllegalArgumentsException;

@Service
public class CalculatorServiceImpl implements CalculatorInterface {
    public String standardAnswer() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Double num1, Double num2) {
        checkArguments(num1, num2);
        double result = num1 + num2;
        return String.format("%s + %s = %s", num1, num2, result);
    }

    public String minus(Double num1, Double num2) {
        checkArguments(num1, num2);
        double result = num1 - num2;
        return String.format("%s - %s = %s", num1, num2, result);
    }

    public String multiply(Double num1, Double num2) {
        checkArguments(num1, num2);
        double result = num1 * num2;
        return String.format("%s * %s = %s", num1, num2, result);
    }

    public String divide(Double num1, Double num2) {
        checkArguments(num1, num2);
        if (num2 == 0) {
            throw new DivideByZeroException();
        }
        double result = num1 / num2;
        return String.format("%s / %s = %s", num1, num2, result);
    }

    private void checkArguments(Double num1, Double num2) {
        if (num1.isNaN() || num2.isNaN()) {
            throw new IllegalArgumentsException();
        }
    }
}
