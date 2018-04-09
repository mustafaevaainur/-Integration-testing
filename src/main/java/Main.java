import ru.ifmo.interfaces.INaturalLog;
import ru.ifmo.logarithmic.NaturalLog;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        INaturalLog naturalLog = new NaturalLog(0.001);
        BigDecimal result = naturalLog.calculate(6);
        System.out.print(result);
    }
}
