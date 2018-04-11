package ru.ifmo.stub;

import ru.ifmo.interfaces.ISine;

import java.math.BigDecimal;

public class SineStub implements ISine {
    public BigDecimal calculate(double value) {
        double sqrt2div2 = Math.sqrt(2)/2;
        double sqrt3div2 = Math.sqrt(3)/2;
        if (value == 0) return  BigDecimal.valueOf(0);
        if (value == Math.PI) return BigDecimal.valueOf(0);
        if (value == Math.PI / 2) return BigDecimal.valueOf(1);
        if (value == Math.PI / 6) return BigDecimal.valueOf(0.5);
        if (value == Math.PI / 4) return BigDecimal.valueOf(sqrt2div2);
        if (value == Math.PI / 3) return BigDecimal.valueOf(sqrt3div2);
        if (value == 2*Math.PI/3) return BigDecimal.valueOf(sqrt3div2);
        if (value == 3*Math.PI/4) return BigDecimal.valueOf(sqrt2div2);
        if (value == 5*Math.PI/6) return BigDecimal.valueOf(0.5);
        else return null;
    }
}
