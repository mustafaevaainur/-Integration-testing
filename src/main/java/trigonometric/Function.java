package trigonometric;

public class Function {
    public double function(double value) {
        CosX cos = new CosX();
        CotX cot = new CotX();
        SecX sec = new SecX();
        SinX sin = new SinX();
        TanX tan = new TanX();

        double result;
        result = (((((sec.secX(value))/(tan.tanX(value))/(cot.cotX(value)))
                *cos.cosX(value))*sin.sinx(value))+
                ((cos.cosX(value)/sin.sinx(value))) - ((sin.sinx(value)) + sin.sinx(value)));
        return result;
    }
}
