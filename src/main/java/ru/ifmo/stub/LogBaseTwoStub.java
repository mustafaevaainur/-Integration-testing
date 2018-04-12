package ru.ifmo.stub;

import ru.ifmo.interfaces.ILogBaseTwo;

import java.math.BigDecimal;

public class LogBaseTwoStub implements ILogBaseTwo {
    public BigDecimal calculate(double value) throws IllegalArgumentException {
        if (value == 0.5) return BigDecimal.valueOf(Math.log(0.5) / Math.log(2));
        if (value == 1) return BigDecimal.valueOf(Math.log(1) / Math.log(2));
        if (value == 2) return BigDecimal.valueOf(Math.log(2) / Math.log(2));
        if (value == 5) return BigDecimal.valueOf(Math.log(5) / Math.log(2));
        else return null;
    }
}
