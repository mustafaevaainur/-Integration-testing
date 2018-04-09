package ru.ifmo.interfaces;

import java.math.BigDecimal;

public interface INaturalLog {

    BigDecimal calculate(double value) throws IllegalArgumentException;

}
