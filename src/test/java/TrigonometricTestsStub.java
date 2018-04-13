import org.junit.jupiter.api.Test;
import ru.ifmo.interfaces.*;
import ru.ifmo.stub.SineStub;
import ru.ifmo.trigonometric.*;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class TrigonometricTestsStub {
    private final double EPS = 0.001;

    private ISine sin = new SineStub();
    private ICosine cos = new Cosine(sin);
    private ITangent tan = new Tangent(sin);
    private ICotangent cotangent = new Cotangent(sin);
    private ISecant sec = new Secant(sin);

    @Test
    void TestCosine0() {
        BigDecimal sub = BigDecimal.valueOf(Math.cos(0)).subtract(cos.calculate(0));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestCosinePIdiv2() {
        BigDecimal sub = BigDecimal.valueOf(Math.cos(Math.PI / 2))
                .subtract(cos.calculate(Math.PI / 2));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestCosineMinPIdiv2() {
        BigDecimal sub = BigDecimal.valueOf(Math.cos(-Math.PI / 2))
                .subtract(cos.calculate(-Math.PI / 2));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestCosinePIdiv4() {
        BigDecimal sub = BigDecimal.valueOf(Math.cos(Math.PI / 4)).subtract(cos.calculate(Math.PI / 4));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestCosineMinPIdiv4() {
        BigDecimal sub = BigDecimal.valueOf(Math.cos(-Math.PI / 4))
                .subtract(cos.calculate(-Math.PI / 4));
        assertTrue(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestTangent0() {

        BigDecimal sub = BigDecimal.valueOf(Math.tan(0)).
                subtract(tan.calculate(0));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestTangentPI() {
        BigDecimal sub = BigDecimal.valueOf(Math.tan(Math.PI)).
                subtract(tan.calculate(Math.PI));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestTangentMinPI() {

        BigDecimal sub = BigDecimal.valueOf(Math.tan(-Math.PI)).
                subtract(tan.calculate(-Math.PI));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestTangentPIdiv4() {
        BigDecimal sub = BigDecimal.valueOf(Math.tan(Math.PI / 4)).
                subtract(tan.calculate(Math.PI / 4));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }
    @Test
    void TestTangentMinPIdiv4() {
        BigDecimal sub = BigDecimal.valueOf(Math.tan(-Math.PI / 4)).
                subtract(tan.calculate(-Math.PI / 4));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }


    @Test
    void TestSecant0() {

        BigDecimal sub = BigDecimal.valueOf(1 / Math.cos(0)).
                subtract(sec.calculate(0));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestSecantPIdiv4() {
        BigDecimal sub = BigDecimal.valueOf(1 / Math.cos(Math.PI/4)).
                subtract(sec.calculate(Math.PI/4));
        assertTrue(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }
    @Test
    void TestSecantMinPIdiv4() {

        BigDecimal sub = BigDecimal.valueOf(1 / Math.cos(-Math.PI/4)).
                subtract(sec.calculate(-Math.PI/4));
        assertTrue(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestCotangentPI6() {
        BigDecimal sub = BigDecimal.valueOf(Math.cos(Math.PI / 6) / Math.sin(Math.PI / 6))
                .subtract(cotangent.calculate(Math.PI / 6));
        assertTrue(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestCotangentPI2() {
        BigDecimal sub = BigDecimal.valueOf(Math.cos(Math.PI / 2) / Math.sin(Math.PI / 2))
                .subtract(cotangent.calculate(Math.PI / 2));
        assertEquals(true, sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

}