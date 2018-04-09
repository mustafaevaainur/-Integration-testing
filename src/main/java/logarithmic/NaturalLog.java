package logarithmic;

import java.math.BigDecimal;

public class NaturalLog implements INaturalLog {

    public BigDecimal calculate(double value, double eps) {
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal prevResult = BigDecimal.ZERO;
        BigDecimal EPS = new BigDecimal(eps);
        BigDecimal minusOne = new BigDecimal(-1);
        int index = 1;
        do {
            prevResult = result;
            result= result
                    .add(minusOne
                            .pow(index + 1)
                            .divide(new BigDecimal(index), 30, BigDecimal.ROUND_FLOOR)
                            .multiply(new BigDecimal(value - 1)
                                    .pow(index)));
        } while (result.subtract(prevResult).abs().compareTo(EPS) <= 0);
        return result;
    }

}
