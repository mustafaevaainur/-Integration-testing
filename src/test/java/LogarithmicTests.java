import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ifmo.interfaces.ILogBaseFive;
import ru.ifmo.interfaces.ILogBaseTwo;
import ru.ifmo.interfaces.INaturalLog;
import ru.ifmo.logarithmic.LogBaseFive;
import ru.ifmo.logarithmic.LogBaseTwo;
import ru.ifmo.logarithmic.NaturalLog;
import ru.ifmo.stub.LogBaseFiveStub;
import ru.ifmo.stub.LogBaseTwoStub;
import ru.ifmo.stub.NaturalLogStub;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;

public class LogarithmicTests {
    final double EPS = 0.01;


    INaturalLog log = new NaturalLog(EPS);
    ILogBaseTwo log2 = new LogBaseTwo(log);
    ILogBaseFive log5 = new LogBaseFive(log);

    ArrayList<Double> values = new ArrayList<>();

    @BeforeEach
    void init() {
        values.add(2d);
        values.add(1.4d);
        values.add(5d);
        values.add(0.5d);
    }

    @Test
    public void Log2Test() {
        for(Double item : values) {
            BigDecimal sub = BigDecimal.valueOf(Math.log(item) / Math.log(2)).subtract(log2.calculate(item));
            assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
        }
    }

    @Test
    public void Log5Test() {
        for(Double item : values) {
            BigDecimal sub = BigDecimal.valueOf(Math.log(item) / Math.log(5)).subtract(log5.calculate(item));
            assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
        }
    }
}
