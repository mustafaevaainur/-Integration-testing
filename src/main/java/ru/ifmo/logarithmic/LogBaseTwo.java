package ru.ifmo.logarithmic;

import ru.ifmo.interfaces.ILogBaseTwo;
import ru.ifmo.interfaces.INaturalLog;

import java.math.BigDecimal;

public class LogBaseTwo implements ILogBaseTwo{

    private INaturalLog naturalLog;

    public LogBaseTwo(INaturalLog logBase) { this.naturalLog = logBase; }

    public BigDecimal calculate(double value) throws IllegalArgumentException {
        BigDecimal calcLn = naturalLog.calculate(value);
        BigDecimal calcLn2 = naturalLog.calculate(2);
        BigDecimal result = calcLn.divide((calcLn2), 30, BigDecimal.ROUND_FLOOR);
        return result;
    }
}
