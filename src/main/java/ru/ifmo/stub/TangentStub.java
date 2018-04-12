package ru.ifmo.stub;

import ru.ifmo.interfaces.ISine;
import ru.ifmo.interfaces.ITangent;

import java.math.BigDecimal;

public class TangentStub implements ITangent {
    public TangentStub(ISine sine) {}

    public BigDecimal calculate(double value) {
        if (value == 0) return BigDecimal.valueOf(Math.tan(0));
        if (value == Math.PI) return BigDecimal.valueOf(Math.tan(Math.PI));
        if (value == -Math.PI) return BigDecimal.valueOf(Math.tan(-Math.PI));
        if (value == Math.PI / 4) return BigDecimal.valueOf(Math.tan(Math.PI/4));
        if (value == -Math.PI / 4) return BigDecimal.valueOf(Math.tan(-Math.PI/4));
        else return null;
    }
}
