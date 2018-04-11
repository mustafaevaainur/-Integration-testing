import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.ifmo.logarithmic.NaturalLog;
import ru.ifmo.trigonometric.*;

import java.math.BigDecimal;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

class TrigonometricTests {
    final double EPS = 0.001;

    Sine sin = new Sine(EPS);

    @Test
    void TestCosinePI() {
        Cosine cos = new Cosine(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.cos(Math.PI)).subtract(cos.calculate(Math.PI));
        assertFalse(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestCosine0() {
        Cosine cos = new Cosine(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.cos(0)).subtract(cos.calculate(0));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestCosinePIdiv2() {
        Cosine cos = new Cosine(sin);
        try {
            BigDecimal sub = BigDecimal.valueOf(Math.cos(Math.PI / 2))
                    .subtract(cos.calculate(Math.PI / 2));
        } catch (NumberFormatException num) {
            assertThat(num.getMessage(), is("Infinite or NaN"));
        }
    }

    @Test
    void TestCosineMinPIdiv2() {
        Cosine cos = new Cosine(sin);
        try {
            BigDecimal sub = BigDecimal.valueOf(Math.cos(-Math.PI / 2))
                    .subtract(cos.calculate(-Math.PI / 2));
        } catch (NumberFormatException num) {
            assertThat(num.getMessage(), is("Infinite or NaN"));
        }
    }

    @Test
    void TestCosinePIdiv4() {
        Cosine cos = new Cosine(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.cos(Math.PI / 4)).subtract(cos.calculate(Math.PI / 4));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestCosine3multPIdiv4() {
        Cosine cos = new Cosine(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.cos(3 * Math.PI / 4))
                .subtract(cos.calculate(3 * Math.PI / 4));
        assertFalse(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestTangent0() {
        Tangent tan = new Tangent(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.tan(0)).
                subtract(tan.calculate(0));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestTangentPI() {
        Tangent tan = new Tangent(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.tan(Math.PI)).
                subtract(tan.calculate(Math.PI));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestTangentMinPI() {
        Tangent tan = new Tangent(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.tan(-Math.PI)).
                subtract(tan.calculate(-Math.PI));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestTangentPIdv2() {
        Tangent tan = new Tangent(sin);
        try {
            BigDecimal sub = BigDecimal.valueOf(Math.tan(Math.PI / 2)).
                    subtract(tan.calculate(Math.PI / 2));
        } catch (NumberFormatException num) {
            assertThat(num.getMessage(), is("Infinite or NaN"));
        }
    }

    @Test
    void TestTangentMinPIdv2() {
        Tangent tan = new Tangent(sin);
        try {
            BigDecimal sub = BigDecimal.valueOf(Math.tan(-Math.PI / 2)).
                    subtract(tan.calculate(-Math.PI / 2));
        } catch (NumberFormatException num) {
            assertThat(num.getMessage(), is("Infinite or NaN"));
        }
    }

    @Test
    void TestTangentMinPIMin05() {
        Tangent tan = new Tangent(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.tan(-Math.PI - 0.5)).
                subtract(tan.calculate(-Math.PI - 0.5));
        assertFalse(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestTangentPIMin05() {
        Tangent tan = new Tangent(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.tan(Math.PI - 0.5)).
                subtract(tan.calculate(Math.PI - 0.5));
        assertFalse(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestTangentPIPlus05() {
        Tangent tan = new Tangent(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.tan(Math.PI + 0.5)).
                subtract(tan.calculate(Math.PI + 0.5));
        assertFalse(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestTangentMinPIPlus05() {
        Tangent tan = new Tangent(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.tan(-Math.PI + 0.5)).
                subtract(tan.calculate(-Math.PI + 0.5));
        assertFalse(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestTangentPIdiv4() {
        Tangent tan = new Tangent(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.tan(Math.PI / 4)).
                subtract(tan.calculate(Math.PI / 4));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestTangent3multPIdiv4() {
        Tangent tan = new Tangent(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.tan(3 * Math.PI / 4)).
                subtract(tan.calculate(3 * Math.PI / 4));
        assertFalse(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestSecant0() {
        Secant sec = new Secant(sin);
        BigDecimal sub = BigDecimal.valueOf(1 / Math.cos(0)).
                subtract(sec.calculate(0));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestSecantPIdiv2() {
        Secant sec = new Secant(sin);
        try {
            BigDecimal sub = BigDecimal.valueOf(1 / (Math.cos(Math.PI / 2))).
                    subtract(sec.calculate((Math.PI / 2)));
        } catch (NumberFormatException num) {
            assertThat(num.getMessage(), is("Infinite or NaN"));
        }
    }

    @Test
    void TestSecantminPIdiv2() {
        Secant sec = new Secant(sin);
        try {
            BigDecimal sub = BigDecimal.valueOf(1 / Math.cos(-Math.PI / 2)).
                    subtract(sec.calculate(-Math.PI / 2));
        } catch (NumberFormatException num) {
            assertThat(num.getMessage(), is("Infinite or NaN"));
        }
    }

    @Test
    void TestSecantminPIdiv2plus05() {
        Secant sec = new Secant(sin);
        BigDecimal sub = BigDecimal.valueOf(1 / Math.cos(-Math.PI / 2 + 0.5)).
                subtract(sec.calculate(-Math.PI / 2 + 0.5));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestSecantPIdiv2plus05() {
        Secant sec = new Secant(sin);
        BigDecimal sub = BigDecimal.valueOf(1 / Math.cos(-Math.PI / 2 + 0.5)).
                subtract(sec.calculate(-Math.PI / 2 + 0.5));
        assertEquals(sub.abs().compareTo(BigDecimal.valueOf(EPS)), -1);
    }

    @Test
    void TestSecantPI() {
        Secant sec = new Secant(sin);
        BigDecimal sub = BigDecimal.valueOf(1 / Math.cos(Math.PI)).
                subtract(sec.calculate(Math.PI));
        assertFalse(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestSecantMinPI() {
        Secant sec = new Secant(sin);
        BigDecimal sub = BigDecimal.valueOf(1 / Math.cos(-Math.PI)).
                subtract(sec.calculate(-Math.PI));
        assertFalse(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestCotangent0Plus() {
        Cotangent cotangent = new Cotangent(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.cos(0.05) / Math.sin(0.05))
                .subtract(cotangent.calculate(0.05));
        assertTrue(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestCotangentPI6() {
        Cotangent cotangent = new Cotangent(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.cos(Math.PI / 6) / Math.sin(Math.PI / 6))
                .subtract(cotangent.calculate(Math.PI / 6));
        assertTrue(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

    @Test
    void TestCotangentPIdiv2() {
        Cotangent cotangent = new Cotangent(sin);
        try {
            BigDecimal sub = BigDecimal.valueOf(Math.cos(Math.PI / 2) / Math.sin(Math.PI / 2))
                    .subtract(cotangent.calculate((Math.PI / 2)));
        } catch (NumberFormatException num) {
            assertThat(num.getMessage(), is("Infinite or NaN"));
        }
    }

    @Test
    void TestCotangentPI() {
        Cotangent cotangent = new Cotangent(sin);
        BigDecimal sub = BigDecimal.valueOf(Math.cos(Math.PI) / Math.sin(Math.PI))
                .subtract(cotangent.calculate(Math.PI));
        assertFalse(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }

}
