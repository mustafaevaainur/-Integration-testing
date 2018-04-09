package trigonometric;

import interfaces.ISine;
import utils.MathUtils;

import java.math.BigDecimal;

public class Cotangent {

    public ISine iSine;

    public Cotangent(ISine iSine) {
        this.iSine = iSine;
    }

    public BigDecimal calculate(double value) throws IllegalArgumentException {
        BigDecimal calcSine = iSine.calculate(value);
        if(MathUtils.nearZero(calcSine)) {
            throw new IllegalArgumentException();
        }
        BigDecimal first = calcSine.multiply(calcSine);
        BigDecimal cos= MathUtils.sqrt(BigDecimal.ONE.subtract(first));
        return cos.divide(calcSine, 30, BigDecimal.ROUND_FLOOR);
    }
}
