package trigonometric;

import java.math.BigDecimal;

public class Sine implements ISine {

    public BigDecimal calculate(double value, double eps) {
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal prevResult = BigDecimal.ZERO;
        BigDecimal EPS = new BigDecimal(eps);
        int index = 0;
        do {
            result= result
                    .add (new BigDecimal(-1))
                    .pow(index)
                    .multiply((new BigDecimal(value))
                            .pow(1+2*index))
                    .divide(factorial(1+2*index), 30, BigDecimal.ROUND_FLOOR);
        } while (result.subtract(prevResult).abs().compareTo(EPS) <= 0);
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
