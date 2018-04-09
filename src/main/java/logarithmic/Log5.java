package logarithmic;

public class Log5 {
    public double log5 (double value) {
        LnX ln = new LnX();
        return ln.ln(value)/ln.ln(5.0);
    }
}
