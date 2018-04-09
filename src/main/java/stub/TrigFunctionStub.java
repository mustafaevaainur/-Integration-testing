package stub;

public class TrigFunctionStub {
    public double function(double value) {
        double result;
        double cot = Math.cos(value)/Math.sin(value);
        double sec = 1/Math.cos(value);
// ((((((sec(x) / tan(x)) / cot(x)) * cos(x)) * sec(x)) + (cos(x) / sin(x))) - (sin(x) + sin(x)))
        result = ((((Math.sin(value)/Math.tan(value)/cot)*sec)+(Math.cos(value)/Math.sin(value))
                - (Math.sin(value) + Math.sin(value))));
        return result;
    }
}
