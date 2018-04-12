package ru.ifmo.stub;

import ru.ifmo.interfaces.ICosine;
import ru.ifmo.interfaces.ISine;

import java.math.BigDecimal;

import static java.lang.Math.*;

public class CosineStub implements ICosine {
    public CosineStub(ISine sine) {}

    public BigDecimal calculate(double value) {
        double sqrt2div2 = cos(PI/4);
        double sqrt3div2 = cos(PI/3);
        if (value == 0) return  BigDecimal.valueOf(cos(0));
        if (value == PI) return BigDecimal.valueOf(cos(PI));
        if (value == PI / 2) return BigDecimal.valueOf(cos(PI/2));
        if (value == PI / 4) return BigDecimal.valueOf(sqrt2div2);
        if (value == -PI / 2) return BigDecimal.valueOf(cos(-PI/2));
        if (value == -PI/4) return BigDecimal.valueOf(cos(-PI/4));
        else return null;
    }
}
