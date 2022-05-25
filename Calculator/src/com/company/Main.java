package com.company;
import com.company.second.MyCalculator;

public class Main {

    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        System.out.println(calculator.plus(2.75, 4.99));
        System.out.println(calculator.minus(4.95, 3.76));
        System.out.println(calculator.multiply(3.15, 15.36));
        System.out.println(calculator.devide(9.99, 3));
    }
}
