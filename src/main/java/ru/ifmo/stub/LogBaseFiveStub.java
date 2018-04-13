package ru.ifmo.stub;

import ru.ifmo.interfaces.ILogBaseFive;

import java.math.BigDecimal;

public class LogBaseFiveStub implements ILogBaseFive {
    public BigDecimal calculate(double value) throws IllegalArgumentException {
        if (value == 0.5) return BigDecimal.valueOf(Math.log(0.5)/Math.log(5));
        if (value == 1) return BigDecimal.valueOf(Math.log(1)/Math.log(5));
        if (value == 2) return BigDecimal.valueOf(Math.log(2)/Math.log(5));
        if (value == 5) return BigDecimal.ONE;
        else return BigDecimal.valueOf(Math.log(value)/Math.log(5));
    }
}
