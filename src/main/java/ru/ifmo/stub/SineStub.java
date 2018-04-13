package ru.ifmo.stub;

import ru.ifmo.interfaces.ISine;

import java.math.BigDecimal;

public class SineStub implements ISine {


    public BigDecimal calculate(double value) {
        if (value == -1.3d) return BigDecimal.valueOf(Math.sin(-1.3d));
        if (value == -0.01d) return  BigDecimal.valueOf(Math.sin(-0.01d));
        if (value == -5d) return BigDecimal.valueOf(Math.sin(-5d));
        if (value == -5.5d) return BigDecimal.valueOf(Math.sin(-5.5d));
        if (value == -7d) return BigDecimal.valueOf(Math.sin(-7d));
        if (value == -3d) return BigDecimal.valueOf(Math.sin(-3d));
        if (value == -6.7d) return BigDecimal.valueOf(Math.sin(-6.7d));
        else return null;
    }
}
