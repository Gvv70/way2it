package com.company;

public class Main {

    public static void main(String[] args) {
        HourlyWorker hourlyWorker = new HourlyWorker();
        hourlyWorker.salary(5.25, 148);
        System.out.println(hourlyWorker.toString());

        FixedWorker fixedWorker = new FixedWorker();
        fixedWorker.salary(600, 19, 22);
        System.out.println(fixedWorker.toString());

	// write your code here
    }
}
