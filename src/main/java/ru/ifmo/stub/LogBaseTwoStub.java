package ru.ifmo.stub;

import ru.ifmo.interfaces.ILogBaseTwo;

import java.math.BigDecimal;

public class LogBaseTwoStub implements ILogBaseTwo {
    public BigDecimal calculate(double value) throws IllegalArgumentException {
        if (value == 1.4d) return BigDecimal.valueOf(Math.log(1.4d) / Math.log(2));
        if (value == 0.5d) return BigDecimal.valueOf(Math.log(0.5d) / Math.log(2));
        if (value == 2d) return BigDecimal.valueOf(Math.log(2d) / Math.log(2));
        if (value == 5d) return BigDecimal.valueOf(Math.log(5d) / Math.log(2));
        else return null;
    }
}

