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
        if (value == Math.PI / 6) return BigDecimal.valueOf(Math.cos(Math.PI/6))
                .divide(BigDecimal.valueOf(Math.sin(Math.PI/6)), 30, BigDecimal.ROUND_FLOOR);
        if (value == Math.PI / 2) return BigDecimal.valueOf(Math.cos(Math.PI/2))
                .divide(BigDecimal.valueOf(Math.sin(Math.PI/2)), 30, BigDecimal.ROUND_FLOOR);
        if (value == -Math.PI / 2) return BigDecimal.valueOf(Math.cos(-Math.PI/2))
                .divide(BigDecimal.valueOf(Math.sin(-Math.PI/2)), 30, BigDecimal.ROUND_FLOOR);
        else {
            return BigDecimal.valueOf(Math.cos(value))
                    .divide(BigDecimal.valueOf(Math.sin(value)), 30, BigDecimal.ROUND_FLOOR);
        }
    }

}
