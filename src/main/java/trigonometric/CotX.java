package trigonometric;

public class CotX {
    public double cotX(double value) {
        SinX sinx = new SinX();
        CosX cosx = new CosX();
        double EPS = 0.000001;
        if (Math.abs(sinx.sinx(value)) < EPS) return Double.NaN;
        else return cosx.cosX(value) / sinx.sinx(value);
    }
}
