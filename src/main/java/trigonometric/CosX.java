package trigonometric;

import static java.lang.Math.*;

public class CosX {
    SinX sinx= new SinX();

    public double cosX(double value){
        if ((abs(value / PI) - (double) ((int) abs(value / PI))) < 1e-6) return 1;
        else return sinx.sinx(2 * value) / (2 * sinx.sinx(value));
    }
}
