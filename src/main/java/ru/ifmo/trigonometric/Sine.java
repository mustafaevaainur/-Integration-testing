package ru.ifmo.trigonometric;

import ru.ifmo.interfaces.ISine;

import java.math.BigDecimal;

public class Sine implements ISine {

    BigDecimal EPS;

    public Sine(double eps) {
        this.EPS = new BigDecimal(eps);
    }

    public BigDecimal calculate(double value) {
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal prevResult;
        BigDecimal minusOne = new BigDecimal(-1);
        int index = 0;
        do {
            prevResult = result;
            result= result
                    .add (minusOne.pow(index)
                                    .multiply((new BigDecimal(value)).pow(1+2*index))
                                    .divide(factorial(1+2*index), 30, BigDecimal.ROUND_FLOOR));
            index ++;
        } while (result.subtract(prevResult).abs().compareTo(EPS) >= 0);
        return result;
    }

    private BigDecimal factorial(int value) {
        BigDecimal acc = new BigDecimal(1);
        for (int i = 1; i <= value; i++) {
            acc = acc.multiply(new BigDecimal(i));
        }
        return acc;
    }
}
