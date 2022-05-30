package com.company.exception;

public class UnderAgeException extends Throwable {
    public void underAgeException(int age){
        if (age < 18){
            System.err.println("Person's age is under 18 years");
        }
    }
}
