import ru.ifmo.interfaces.INaturalLog;
import ru.ifmo.interfaces.ISine;
import ru.ifmo.logarithmic.NaturalLog;
import ru.ifmo.trigonometric.Cosine;
import ru.ifmo.trigonometric.Sine;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        ISine sine = new Sine(0.01);
        Cosine cos = new Cosine(sine);
        BigDecimal result = cos.calculate(-Math.PI/2);
        System.out.print(result);
    }
}
