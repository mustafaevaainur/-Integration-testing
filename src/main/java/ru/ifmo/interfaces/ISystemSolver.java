package ru.ifmo.interfaces;

import java.math.BigDecimal;

public interface ISystemSolver {

    BigDecimal calculate (double value) throws IllegalArgumentException;
}
