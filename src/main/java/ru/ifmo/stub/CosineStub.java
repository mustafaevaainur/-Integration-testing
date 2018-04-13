package ru.ifmo.stub;

import ru.ifmo.interfaces.ICosine;
import ru.ifmo.interfaces.ISine;

import java.math.BigDecimal;

public class CosineStub implements ICosine {
    public CosineStub(ISine sine) {}

    public BigDecimal calculate(double value) {

        if (value == -1.3d) return BigDecimal.valueOf(Math.cos(-1.3d));
        if (value == -0.01d) return  BigDecimal.valueOf(Math.cos(-0.01d));
        if (value == -5d) return BigDecimal.valueOf(Math.cos(-5d));
        if (value == -5.5d) return BigDecimal.valueOf(Math.cos(-5.5d));
        if (value == -7d) return BigDecimal.valueOf(Math.cos(-7d));
        if (value == -3d) return BigDecimal.valueOf(Math.cos(-3d));
        if (value == -6.7d) return BigDecimal.valueOf(Math.cos(-6.7d));
        else return null;
    }
}
