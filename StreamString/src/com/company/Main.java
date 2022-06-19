package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(new String[]{"One", "Two", "Three", "Four", "Five", "One"});

        stringList.forEach(System.out::println);
        System.out.println();

        System.out.print("Word count 'One': ");
        int countOne = (int) stringList.stream()
                .filter(element -> element.equals("One"))
                .count();
        System.out.println(countOne);
        System.out.println();

        System.out.print("First element: ");
        if (stringList.isEmpty()) {
            System.out.println("Collection is empty");
        } else {
            System.out.println(stringList.stream().findFirst());
        }
        System.out.println();

        System.out.print("Last element: ");
        if (stringList.isEmpty()) {
            System.out.println("Collection is empty");
        } else {
            stringList.stream()
                    .skip(stringList.size() - 1)
                    .forEach(System.out::println);
        }
        System.out.println();

        System.out.print("Element 'Three': ");
        stringList.stream()
                .filter(element -> element.contains("Three"))
                .forEach(System.out::println);
        //throw

        System.out.print("3 element: ");
        String elementThree = stringList.stream()
                .skip(stringList.size() - (stringList.size() - 2))
                .findAny().toString();
        System.out.println(elementThree);
        System.out.println();

        System.out.println("2 - 3 element: ");
        stringList.stream()
                .limit(3)
                .skip(1)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("More than three letters");
        stringList.stream()
                .filter(element -> element.length() > 3)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Without duplicates");
        stringList.stream().distinct().forEach(System.out::println);
        System.out.println();

        System.out.print("One in list? - ");
        System.out.println(stringList.stream().anyMatch(element -> element.equals("One")));
        System.out.println();

        System.out.print("Symbol 'o' in all word - ");
        System.out.println(stringList.stream().allMatch(element -> element.contains("o")));
        System.out.println();

        System.out.println(" + '_1'");
        stringList.stream().map(element -> element + "_1").forEach(System.out::println);
        System.out.println();

        System.out.println("Sorted and no duplicates");
        stringList.stream().distinct().sorted().forEach(System.out::println);
    }
}
