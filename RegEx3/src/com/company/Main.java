package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str = "I love Java more than my friend. Java is so beautiful.";
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            System.out.println("'Java' present");
        }
        String str1 = str.replaceFirst("Java", "C#");
        System.out.println(str1);
        String str2 = str.replaceAll("Java", "C#");
        System.out.println(str2);
    }
}
