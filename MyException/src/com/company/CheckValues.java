package com.company;

public class CheckValues  extends MyException  {

     public CheckValues(double valueA, double valueB) throws IllegalAccessException, MyException {

        //MyException me = new MyException();
        //try {
         if (valueA < 0 && valueB < 0) {
                throw new IllegalArgumentException();
            }
        //}
        //catch (IllegalArgumentException e){
        //    me.IllegalArgumentException();
        //}

        else if ((valueA == 0 && valueB != 0) || (valueA != 0 && valueB == 0)) {
             throw new ArithmeticException();
         }

        else if (valueA == 0 && valueB == 0) {
             throw new IllegalAccessException();
         }
        else if (valueA > 0 && valueB > 0){
                throw new MyException();
            }
        }
    }


