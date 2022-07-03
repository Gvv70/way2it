package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Input month: ");
        Scanner scanner = new Scanner(System.in);
        String mont = scanner.nextLine().toUpperCase();
        CheckMonth checkMonth = new CheckMonth();
        System.out.println("-----------------");
        System.out.println("Month " + mont + " is " + checkMonth.checkNameMont(mont));
        System.out.println("-----------------");
        checkMonth.getSeason(mont);
        System.out.println();
        System.out.println("-----------------");
        checkMonth.getMonthsDay(mont);
        System.out.println();
        System.out.println("------------------");
        checkMonth.getLessDay(mont);
        System.out.println();
        System.out.println("------------------");
        checkMonth.getMoreDay(mont);
        System.out.println();
        System.out.println("------------------");
        checkMonth.getNextSeason(mont);
        System.out.println("------------------");
        checkMonth.getPreviousSeason(mont);
        System.out.println("------------------");
        checkMonth.getMonthsEvenNumberDays();
        System.out.println();
        System.out.println("------------------");
        checkMonth.getMonthsOddNumberDays();
        System.out.println();
        System.out.println("------------------");
        checkMonth.getMonthsOddOrEvenDays(mont);
    }
}
