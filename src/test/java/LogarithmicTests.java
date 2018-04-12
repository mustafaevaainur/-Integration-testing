import org.junit.jupiter.api.Test;
import org.junit.Assert;
import ru.ifmo.logarithmic.LogBaseFive;
import ru.ifmo.logarithmic.LogBaseTwo;
import ru.ifmo.logarithmic.NaturalLog;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class LogarithmicTests {
    // -1, 0 , 0.5, 1 , 2, 5
    final double EPS = 0.01;
    NaturalLog ln = new NaturalLog(EPS);

    @Test
    public void Log2Test05() {
        LogBaseTwo log2 = new LogBaseTwo(ln);
        BigDecimal sub = BigDecimal.valueOf(Math.log(0.5) / Math.log(2)).subtract(log2.calculate(0.5));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }


    @Test
    public void Log2Test2() {
        LogBaseTwo log2 = new LogBaseTwo(ln);
        BigDecimal sub = BigDecimal.valueOf(Math.log(2) / Math.log(2)).subtract(log2.calculate(2));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }



    @Test
    public void Log2TestZero() {
        LogBaseTwo log2 = new LogBaseTwo(ln);
        try {
            BigDecimal sub = BigDecimal.valueOf(Math.log(0) / Math.log(2)).subtract(log2.calculate(0));
        } catch (NumberFormatException num) {
            assertThat(num.getMessage(),
                    is("Character I is neither a decimal digit number, decimal point, " +
                            "nor \"e\" notation exponential mark."));
        }
    }

    @Test
    public void Log2TestMin() {
        LogBaseTwo log2 = new LogBaseTwo(ln);
        try {
            BigDecimal sub = BigDecimal.valueOf(Math.log(-1) / Math.log(2)).subtract(log2.calculate(-1));
        } catch (NumberFormatException num) {
            assertThat(num.getMessage(),
                    is("Character N is neither a decimal digit number, decimal point, " +
                            "nor \"e\" notation exponential mark."));
        }
    }

    @Test
    public void Log5Test05() {
        LogBaseFive log5 = new LogBaseFive(ln);
        BigDecimal sub = BigDecimal.valueOf(Math.log(0.5) / Math.log(5)).subtract(log5.calculate(0.5));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void Log5Test1() {
        LogBaseFive log5 = new LogBaseFive(ln);
        BigDecimal sub = BigDecimal.valueOf(Math.log(1) / Math.log(5)).subtract(log5.calculate(1));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void Log5Test2() {
        LogBaseFive log5 = new LogBaseFive(ln);
        BigDecimal sub = BigDecimal.valueOf(Math.log(2) / Math.log(5)).subtract(log5.calculate(2));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void Log5Test5() {
        LogBaseFive log5 = new LogBaseFive(ln);
        BigDecimal sub = BigDecimal.valueOf(Math.log(5) / Math.log(5)).subtract(log5.calculate(5));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }



    @Test
    public void Log5Test0() {
        LogBaseFive log5 = new LogBaseFive(ln);
        try {
            BigDecimal sub = BigDecimal.valueOf(Math.log(0) / Math.log(5)).subtract(log5.calculate(0));
        } catch (NumberFormatException num) {
            assertThat(num.getMessage(),
                    is("Character I is neither a decimal digit number, decimal point, " +
                            "nor \"e\" notation exponential mark."));
        }
    }

    @Test
    public void Log5TestMin1() {
        LogBaseFive log5 = new LogBaseFive(ln);
        try {
            BigDecimal sub = BigDecimal.valueOf(Math.log(-1) / Math.log(5)).subtract(log5.calculate(-1));
        } catch (NumberFormatException num) {
            assertThat(num.getMessage(),
                    is("Character N is neither a decimal digit number, decimal point, " +
                            "nor \"e\" notation exponential mark."));
        }
    }
}
