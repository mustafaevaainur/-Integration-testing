package utils;

import java.math.BigDecimal;

public class MathUtils {
  public static BigDecimal sqrt(BigDecimal value) {
      return new BigDecimal(Math.sqrt(value.doubleValue()));
  }
}
