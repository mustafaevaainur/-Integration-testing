package trigonometric;

public class TanX {
    public double tanX(double value) {
        SinX sinx = new SinX();
        CosX cosx = new CosX();
        double EPS = 0.000001;
        Double eps = 1e-6;
        if (Math.abs(cosx.cosX(value)) < eps) return Double.NaN;
        else return sinx.sinx(value) / cosx.cosX(value);
    }
}
