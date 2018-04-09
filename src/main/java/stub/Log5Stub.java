package stub;

public class Log5Stub {
    public double log5(double value) {
        return value <= 0 ? Double.NaN : Math.log(value)/Math.log(5);
    }
}
