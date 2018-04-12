import org.junit.jupiter.api.Test;
import org.junit.Assert;
import ru.ifmo.interfaces.ILogBaseFive;
import ru.ifmo.interfaces.ILogBaseTwo;
import ru.ifmo.interfaces.INaturalLog;
import ru.ifmo.logarithmic.LogBaseFive;
import ru.ifmo.logarithmic.LogBaseTwo;
import ru.ifmo.logarithmic.NaturalLog;
import ru.ifmo.stub.LogBaseFiveStub;
import ru.ifmo.stub.LogBaseTwoStub;
import ru.ifmo.stub.NaturalLogStub;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class LogarithmicTests {
    //0.5, 1 , 2, 5
    final double EPS = 0.01;
    INaturalLog log = new NaturalLog(EPS);
    ILogBaseTwo log2 = new LogBaseTwo(log);
    ILogBaseFive log5 = new LogBaseFive(log);
    /*INaturalLog ln = new NaturalLog(EPS);
    ILogBaseTwo log2 = new LogBaseTwoStub();
    ILogBaseFive log5 = new LogBaseFiveStub();
    INaturalLog log = new NaturalLogStub();*/

    @Test
    public void Log2Test05() {
        BigDecimal sub = BigDecimal.valueOf(Math.log(0.5) / Math.log(2)).subtract(log2.calculate(0.5));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void Log2Test2() {
        BigDecimal sub = BigDecimal.valueOf(Math.log(2) / Math.log(2)).subtract(log2.calculate(2));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }


    @Test
    public void Log2Test1() {
        BigDecimal sub = BigDecimal.valueOf(Math.log(1) / Math.log(2)).subtract(log2.calculate(1));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void Log2Test5() {
        BigDecimal sub = BigDecimal.valueOf(Math.log(5) / Math.log(2)).subtract(log2.calculate(5));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void Log5Test05() {
        BigDecimal sub = BigDecimal.valueOf(Math.log(0.5) / Math.log(5)).subtract(log5.calculate(0.5));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void Log5Test1() {
        BigDecimal sub = BigDecimal.valueOf(Math.log(1) / Math.log(5)).subtract(log5.calculate(1));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void Log5Test2() {
        BigDecimal sub = BigDecimal.valueOf(Math.log(2) / Math.log(5)).subtract(log5.calculate(2));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void Log5Test5() {
        BigDecimal sub = BigDecimal.valueOf(Math.log(5) / Math.log(5)).subtract(log5.calculate(5));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void LogTest05() {
        BigDecimal sub = BigDecimal.valueOf(Math.log(0.5)).subtract(log.calculate(0.5));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void LogTest1() {
        BigDecimal sub = BigDecimal.valueOf(Math.log(1)).subtract(log.calculate(1));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void LogTest2() {
        BigDecimal sub = BigDecimal.valueOf(Math.log(2)).subtract(log.calculate(2));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    public void LogTest5() {
        BigDecimal sub = BigDecimal.valueOf(Math.log(5)).subtract(log.calculate(5));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

}
