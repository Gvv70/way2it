package com.company;

import com.company.exception.IncorrectEmailException;
import com.company.exception.UnderAgeException;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Mickael");
        human.setAge(19);
        human.setMail("gdvagsbh.fr");

        CheckMail cm = new CheckMail();

        try {
            if (human.getAge() > 18 && cm.checkMail(human.getMail())){
                System.out.println("Name is: " + human.getName());
                System.out.println("Person over 18 years old: " + human.getAge());
                System.out.println("eMail address entered correctly: " + human.getMail());
                System.out.println();
                System.out.println("We enter data somewhere or do something");
            }
            throw new UnderAgeException();
        }
        catch (UnderAgeException underAgeException){
            UnderAgeException.underAgeException(human.getAge());
        }

        try {
            throw new IncorrectEmailException();
        }
        catch (IncorrectEmailException incorrectEmailException){
            IncorrectEmailException.incorrectEmailException(human.getMail());
        }
    }
}
