import ru.ifmo.builder.CSVCreator;
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

        CSVCreator csvCreator = new CSVCreator();
        csvCreator.fillFillBySinValues(-5,  5,  0.1);
    }
}

