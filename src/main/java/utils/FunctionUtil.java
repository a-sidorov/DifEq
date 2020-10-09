package utils;

public class FunctionUtil {
    public static double function(double x) {
        return 4 * Math.pow(x, 3) + 2 * x - 1;
    }

    public static double integratedFunction(double x){
        return Math.pow(x,4)+Math.pow(x,2)-x;
    }
}
