package com.company;

public class HourlyWorker {
    double salaryOut;
    public double salary(double hourSalary, int hourWork){
        salaryOut = hourSalary * hourWork;
        return salaryOut;
    }

    @Override
    public String toString() {
        return "The hourly wage for an employee is - " + salaryOut;
    }
}
