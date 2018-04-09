import logarithmic.LogFunction;
import trigonometric.TrigFunction;

public class SystemSolve {
    public double solver(double value) {
        TrigFunction trig = new TrigFunction();
        LogFunction log = new LogFunction();
        if (value <= 0) return trig.function(value);
        else return log.function(value);
    }
}
