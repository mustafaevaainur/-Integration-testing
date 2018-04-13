import org.junit.Test;
import ru.ifmo.interfaces.*;
import ru.ifmo.logarithmic.LogBaseFive;
import ru.ifmo.logarithmic.LogBaseTwo;
import ru.ifmo.logarithmic.NaturalLog;
import ru.ifmo.stub.*;
import ru.ifmo.system.CompoundedFunction;
import ru.ifmo.trigonometric.*;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CompoundedFunctionTestStub {

    final double EPS = 0.001;

    ISine fsin = new SineStub();
    ICosine fcos = new CosineStub(fsin);
    ISecant fsec = new SecantStub(fsin);
    ITangent ftan = new TangentStub(fsin);
    ICotangent fcot = new CotangentStub(fsin);
    INaturalLog ln = new NaturalLogStub(EPS);
    ILogBaseTwo flog2 = new LogBaseTwoStub();
    ILogBaseFive flog5 = new LogBaseFiveStub();

    CompoundedFunction system = new CompoundedFunction(fsin, fcos, fsec, ftan, fcot, ln, flog2, flog5);


    @Test
    public void SystemTests2(){
        double value = 2.0;
        double log2 = Math.log(value)/Math.log(2);
        double log5 = Math.log(value)/Math.log(5);

        BigDecimal mathLogResult = BigDecimal.valueOf((((((log2+log2)-log2)*log2)*log2)/log5));

        BigDecimal sub = system.calculate(value).subtract(mathLogResult);
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }


    @Test
    public void SystemTestsPIdiv2(){
        double value = 1.4;
        double log2 = Math.log(value)/Math.log(2);
        double log5 = Math.log(value)/Math.log(5);

        BigDecimal mathLogResult = BigDecimal.valueOf((((((log2+log2)-log2)*log2)*log2)/log5));

        BigDecimal sub = system.calculate(value).subtract(mathLogResult);
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }


    @Test
    public void SystemTestsMin14(){
        double value = -1.3;
        double sec = 1/Math.cos(value);
        double cot = Math.cos(value)/Math.sin(value);
        double tan = Math.tan(value);
        double cosn = Math.cos(value);
        double sin = Math.sin(value);

        BigDecimal mathTangResult = BigDecimal.valueOf(((((sec/tan/cot)*cosn)*sec)+(cosn/sin))-(sin+sin));

        BigDecimal sub = system.calculate(value).subtract(mathTangResult);
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void SystemTestsNearZero(){
        double value = -0.01;
        double sec = 1/Math.cos(value);
        double cot = Math.cos(value)/Math.sin(value);
        double tan = Math.tan(value);
        double cosn = Math.cos(value);
        double sin = Math.sin(value);

        BigDecimal mathTangResult = BigDecimal.valueOf(((((sec/tan/cot)*cosn)*sec)+(cosn/sin))-(sin+sin));

        BigDecimal sub = system.calculate(value).subtract(mathTangResult);
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void SystemTestsMin5(){
        double value = -5;
        double sec = 1/Math.cos(value);
        double cot = Math.cos(value)/Math.sin(value);
        double tan = Math.tan(value);
        double cosn = Math.cos(value);
        double sin = Math.sin(value);

        BigDecimal mathTangResult = BigDecimal.valueOf(((((sec/tan/cot)*cosn)*sec)+(cosn/sin))-(sin+sin));

        BigDecimal sub = system.calculate(value).subtract(mathTangResult);
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void SystemTestsMin55(){
        double value = -5.5;
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
