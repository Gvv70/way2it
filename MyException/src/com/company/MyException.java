package com.company;

public class MyException extends Throwable{

    public void IllegalArgumentException() {
        System.out.println("a < 0 and b < 0");
    }
    public void ArithmeticException(){
        System.out.println("(a = 0 and b != 0) or (a != 0 and b = 0)");
    }
    public void IllegalAccessException(){
        System.out.println("a = 0 and b = 0");
    }
    public void MyExceptions(){
        System.out.println("a > 0 and b > 0");
    }
}
