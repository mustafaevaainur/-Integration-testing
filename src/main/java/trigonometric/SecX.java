package trigonometric;

public class SecX {
        public static double secX(double value) {
            SinX sinx = new SinX();
            CosX cosx = new CosX();
            double EPS = 0.000001;
            if (Math.abs(cosx.cosX(value)) < EPS) return Double.NaN;
            else return 1 / cosx.cosX(value);
        }
}
