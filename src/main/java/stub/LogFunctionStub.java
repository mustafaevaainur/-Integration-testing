package stub;

public class LogFunctionStub {
    public double logfunctionStub(double value) {
        double log2X = Math.log(value)/Math.log(2);
        double log5X = Math.log(value)/Math.log(5);
        return (((((log2X + log2X)-log2X)*log2X)*log2X)/log5X);
    }
}
