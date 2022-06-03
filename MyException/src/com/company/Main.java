package com.company;

public class Main {

    public static void main(String[] args) throws MyException, IllegalAccessException {
        Methods methods = new Methods(-4, -4);
        new CheckValues(methods.getValueA(), methods.getValueB());


        System.out.println(Methods.sumValue(methods.getValueA(), methods.getValueB()));
        System.out.println(Methods.subtractionValue(methods.getValueA(),methods.getValueB()));
        System.out.println(Methods.multiplyValue(methods.getValueA(), methods.getValueB()));
        System.out.println(Methods.divisionValue(methods.getValueA(), methods.getValueB()));
    }
}
