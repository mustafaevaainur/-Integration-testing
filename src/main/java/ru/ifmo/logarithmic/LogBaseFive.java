package ru.ifmo.logarithmic;

import ru.ifmo.interfaces.ILogBaseFive;

import java.math.BigDecimal;

public class LogBaseFive implements ILogBaseFive{

    private NaturalLog naturalLog;

    public LogBaseFive(NaturalLog logBase) { this.naturalLog = logBase; }

    public BigDecimal calculate(double value) throws IllegalArgumentException {
        BigDecimal calcLn = naturalLog.calculate(value);
        BigDecimal calcLn5 = naturalLog.calculate(5);
        BigDecimal result = calcLn.divide((calcLn5), 30, BigDecimal.ROUND_FLOOR);
        return result;
    }
}
