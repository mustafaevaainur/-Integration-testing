package ru.ifmo.trigonometric;

import ru.ifmo.interfaces.ISecant;
import ru.ifmo.interfaces.ISine;
import ru.ifmo.utils.MathUtils;

import java.math.BigDecimal;

public class Secant implements ISecant {

    ISine iSine;

    public Secant(ISine iSine) {
        this.iSine = iSine;
    }

    public BigDecimal calculate(double value) throws IllegalArgumentException {
        BigDecimal calcSine = iSine.calculate(value);
        BigDecimal cos = MathUtils.sqrt(BigDecimal.ONE.subtract(calcSine.multiply(calcSine))).multiply(MathUtils.signOfCosinus(value));
        if(MathUtils.nearZero(cos)) {
            throw new IllegalArgumentException();
        }
        return BigDecimal.ONE.divide(cos, 30, BigDecimal.ROUND_FLOOR);
    }
}
