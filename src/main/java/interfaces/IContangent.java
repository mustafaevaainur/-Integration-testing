package interfaces;

import java.math.BigDecimal;

public interface IContangent {

    BigDecimal calculate(double value) throws IllegalArgumentException;

}
