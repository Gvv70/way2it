package com.company.exception;

import com.company.CheckMail;

public class IncorrectEmailException extends Throwable {
    public static void incorrectEmailException(String eMail){
        CheckMail cm = new CheckMail();
        if (!cm.checkMail(eMail)){
            System.err.println("Invalid email address");
        }
    }
}
