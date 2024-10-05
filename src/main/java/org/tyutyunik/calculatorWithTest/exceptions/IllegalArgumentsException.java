package org.tyutyunik.calculatorWithTest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Divide by 0")
public class IllegalArgumentsException extends RuntimeException {
    public IllegalArgumentsException() {
        super("[EXCEPTION] Illegal arguments");
        System.out.println("[EXCEPTION] Illegal arguments");
    }
}
