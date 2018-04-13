package ru.ifmo.stub;

import ru.ifmo.interfaces.ISine;
import ru.ifmo.interfaces.ITangent;

import java.math.BigDecimal;

public class TangentStub implements ITangent {
    public TangentStub(ISine sine) {}

    public BigDecimal calculate(double value) {
        if (value == -1.3d) return BigDecimal.valueOf(Math.tan(-1.3d));
        if (value == -0.01d) return  BigDecimal.valueOf(Math.tan(-0.01d));
        if (value == -5d) return BigDecimal.valueOf(Math.tan(-5d));
        if (value == -5.5d) return BigDecimal.valueOf(Math.tan(-5.5d));
        if (value == -7d) return BigDecimal.valueOf(Math.tan(-7d));
        if (value == -3d) return BigDecimal.valueOf(Math.tan(-3d));
        if (value == -6.7d) return BigDecimal.valueOf(Math.tan(-6.7d));
        else return null;
    }
}
