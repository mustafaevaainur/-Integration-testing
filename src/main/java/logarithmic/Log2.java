package logarithmic;

public class Log2 {
    public double log2 (double value) {
        LnX ln = new LnX();
        return ln.ln(value)/ln.ln(2.0);
    }
}
