package ru.ifmo.stub;

import java.math.BigDecimal;

public class SystemSolverStub {
    public BigDecimal calculate(double value) throws IllegalArgumentException {
        double log2 = Math.log(value) / Math.log(2);
        double log5 = Math.log(value) / Math.log(5);
        double sec = 1 / Math.cos(value);
        double cot = Math.cos(value) / Math.sin(value);
        double tan = Math.tan(value);
        double cosn = Math.cos(value);
        double sin = Math.sin(value);

        if (value == 2) return BigDecimal.valueOf((((((log2 + log2) - log2) * log2) * log2) / log5));
        if (value == 1.4) return BigDecimal.valueOf((((((log2 + log2) - log2) * log2) * log2) / log5));
        if (value == -1.3) return BigDecimal.valueOf(((((sec / tan / cot) * cosn) * sec) + (cosn / sin)) - (sin + sin));
        if (value == -0.01)
            return BigDecimal.valueOf(((((sec / tan / cot) * cosn) * sec) + (cosn / sin)) - (sin + sin));

        else return null;
    }
}
