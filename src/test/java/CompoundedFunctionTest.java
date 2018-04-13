
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.ifmo.builder.CSVCreator;
import ru.ifmo.interfaces.*;
import ru.ifmo.logarithmic.LogBaseFive;
import ru.ifmo.logarithmic.LogBaseTwo;
import ru.ifmo.logarithmic.NaturalLog;
import ru.ifmo.system.CompoundedFunction;
import ru.ifmo.trigonometric.*;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.*;
public class CompoundedFunctionTest {

    final double EPS = 0.001;

    Sine fsin = new Sine(EPS);
    ICosine fcos = new Cosine(fsin);
    ISecant fsec = new Secant(fsin);
    ITangent ftan = new Tangent(fsin);
    ICotangent fcot = new Cotangent(fsin);
    INaturalLog ln = new NaturalLog(EPS);
    ILogBaseTwo flog2 = new LogBaseTwo(ln);
    ILogBaseFive flog5 = new LogBaseFive(ln);
    CompoundedFunction system = new CompoundedFunction(fsin, fcos, fsec, ftan, fcot, ln, flog2, flog5);

    CSVCreator csvCreator = new CSVCreator(fsin, ln, system);
    ArrayList<Double> values = new ArrayList<>();

    @Test
    public void SystemTestsFour(){
        values.add(-1.3d);
        values.add(-0.01d);
        values.add(-5d);
        values.add(-5.5d);
        values.add(-7d);
        values.add(-3d);
        values.add(-6.7d);
        values.add(2d);
        values.add(1.4d);
        values.add(5d);
        values.add(0.5d);
        for(Double value: values) {
            if(value >= 0 ){
                double log2 = Math.log(value)/Math.log(2);
                double log5 = Math.log(value)/Math.log(5);
                BigDecimal mathLogResult = BigDecimal.valueOf((((((log2+log2)-log2)*log2)*log2)/log5));
                BigDecimal sub = system.calculate(value).subtract(mathLogResult);
                assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
            } else {
                double sec = 1/Math.cos(value);
                double cot = Math.cos(value)/Math.sin(value);
                double tan = Math.tan(value);
                double cosn = Math.cos(value);
                double sin = Math.sin(value);
                BigDecimal mathTangResult = BigDecimal.valueOf(((((sec/tan/cot)*cosn)*sec)+(cosn/sin))-(sin+sin));
                BigDecimal sub = system.calculate(value).subtract(mathTangResult);
                assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
            }
        }
        csvCreator.fillFillByCompoundFunctionValues(-10, 5, 0.1);
    }


}
