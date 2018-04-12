package ru.ifmo.utils;

import java.math.BigDecimal;
import java.math.MathContext;

public class MathUtils {

    private static BigDecimal EPS = BigDecimal.valueOf(0.00001);

    /*public static BigDecimal sqrt(BigDecimal value) {
      return new BigDecimal(Math.sqrt(value.doubleValue()));
    }*/

    private static final BigDecimal TWO = BigDecimal.valueOf(2L);

    public static BigDecimal sqrt(BigDecimal value) {
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
    }

    public static Boolean nearZero(BigDecimal value) {
        return value.compareTo(MathUtils.EPS) <= 0;
    }

}
