package com.company;

public class FixedWorker {
    double salaryOut;
    public double salary(double fixedSalary, int quantityDay, int daysMonth){
        salaryOut = (fixedSalary / daysMonth) * quantityDay;
        return salaryOut;
    }
    @Override
    public String toString() {
        return "employee's salary fixed payment is - " + salaryOut;
    }
}
