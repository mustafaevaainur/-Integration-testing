package ru.ifmo.stub;

import ru.ifmo.interfaces.INaturalLog;

import java.math.BigDecimal;

public class NaturalLogStub implements INaturalLog {
    public NaturalLogStub(double EPS) {}
    public BigDecimal calculate(double value) {
        if (value == 2d) return BigDecimal.valueOf(Math.log(2));
        if (value == 1.4d) return BigDecimal.valueOf(Math.log(1.4));
        if (value == 5d) return BigDecimal.valueOf(Math.log(5));
        if (value == 0.5d) return BigDecimal.valueOf(Math.log(0.5));
        else return null;
    }
}
