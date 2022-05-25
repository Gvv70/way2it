package com.company.second;

import com.company.first.Numerable;

public class MyCalculator implements Numerable {

    @Override
    public double plus(double sum1, double sum2){
        return sum1 + sum2;
    }

    @Override
    public double minus(double subtracted, double reduced) {
        return subtracted - reduced;
    }

    @Override
    public double multiply(double multiplier1, double multiplier2) {
        return multiplier1 * multiplier2;
    }

    @Override
    public double devide(double dividend, double divisor) {
        return dividend / divisor;
    }
}
