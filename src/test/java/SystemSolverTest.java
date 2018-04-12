
import org.junit.Test;
import ru.ifmo.System.SystemSolver;
import ru.ifmo.interfaces.ISystemSolver;
import ru.ifmo.stub.SystemSolverStub;

import java.math.BigDecimal;

import static org.junit.Assert.*;
public class SystemSolverTest {

     /*ISystemSolver system = new SystemSolver();*/
     ISystemSolver system = new SystemSolverStub();
    final double EPS = 0.1;

    @Test
    public void SystemTests2(){
        double value = 2;
        double log2 = Math.log(value)/Math.log(2);
        double log5 = Math.log(value)/Math.log(5);

        BigDecimal mathLogResult = BigDecimal.valueOf((((((log2+log2)-log2)*log2)*log2)/log5));

        BigDecimal sub = system.calculate(value).subtract(mathLogResult);
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void SystemTests3(){
        double value = 3;
        double log2 = Math.log(value)/Math.log(2);
        double log5 = Math.log(value)/Math.log(5);

        BigDecimal mathLogResult = BigDecimal.valueOf((((((log2+log2)-log2)*log2)*log2)/log5));

        BigDecimal sub = system.calculate(value).subtract(mathLogResult);
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void SystemTestsPIdiv2(){
        double value = Math.PI/2;
        double log2 = Math.log(value)/Math.log(2);
        double log5 = Math.log(value)/Math.log(5);

        BigDecimal mathLogResult = BigDecimal.valueOf((((((log2+log2)-log2)*log2)*log2)/log5));

        BigDecimal sub = system.calculate(value).subtract(mathLogResult);
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void SystemTestsMin1(){
        double value = -1.0;
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
    public void SystemTestsMin14(){
        double value = -1.4;
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
    public void SystemTestsMinPIdivNearZero(){
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
}
