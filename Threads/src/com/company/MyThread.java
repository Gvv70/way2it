package com.company;

import java.util.Scanner;

public class MyThread extends Thread{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of the Fibonacci series (>2) - ");
        int lengthSeries = scanner.nextInt();
        int firstValue = 1;
        int secondValue = 1;
        System.out.print(firstValue + ", ");
        pause();
        System.out.print(secondValue);
        pause();
        for (int i = 2; i < lengthSeries; i++) {
            int tempValue = firstValue + secondValue;
            System.out.print(", " + tempValue);
            firstValue = secondValue;
            secondValue =tempValue;
            pause();
        }
    }
    private void pause(){
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
