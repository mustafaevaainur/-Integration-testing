import ru.ifmo.interfaces.ISystemSolver;
import ru.ifmo.logarithmic.LogBaseFive;
import ru.ifmo.logarithmic.LogBaseTwo;
import ru.ifmo.logarithmic.NaturalLog;
import ru.ifmo.trigonometric.*;

import java.math.BigDecimal;

public class SystemSolver implements ISystemSolver{

    final double EPS = 0.01;
    //  x <= 0 : ((((((sec(x) / tan(x)) / cot(x)) * cos(x)) * sec(x)) + (cos(x) / sin(x))) - (sin(x) + sin(x)))

    public BigDecimal trigonometricFunction(double value) {
        Sine sin = new Sine(EPS);
        Cosine cos = new Cosine(sin);
        Secant sec = new Secant(sin);
        Tangent tan = new Tangent(sin);
        Cotangent cot = new Cotangent(sin);

        BigDecimal firstPart = (sec.calculate(value).divide(tan.calculate(value), 30, BigDecimal.ROUND_FLOOR)
                .divide(cot.calculate(value), 30, BigDecimal.ROUND_FLOOR)
                .multiply(cos.calculate(value))
                .multiply(sec.calculate(value)));
        BigDecimal secondPart = ((cos.calculate(value).divide(sin.calculate(value), 30, BigDecimal.ROUND_FLOOR))
                .subtract((sin.calculate(value).add(sin.calculate(value)))));

        BigDecimal system = firstPart.add(secondPart);
        return system;
    }

    //  x > 0 : (((((log_2(x) + log_2(x)) - log_2(x)) * log_2(x)) * log_2(x)) / log_5(x))

    public BigDecimal logarithmicFunction(double value) {
        NaturalLog ln = new NaturalLog(EPS);
        LogBaseTwo log2 = new LogBaseTwo(ln);
        LogBaseFive log5 = new LogBaseFive(ln);

        BigDecimal system = ((((log2.calculate(value)
                .add(log2.calculate(value))).subtract(log2.calculate(value)))
                .multiply(log2.calculate(value))
                .multiply(log2.calculate(value))).divide(log5.calculate(value)));
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
