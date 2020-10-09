package ItegrationMethods;

import utils.FunctionUtil;

public class SympsonMethod implements IntegrationMethod {
    @Override
    public double integrate(double a, double b, double h) {
        double res = 0;
        double i = 1;
        do {
            double x = a + i * h;
            res = res + 4 * FunctionUtil.function(x);
            i++;

            x = a + i * h;
            res = res + 2 * FunctionUtil.function(x);
            i++;

        } while (i <= (b - a) / h);
        res = res * h / 3;
        return res;

    }
}
