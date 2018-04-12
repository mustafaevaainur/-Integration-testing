package ru.ifmo.stub;

import ru.ifmo.interfaces.IMathUtils;

import java.math.BigDecimal;

public class MathUtilsStub implements IMathUtils {
    public BigDecimal sqrt(BigDecimal value) {
        if (value.compareTo(BigDecimal.valueOf(2))==0) return BigDecimal.valueOf(Math.sqrt(2));
        if (value.compareTo(BigDecimal.valueOf(4))==0) return BigDecimal.valueOf(Math.sqrt(4));
        if (value.compareTo(BigDecimal.valueOf(5))==0) return BigDecimal.valueOf(Math.sqrt(5));
        else return null;
    }
}
