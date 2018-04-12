package ru.ifmo.logarithmic;

import ru.ifmo.interfaces.ILogBaseFive;
import ru.ifmo.interfaces.INaturalLog;

import java.math.BigDecimal;

public class LogBaseFive implements ILogBaseFive{


    private INaturalLog naturalLog;

    public LogBaseFive(INaturalLog logBase) { this.naturalLog = logBase; }

    public BigDecimal calculate(double value) throws IllegalArgumentException {
        BigDecimal calcLn = naturalLog.calculate(value);
        BigDecimal calcLn5 = naturalLog.calculate(5);
        BigDecimal result = calcLn.divide((calcLn5), 30, BigDecimal.ROUND_FLOOR);
        return result;
    }
}
