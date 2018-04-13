import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ifmo.interfaces.*;
import ru.ifmo.stub.SineStub;
import ru.ifmo.trigonometric.*;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class TrigonometricTestsStub {
    private final double EPS = 0.001;

    private ISine sin = new SineStub();
    private ICosine cos = new Cosine(sin);
    private ITangent tan = new Tangent(sin);
    private ICotangent cotangent = new Cotangent(sin);
    private ISecant sec = new Secant(sin);
    ArrayList<Double> values = new ArrayList<>();

    @BeforeEach
    void init() {
        values.add(-1.3d);
        values.add(-0.01d);
        values.add(-5d);
        values.add(-5.5d);
        values.add(-7d);
        values.add(-3d);
        values.add(-6.7d);
    }

    @Test
    void TestCosine() {
        for (Double item : values) {
            BigDecimal sub = BigDecimal.valueOf(Math.cos(item)).subtract(cos.calculate(item));
            assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS).abs()), -1);
        }
    }

    @Test
    void TestTangent() {
        for (Double item : values) {
            BigDecimal sub = BigDecimal.valueOf(Math.tan(item)).subtract(tan.calculate(item));
            assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS).abs()), -1);
        }
    }

    @Test
    void TestSecant() {
        for (Double item : values) {
            BigDecimal sub = BigDecimal.valueOf(1 / Math.cos(item)).
                    subtract(sec.calculate(item));
            assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
        }
    }

    @Test
    void TestCotangent() {
        for (Double item : values) {
            BigDecimal sub = BigDecimal.valueOf(Math.cos(item) / Math.sin(item))
                    .subtract(cotangent.calculate(item));
            assertTrue(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
        }
    }

}
