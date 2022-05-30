package com.company;

public class Main {

    public static void main(String[] args) {
	InputInteger inputInteger = new InputInteger();
	int valueInteger1 = inputInteger.inputInteger();
	int valueInteger2 = inputInteger.inputInteger();
	SumInteger sumInteger = new SumInteger();
	System.out.println("Summ = " + sumInteger.sumInteger(valueInteger1, valueInteger2));
    }
}
