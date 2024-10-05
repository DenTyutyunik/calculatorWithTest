package org.tyutyunik.calculatorWithTest.controller;

import org.springframework.web.bind.annotation.*;
import org.tyutyunik.calculatorWithTest.service.CalculatorServiceImpl;

import java.util.OptionalDouble;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("")
    public String standardAnswer() {
        return calculatorService.standardAnswer();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Double num1,
                       @RequestParam Double num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam Double num1,
                        @RequestParam Double num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Double num1,
                           @RequestParam Double num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Double num1,
                         @RequestParam Double num2) {
        return calculatorService.divide(num1, num2);
    }
}
