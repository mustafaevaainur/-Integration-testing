package ru.ifmo.stub;

import org.omg.CORBA.MARSHAL;
import ru.ifmo.interfaces.ICosine;
import ru.ifmo.interfaces.ICotangent;
import ru.ifmo.interfaces.ISine;

import java.math.BigDecimal;

public class CotangentStub implements ICotangent {
    public CotangentStub(ISine sine) {
    }

    public BigDecimal calculate(double value) {
        if (value == -1.3d) return BigDecimal.valueOf(Math.cos(-1.3d))
                .divide(BigDecimal.valueOf(Math.sin(-1.3d)), 30, BigDecimal.ROUND_FLOOR);
        ;
        if (value == -0.01d) return BigDecimal.valueOf(Math.cos(-0.01d))
                .divide(BigDecimal.valueOf(Math.sin(-0.01d)), 30, BigDecimal.ROUND_FLOOR);
        if (value == -5d) return BigDecimal.valueOf(Math.cos(-5d))
                .divide(BigDecimal.valueOf(Math.sin(-5d)), 30, BigDecimal.ROUND_FLOOR);
        if (value == -5.5d) return BigDecimal.valueOf(Math.cos(-5.5d))
                .divide(BigDecimal.valueOf(Math.sin(-5.5d)), 30, BigDecimal.ROUND_FLOOR);
        if (value == -7d) return BigDecimal.valueOf(Math.cos(-7d))
                .divide(BigDecimal.valueOf(Math.sin(-7d)), 30, BigDecimal.ROUND_FLOOR);
        if (value == -3d) return BigDecimal.valueOf(Math.cos(-3d))
                .divide(BigDecimal.valueOf(Math.sin(-3d)), 30, BigDecimal.ROUND_FLOOR);
        if (value == -6.7d) return BigDecimal.valueOf(Math.cos(-6.7d))
                .divide(BigDecimal.valueOf(Math.sin(-6.7d)), 30, BigDecimal.ROUND_FLOOR);
        else return null;
    }

}
