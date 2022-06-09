package com.company;

import java.util.NoSuchElementException;
import java.util.Set;

public interface UserService<User, Account> {

    static void getAllUsers(Set<com.company.User> user) {
        for (com.company.User a : user){
            System.out.println(a.getUser());
        }
    }

    static void getAllAccounts(Set<com.company.User> user) {
        System.out.println("Printed DebitAccount:");
        for (com.company.User a : user){
            System.out.println(a.getDebitAccount());
        }
        System.out.println();
        System.out.println("Printed CreditAccount:");
        for (com.company.User a : user){
            System.out.println(a.getCreditAccount());
        }

    }

    static void getTax(Set<com.company.User> user, String nameUser){
        for (com.company.User a : user){
            if (a.getUser().equals(nameUser)){
                double taxUser = a.getSumCreditAccount() * 0.05;
                System.out.println("Summa tax " + nameUser + " - " + taxUser);
            }
        }
        throw new NoSuchElementException("User '" + nameUser + "' not found");
    }
}
