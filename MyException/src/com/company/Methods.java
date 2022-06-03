package com.company;

public class Methods  {
    private double valueA;
    private double valueB;

    public double getValueA() {
        return valueA;
    }

    public void setValueA(double valueA) {
        this.valueA = valueA;
    }

    public double getValueB() {
        return valueB;
    }

    public void setValueB(double valueB) {
        this.valueB = valueB;
    }

    public Methods(double valueA, double valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public static double sumValue(double valueA, double valueB){
        return valueA + valueB;
    }

    public static double subtractionValue(double valueA, double valueB){
        return valueA - valueB;
    }

    public static double multiplyValue(double valueA, double valueB){
        return valueA * valueB;
    }

    public static double divisionValue(double valueA, double valueB){
        return valueA / valueB;
    }
}
