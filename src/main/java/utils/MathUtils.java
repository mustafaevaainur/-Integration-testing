package utils;

import java.math.BigDecimal;

public class MathUtils {

    private static BigDecimal EPS = BigDecimal.valueOf(0.00001);

    public static BigDecimal sqrt(BigDecimal value) {
      return new BigDecimal(Math.sqrt(value.doubleValue()));
    }

    public static Boolean nearZero(BigDecimal value) {
        return value.compareTo(MathUtils.EPS) <= 0;
    }

}
