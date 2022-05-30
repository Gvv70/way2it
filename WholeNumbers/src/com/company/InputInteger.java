package com.company;
import java.util.Scanner;

public class InputInteger {
    public int inputInteger(){
        int valueInteger = 0;
        boolean checkInput = false;
        while (!checkInput) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            try {
                valueInteger = scanner.nextInt();
                checkInput = true;
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("The entered number is not an integer");
            }
        }
        if (valueInteger % 2 == 0){
            System.out.println("it's an even number");
        }
        else {
            System.out.println("it's an odd number");
        }
        return valueInteger;
    }
}
