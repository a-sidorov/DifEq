import ItegrationMethods.SympsonMethod;
import ItegrationMethods.TrapezeMethod;

public class Main {

    public static void main(String[] args) {
        double a = 0;
        double b = 1;

        int n = 4;

        System.out.println(new TrapezeMethod().integrate(a, b, n));
        System.out.println(new SympsonMethod().integrate(a, b, n));


    }
}
