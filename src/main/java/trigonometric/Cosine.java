package trigonometric;

import interfaces.ICosine;
import interfaces.ISine;
import utils.MathUtils;

import java.math.BigDecimal;

public class Cosine implements ICosine {

    private ISine sineBase;

    public Cosine(ISine sine) {
        this.sineBase = sine;
    }

    public BigDecimal calculate(double value) {
        BigDecimal calcSine = sineBase.calculate(value);
        BigDecimal first = calcSine.multiply(calcSine);
        BigDecimal root = MathUtils.sqrt(BigDecimal.ONE.subtract(first));
        return root;
    }
}
