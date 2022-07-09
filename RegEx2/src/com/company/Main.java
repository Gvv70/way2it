package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayMail = new ArrayList<>();
        boolean flagExit = true;
        while (flagExit) {
            System.out.print("Input email: ");
            String word = scanner.nextLine();
            Pattern pattern = Pattern.compile("@gmail.com$");
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                System.out.println("Email " + word + " included '@gmail.com'");
                arrayMail.add(word);
            } else {
                System.out.println("This email does not included with '@gmail.com'");
            }
            System.out.println("For exit press 'e' ");
            Scanner flagScanner = new Scanner(System.in);
            String flag = flagScanner.next();
            if (flag.equals("e")){
                flagExit = false;
            }
        }
        System.out.println(arrayMail);
    }
}
