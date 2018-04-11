import org.junit.jupiter.api.Test;
import ru.ifmo.logarithmic.NaturalLog;
import ru.ifmo.trigonometric.Sine;
import ru.ifmo.trigonometric.Tangent;
import java.math.BigDecimal;
import static org.junit.Assert.*;

/*проверка корректности написанных модулей. Не в рамках лабораторной работы*/

public class test {
    final double eps = 0.01;
    Sine sin = new Sine(eps);
    NaturalLog ln = new NaturalLog(eps);
    Tangent tan = new Tangent(sin);

    final BigDecimal EPS = BigDecimal.valueOf(1);

    @Test
    public void test1() {
        BigDecimal sub = BigDecimal.valueOf(Math.sin(Math.PI)).subtract(sin.calculate(Math.PI));
        assertEquals((sub.abs().compareTo(EPS) == -1), true);
    }

    @Test
    public void test2() {
        BigDecimal sub = BigDecimal.valueOf(Math.log(1)).subtract(ln.calculate(1));
        assertEquals((sub.abs().compareTo(EPS) == -1), true);
    }

    @Test
    public void test3() {
        for (double i = 0.01; i < 30; i++) {
            BigDecimal sub = BigDecimal.valueOf(Math.log(i)).subtract(ln.calculate(i));
            assertEquals((sub.abs().compareTo(EPS) == -1), true);
        }
    }

    @Test
    public void test4() {
        BigDecimal sub = BigDecimal.valueOf(Math.tan(Math.PI/2-0.5)).subtract(tan.calculate(Math.PI/2-0.5));
        assertEquals((sub.abs().compareTo(EPS) == -1), true);
    }
    
}