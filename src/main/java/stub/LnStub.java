package stub;

public class LnStub {
    public double ln(double value) {
        return value <= 0 ? Double.NaN : Math.log(value)/Math.log(value);
    }
}
