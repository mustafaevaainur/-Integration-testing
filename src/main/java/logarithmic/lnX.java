package logarithmic;

public class lnX {
    final double EPS = 0.01;
    final double ln10 = Math.log(10);

    public double ln(double value) {

        if (value <= 0) {
            return Double.NaN;
        }

        double result = 0.0, tmp = 1.0;

        if (value > 1) {
            while (value > 1) {
                result = result + ln10;
                value = value/10;
            }
        }

        for (double n = 1.0; Math.abs(tmp) > EPS; n++) {
            tmp = Math.pow((-1), (n+1)) * Math.pow((value - 1.0), n) / n ;
            result = result + tmp;
        }
        return result;
    }
}
