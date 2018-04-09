package ru.ifmo.interfaces;

import java.math.BigDecimal;

public interface ITangent {

    BigDecimal calculate(double value) throws IllegalArgumentException;

}
