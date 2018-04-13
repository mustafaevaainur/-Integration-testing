import org.junit.jupiter.api.Test;
import ru.ifmo.interfaces.IMathUtils;
import ru.ifmo.stub.MathUtilsStub;
import ru.ifmo.utils.MathUtils;

import static org.junit.Assert.*;
import java.math.BigDecimal;

public class MathUtilsTest {
    final double EPS = 0.001;
   /* IMathUtils mathUtils = new MathUtils();*/
    IMathUtils mathUtils = new MathUtilsStub();

    @Test
    public void sqrtTest2(){
        BigDecimal sub = BigDecimal.valueOf(Math.sqrt(2)).subtract(mathUtils.sqrt(BigDecimal.valueOf(2)));
        assertTrue(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }
    @Test
    public void sqrtTest4(){
        BigDecimal sub = BigDecimal.valueOf(Math.sqrt(4)).subtract(mathUtils.sqrt(BigDecimal.valueOf(4)));
        assertTrue(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }
    @Test
    public void sqrtTest5(){
        BigDecimal sub = BigDecimal.valueOf(Math.sqrt(5)).subtract(mathUtils.sqrt(BigDecimal.valueOf(5)));
        assertTrue(sub.abs().compareTo(BigDecimal.valueOf(EPS)) < 0);
    }
}
