package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        float a = scanner.nextFloat();
        System.out.print("Enter the number b: ");
        float b = scanner.nextFloat();
        System.out.print("Enter the number c: ");
        float c = scanner.nextFloat();
        float z = ((a - 3) * b / 2) + c;
        System.out.println("The value of the z function is " + z);
    }
}
