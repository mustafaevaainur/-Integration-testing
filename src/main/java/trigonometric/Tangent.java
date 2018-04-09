package trigonometric;

import interfaces.ISine;
import interfaces.ITangent;
import org.hamcrest.core.Is;
import utils.MathUtils;

import java.math.BigDecimal;

public class Tangent implements ITangent {

    public ISine iSine;

    public Tangent(ISine iSine) {
        this.iSine = iSine;
    }

    public BigDecimal calculate(double value) throws IllegalArgumentException {
        BigDecimal calcSine = iSine.calculate(value);
        BigDecimal first = calcSine.multiply(calcSine);
        BigDecimal cos= MathUtils.sqrt(BigDecimal.ONE.subtract(first));
        if(MathUtils.nearZero(cos)) {
            throw new IllegalArgumentException();
        }
        return calcSine.divide(cos, 30, BigDecimal.ROUND_FLOOR);
    }
}
