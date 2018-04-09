package trigonometric;

public class SinX {

    public static double sinx(double value) {
        double result = 0;
        for (int i = 0; i <= 6; i++) {
            result += ((Math.pow(-1.0, i)*Math.pow(value, (1+2*i))/factorial(1+2*i)));
        }
        return result;
    }

    private static int factorial(int value) {
        if(value <= 1)
            return 1;
        else
            return value * (factorial(value - 1));
    }
}
