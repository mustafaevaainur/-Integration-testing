package logarithmic;

import interfaces.INaturalLog;

import java.math.BigDecimal;

public class NaturalLog implements INaturalLog {

    BigDecimal EPS;

    public NaturalLog(double eps) {
        this.EPS = new BigDecimal(eps);
    }

    public BigDecimal calculate(double value) {
        if(value <= 0) {
            throw new IllegalArgumentException();
        }
        if(value > 2) {
            return calculate(value / 2d).add(calculate(2));
        }
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal prevResult;
        BigDecimal minusOne = new BigDecimal(-1);
        int index = 1;
        do {
            prevResult = result;
            result= result
                    .add(minusOne
                            .pow(index + 1)
                            .divide(new BigDecimal(index), 30, BigDecimal.ROUND_FLOOR)
                            .multiply(new BigDecimal(value - 1).pow(index)));
            index ++;
        } while (result.subtract(prevResult).abs().compareTo(EPS) >= 0);
        return result;
    }
//
//    public BigDecimal calculate(double value) {
//        BigDecimal result = BigDecimal.ZERO;
//        BigDecimal prevResult;
//        BigDecimal minusOne = new BigDecimal(-1);
//        BigDecimal val = new BigDecimal(value);
//        int index = 1;
//        do {
//            prevResult = result;
//            result= result.add(
//                    BigDecimal.ONE.subtract(val)
//                    .divide(
//                            val.add(BigDecimal.ONE).multiply(new BigDecimal(2*index - 1)),
//                            30,
//                            BigDecimal.ROUND_FLOOR
//                    ).pow(2*index - 1)).multiply(new BigDecimal(2));
//            index ++;
//        } while (result.subtract(prevResult).abs().compareTo(EPS) >= 0);
//        return result;
//    }

}
