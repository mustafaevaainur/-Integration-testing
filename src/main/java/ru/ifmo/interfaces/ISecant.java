package ru.ifmo.interfaces;

import java.math.BigDecimal;

public interface ISecant {

    BigDecimal calculate(double value) throws IllegalArgumentException;

}
