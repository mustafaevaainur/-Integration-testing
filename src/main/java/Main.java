import ru.ifmo.interfaces.INaturalLog;
import ru.ifmo.interfaces.ISine;
import ru.ifmo.logarithmic.NaturalLog;
import ru.ifmo.trigonometric.Cosine;
import ru.ifmo.trigonometric.Sine;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        ISine sine = new Sine(0.001);
        Cosine cos = new Cosine(sine);
        SystemSolver systemSolver = new SystemSolver();
        double value = -1.4;

        double sec = 1/Math.cos(value);
        double cot = Math.cos(value)/Math.sin(value);
        double tan = Math.tan(value);
        double cosn = Math.cos(value);
        double sin = Math.sin(value);

        //  x <= 0 : ((((((sec(x) / tan(x)) / cot(x)) * cos(x)) * sec(x)) + (cos(x) / sin(x))) - (sin(x) + sin(x)))

        BigDecimal mathTangResult = BigDecimal.valueOf(((((sec/tan/cot)*cosn)*sec)+(cosn/sin))-(sin+sin));

        //  x > 0 : (((((log_2(x) + log_2(x)) - log_2(x)) * log_2(x)) * log_2(x)) / log_5(x))

        double log2 = Math.log(value)/Math.log(2);
        double log5 = Math.log(value)/Math.log(5);

       /* BigDecimal mathLogResult = BigDecimal.valueOf((((((log2+log2)-log2)*log2)*log2)/log5));*/

        BigDecimal result = systemSolver.calculate(value);
        System.out.println(result);
        System.out.println("MathTangResult:" + mathTangResult);
        /*System.out.println("MathLogResult:" + mathLogResult);*/
    }
}
