package ru.ifmo.stub;

import ru.ifmo.interfaces.ISine;

import java.math.BigDecimal;

public class SineStub implements ISine {


    public BigDecimal calculate(double value) {
        double sqrt2div2 = Math.sin(Math.PI/4);
        double sqrt3div2 = Math.sin(Math.PI/3);
        if (value == 0) return  BigDecimal.valueOf(Math.sin(0));
        if (value == Math.PI) return BigDecimal.valueOf(Math.sin(Math.PI));
        if (value == Math.PI / 2) return BigDecimal.valueOf(Math.sin(Math.PI/2));
        if (value == Math.PI / 6) return BigDecimal.valueOf(Math.sin(Math.PI/6));
        if (value == Math.PI / 4) return BigDecimal.valueOf(sqrt2div2);
        if (value == Math.PI / 3) return BigDecimal.valueOf(sqrt3div2);
        else return null;
    }
}
