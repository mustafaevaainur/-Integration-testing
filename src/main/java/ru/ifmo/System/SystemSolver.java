package ru.ifmo.System;

import ru.ifmo.interfaces.ISystemSolver;
import ru.ifmo.logarithmic.LogBaseFive;
import ru.ifmo.logarithmic.LogBaseTwo;
import ru.ifmo.logarithmic.NaturalLog;
import ru.ifmo.trigonometric.*;

import java.math.BigDecimal;

public class SystemSolver implements ISystemSolver{

    private final double EPS = 0.01;

    //  x <= 0 : ((((((sec(x) / tan(x)) / cot(x)) * cos(x)) * sec(x)) + (cos(x) / sin(x))) - (sin(x) + sin(x)))

    private BigDecimal trigonometricFunction(double value) {
        Sine fsin = new Sine(EPS);
        Cosine fcos = new Cosine(fsin);
        Secant fsec = new Secant(fsin);
        Tangent ftan = new Tangent(fsin);
        Cotangent fcot = new Cotangent(fsin);

        BigDecimal sin = fsin.calculate(value);
        BigDecimal cos = fcos.calculate(value);
        BigDecimal tan = ftan.calculate(value);
        BigDecimal cot = fcot.calculate(value);
        BigDecimal sec = fsec.calculate(value);

        BigDecimal system = (((sec.divide((tan), 30, BigDecimal.ROUND_FLOOR)
                .divide((cot), 30, BigDecimal.ROUND_FLOOR)
                .multiply(cos)).multiply(sec)).add(cos.divide((sin), 30, BigDecimal.ROUND_FLOOR))
                .subtract((sin.add(sin))));
        return system;
    }

    //  x > 0 : (((((log_2(x) + log_2(x)) - log_2(x)) * log_2(x)) * log_2(x)) / log_5(x))

    private BigDecimal logarithmicFunction(double value) {
        NaturalLog ln = new NaturalLog(EPS);
        LogBaseTwo flog2 = new LogBaseTwo(ln);
        LogBaseFive flog5 = new LogBaseFive(ln);

        BigDecimal log2 = flog2.calculate(value);
        BigDecimal log5 = flog5.calculate(value);
        BigDecimal system = (((((log2.add(log2))
                                        .subtract(log2))
                                        .multiply(log2))
                                        .multiply(log2))
                .divide((log5), 30, BigDecimal.ROUND_FLOOR));
        return system;
    }

    public BigDecimal calculate(double value) {
        if (value <= 0) {
            return trigonometricFunction(value);
        } else {
            return logarithmicFunction(value);
        }
    }
}
