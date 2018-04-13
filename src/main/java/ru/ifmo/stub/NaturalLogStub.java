package ru.ifmo.stub;

import ru.ifmo.interfaces.INaturalLog;

import java.math.BigDecimal;

public class NaturalLogStub implements INaturalLog {
    public NaturalLogStub(double EPS) {}
    public BigDecimal calculate(double value) {
        if (value == 0.5) return BigDecimal.valueOf(Math.log(0.5));
        if (value == 1) return BigDecimal.valueOf(Math.log(1));
        if (value == 2) return BigDecimal.valueOf(Math.log(2));
        if (value == 5) return BigDecimal.valueOf(Math.log(5));
        else return null;
    }
}
