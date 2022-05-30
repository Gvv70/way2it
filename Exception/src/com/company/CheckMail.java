package com.company;

public class CheckMail {
    public boolean checkMail(String eMail){
        return eMail.lastIndexOf('@') != -1;
    }
}
