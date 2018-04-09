package stub;

public class Log2Stub {
    public double log2(double value) {
        return value <= 0 ? Double.NaN : Math.log(value)/Math.log(2);
    }
}
