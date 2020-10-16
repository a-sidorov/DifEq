package ItegrationMethods;

import utils.FunctionUtil;

public class TrapezeMethod implements IntegrationMethod {
    @Override
    public double integrate(double a, double b, double n) {
        double res = 0;

        double h = (b - a) / n;

        for (int i = 0; i < n; i++) {
            double x1 = a + i * h;
            double x2 = a + (i + 1) * h;
            res += 0.5 * (x2 - x1) * (FunctionUtil.function(x1) + FunctionUtil.function(x2));
        }

        return res;

    }
}
