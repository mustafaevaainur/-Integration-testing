package ru.ifmo.utils;

import java.math.BigDecimal;
import java.math.MathContext;

public class MathUtils {

    private static BigDecimal EPS = BigDecimal.valueOf(0.00001);
    private static final BigDecimal TWO = BigDecimal.valueOf(2L);

    public static BigDecimal sqrt(BigDecimal value) {
        if(MathUtils.nearZero(value)) {
            return BigDecimal.ZERO;
        }
        if(value.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException();
        }
        MathContext mc = new MathContext(20);
        BigDecimal g = value.divide(TWO, mc);
        boolean done = false;
        final int maxIterations = mc.getPrecision() + 1;
        for (int i = 0; !done && i < maxIterations; i++) {
            // r = (x/g + g) / 2
            BigDecimal r = value.divide(g, mc);
            r = r.add(g);
            r = r.divide(TWO, mc);
            done = r.equals(g);
            g = r;
        }
        return g;
//        return new BigDecimal(Math.sqrt(value.doubleValue()));
    }

    public static BigDecimal signOfCosinus(double value) {
        double abs = Math.abs(value);
        if(abs % (2*Math.PI) < Math.PI / 2 || abs % (2*Math.PI) > Math.PI * 1.5) {
            return BigDecimal.ONE;
        } else return BigDecimal.ONE.negate();
    }

    public static Boolean nearZero(BigDecimal value) {
        return value.abs().compareTo(MathUtils.EPS) <= 0;
    }

}
