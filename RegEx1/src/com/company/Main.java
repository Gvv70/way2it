package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        ArrayList <String> arrayAWord = new ArrayList<>();
        boolean flagExit = true;
        while (flagExit) {
            System.out.print("Input word: ");
            String word = scanner.nextLine();
            Pattern pattern = Pattern.compile("^a");
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                System.out.println("Word " + word + " starts with letter a");
                arrayAWord.add(word);
            } else {
                System.out.println("The word does not start with a!");
            }
            System.out.println("For exit press 'e' ");
            Scanner flagScanner = new Scanner(System.in);
            String flag = flagScanner.next();
            if (flag.equals("e")){
                flagExit = false;
            }
        }
        System.out.println(arrayAWord);
    }
}
