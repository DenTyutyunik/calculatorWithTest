package org.tyutyunik.calculatorWithTest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Divide by 0")
public class DivideByZeroException extends RuntimeException {
    public DivideByZeroException() {
        super("[EXCEPTION] Divide by 0");
        System.out.println("[EXCEPTION] Divide by 0");
    }
}
