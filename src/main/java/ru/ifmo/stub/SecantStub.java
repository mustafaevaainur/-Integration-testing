package ru.ifmo.stub;

import ru.ifmo.interfaces.ISecant;
import ru.ifmo.interfaces.ISine;

import java.math.BigDecimal;

public class SecantStub implements ISecant {
    public SecantStub(ISine sine) {
    }

    public BigDecimal calculate(double value) throws IllegalArgumentException {

        if (value == -1.3d) return BigDecimal.ONE.
                divide(BigDecimal.valueOf(Math.cos(-1.3d)), 30, BigDecimal.ROUND_FLOOR);
        if (value == -0.01d) return BigDecimal.ONE.
                divide(BigDecimal.valueOf(Math.cos(-0.01d)), 30, BigDecimal.ROUND_FLOOR);
        if (value == -5d) return BigDecimal.ONE.
                divide(BigDecimal.valueOf(Math.cos(-5d)), 30, BigDecimal.ROUND_FLOOR);
        if (value == -5.5d) return BigDecimal.ONE.
                divide(BigDecimal.valueOf(Math.cos(-5.5d)), 30, BigDecimal.ROUND_FLOOR);
        if (value == -7d) return BigDecimal.ONE.
                divide(BigDecimal.valueOf(Math.cos(-7d)), 30, BigDecimal.ROUND_FLOOR);
        if (value == -3d) return BigDecimal.ONE.
                divide(BigDecimal.valueOf(Math.cos(-3d)), 30, BigDecimal.ROUND_FLOOR);
        if (value == -6.7d) return BigDecimal.ONE.
                divide(BigDecimal.valueOf(Math.cos(-6.7d)), 30, BigDecimal.ROUND_FLOOR);

        else return null;
    }
}
