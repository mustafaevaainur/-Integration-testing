import interfaces.ICosine;
import interfaces.INaturalLog;
import interfaces.ISine;
import logarithmic.NaturalLog;
import trigonometric.Sine;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        INaturalLog naturalLog = new NaturalLog(0.001);
        BigDecimal result = naturalLog.calculate(6);
        System.out.print(result);
    }
}
