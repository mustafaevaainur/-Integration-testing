package logarithmic;

public class Function {
    public double function(double value){
        Log2 log2 = new Log2();
        Log5 log5 = new Log5();

        double result;
        result = ((((((log2.log2(value))+ log2.log2(value))-log2.log2(value))
                * log2.log2(value) *log2.log2(value))/log5.log5(value)));
        return result;
    }
}
