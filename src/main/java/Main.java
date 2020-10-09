import ItegrationMethods.IntegrationMethod;
import ItegrationMethods.SympsonMethod;
import ItegrationMethods.TrapezeMethod;
import org.jetbrains.annotations.NotNull;
import utils.FunctionUtil;

public class Main {

    public static double integrate(double a, double b, double eps, @NotNull IntegrationMethod integrationMethod) {
        double h = 0.5;
        double Icur = integrationMethod.integrate(a, b, h);
        double Ipre;
        do {
            Ipre = Icur;
            h = h / 2;
            Icur = integrationMethod.integrate(a, b, h);
        } while (Math.abs(Icur - Ipre) >= eps);
        return Icur;
    }

    public static void main(String[] args) {
        double a = 0;
        double b = 3;
        double eps = 1e-4;

        System.out.println("4x^3+2x-1");
        System.out.println("Interval [" + a + "; " + b + "]");
        System.out.println("Check value " + (FunctionUtil.integratedFunction(b) - FunctionUtil.integratedFunction(a)));
        System.out.println("Accuracy " + eps);

        System.out.println("Sympson Method " + integrate(a, b, eps, new SympsonMethod()));
        System.out.println("Trapeze Method " + integrate(a, b, eps, new TrapezeMethod()));
    }
}
