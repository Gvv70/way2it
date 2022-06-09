package com.company;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main implements UserService {
    public static String nameUser;

    public static void main(String[] args) {

        Set<User> setUser = new TreeSet<>(Comparator.comparing(User::getUser));
        setUser.add(new User("Michailov", "acc0348b5", 45.68, 112334, 465344.34));
        setUser.add(new User("Petrov", "acc4784d8", 543713285.32, 873649, 55318.32));
        setUser.add(new User("Ivanenko", "acc0465b9", 51347614.43, 539451, 3547883.23));
        setUser.add(new User("Sidorenko", "acc9562m4", 36536.32, 89284, 53532.45));

        UserService.getAllUsers(setUser);
        System.out.println();
        UserService.getAllAccounts(setUser);
        nameUser = "Petrov";
        System.out.println("");
        UserService.getTax(setUser, nameUser);
        System.out.println();
        nameUser = "Petr";
        System.out.println("");
        UserService.getTax(setUser, nameUser);
    }
}
