package ru.ifmo.stub;

import ru.ifmo.interfaces.ISecant;
import ru.ifmo.interfaces.ISine;

import java.math.BigDecimal;

public class SecantStub implements ISecant {
    public SecantStub(ISine sine) {
    }

    public BigDecimal calculate(double value) throws IllegalArgumentException {
        if (value == 0) return BigDecimal.ONE.divide(BigDecimal.valueOf(Math.cos(0)), 30, BigDecimal.ROUND_FLOOR);
        if (value == Math.PI) return BigDecimal.ONE.divide(BigDecimal.valueOf(Math.cos(Math.PI)), 30, BigDecimal.ROUND_FLOOR);
        if( value == -Math.PI) return BigDecimal.ONE.divide(BigDecimal.valueOf(Math.cos(-Math.PI)), 30, BigDecimal.ROUND_FLOOR);
        if (value == Math.PI / 4 ) return BigDecimal.ONE.divide(BigDecimal.valueOf(Math.cos(Math.PI/4)), 30, BigDecimal.ROUND_FLOOR);
        if (value == -Math.PI / 4) return BigDecimal.ONE.divide(BigDecimal.valueOf(Math.cos(-Math.PI/4)), 30, BigDecimal.ROUND_FLOOR);
        else return null;
    }
}
