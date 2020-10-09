package ItegrationMethods;

import utils.FunctionUtil;

public class TrapezeMethod implements IntegrationMethod {
    @Override
    public double integrate(double a, double b, double h) {
        double res = 0;
        for (double x = a + h; x < b; x += h) {
            res += FunctionUtil.function(x);
        }
        res = h * (res + (FunctionUtil.function(a) - FunctionUtil.function(b)) / 2);
        return res;

    }
}
