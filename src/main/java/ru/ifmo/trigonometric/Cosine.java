package ru.ifmo.trigonometric;

import ru.ifmo.interfaces.ICosine;
import ru.ifmo.interfaces.ISine;
import ru.ifmo.utils.MathUtils;

import java.math.BigDecimal;

public class Cosine implements ICosine {

    private ISine sineBase;

    public Cosine(ISine sine) {
        this.sineBase = sine;
    }

    public BigDecimal calculate(double value) {
        MathUtils MathUtils = new MathUtils();
        BigDecimal calcSine = sineBase.calculate(value);
        BigDecimal first = calcSine.multiply(calcSine);
        BigDecimal root = MathUtils.sqrt(BigDecimal.ONE.subtract(first));
        return root;
    }
}
