import ru.ifmo.interfaces.*;
import ru.ifmo.logarithmic.LogBaseFive;
import ru.ifmo.logarithmic.LogBaseTwo;
import ru.ifmo.logarithmic.NaturalLog;
import ru.ifmo.system.CompoundedFunction;
import ru.ifmo.trigonometric.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Sine fsin = new Sine(0.001);
        ICosine fcos = new Cosine(fsin);
        ISecant fsec = new Secant(fsin);
        ITangent ftan = new Tangent(fsin);
        ICotangent fcot = new Cotangent(fsin);
        INaturalLog ln = new NaturalLog(0.001);
        ILogBaseTwo flog2 = new LogBaseTwo(ln);
        ILogBaseFive flog5 = new LogBaseFive(ln);
        CompoundedFunction system = new CompoundedFunction(fsin, fcos, fsec, ftan, fcot, ln, flog2, flog5);


        double value = -1.4;

        double sec = 1 / Math.cos(value);
        double cot = Math.cos(value) / Math.sin(value);
        double tan = Math.tan(value);
        double cosn = Math.cos(value);
        double sin = Math.sin(value);

        //  x <= 0 : ((((((sec(x) / tan(x)) / cot(x)) * cos(x)) * sec(x)) + (cos(x) / sin(x))) - (sin(x) + sin(x)))

        BigDecimal mathTangResult = BigDecimal.valueOf(((((sec / tan / cot) * cosn) * sec) + (cosn / sin)) - (sin + sin));

        //  x > 0 : (((((log_2(x) + log_2(x)) - log_2(x)) * log_2(x)) * log_2(x)) / log_5(x))

        double log2 = Math.log(value) / Math.log(2);
        double log5 = Math.log(value) / Math.log(5);

        /* BigDecimal mathLogResult = BigDecimal.valueOf((((((log2+log2)-log2)*log2)*log2)/log5));*/

        BigDecimal result = system.calculate(value);
        java.lang.System.out.println(result);
        java.lang.System.out.println("MathTangResult:" + mathTangResult);
        /*system.out.println("MathLogResult:" + mathLogResult);*/
    }
}

