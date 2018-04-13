package ru.ifmo.stub;

import ru.ifmo.interfaces.ICosine;
import ru.ifmo.interfaces.ISine;

import java.math.BigDecimal;

public class CosineStub implements ICosine {
    public CosineStub(ISine sine) {}

    public BigDecimal calculate(double value) {
        double sqrt2div2 = Math.cos(Math.PI/4);
        double sqrt3div2 = Math.cos(Math.PI/3);
        if (value == 0) return  BigDecimal.valueOf(Math.cos(0));
        if (value == Math.PI / 2) return BigDecimal.valueOf(Math.cos(Math.PI/2));
        if (value == Math.PI / 4) return BigDecimal.valueOf(sqrt2div2);
        if (value == -Math.PI / 2) return BigDecimal.valueOf(Math.cos(-Math.PI/2));
        if (value == -Math.PI/4) return BigDecimal.valueOf(Math.cos(-Math.PI/4));
        else return BigDecimal.valueOf(Math.cos(value));
    }
}
