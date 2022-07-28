package com.company;

import java.util.Scanner;
import static java.lang.Thread.sleep;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of the Fibonacci series (>2) - ");
        int lengthSeries = scanner.nextInt();
        int[] fibonacci = new int[lengthSeries];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < lengthSeries; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }

        for (int i = lengthSeries - 1; i > 0; i--) {
            System.out.print(fibonacci[i] + ", ");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(fibonacci[0]);
    }
}
