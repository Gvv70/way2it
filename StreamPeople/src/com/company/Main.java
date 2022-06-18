package com.company;

import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Vasiliy", 36, "male"));
        people.add(new Person("Sofia", 25, "female"));
        people.add(new Person("Nikolay", 24, "male"));
        people.add(new Person("Petr", 17, "male"));
        people.add(new Person("Anna", 55, "female"));

        people.stream().forEach(System.out::println);
        System.out.println();

        System.out.println("Men 18-27 years");
        people.stream()
                .filter(person -> person.getSex().equals("male"))
                .filter(person -> person.getAge() > 17 && person.getAge() < 28)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Average age of men");
        double average = people.stream()
                .filter(person -> person.getSex().equals("male"))
                .mapToInt(Person::getAge)
                .average().getAsDouble();
        System.out.println(average);
        System.out.println();

        System.out.println("Number of able-bodied");
        people.stream()
                .filter(person -> person.getAge() > 17)
                .filter(person -> ((person.getSex().equals("male") && person.getAge() < 61)) || (person.getSex().equals("female") && person.getAge() < 56))
                .forEach(System.out::println);
        System.out.println();


        System.out.println("Sorted list for name");
        people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Sorted list for name reversed");
        people.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Sorted list for age");
        people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);
        System.out.println();

        System.out.print("Older person: ");
        int maxAge = people.stream()
                .mapToInt(Person::getAge)
                .max().getAsInt();
        System.out.println(maxAge + " years");
        System.out.println();

        System.out.print("Junior person: ");
        int minAge = people.stream()
                .mapToInt(Person::getAge)
                .min().getAsInt();
        System.out.println(minAge + " years");
        System.out.println();

        System.out.print("Number of men: ");
        int countMale = (int) people.stream()
                .filter(person -> person.getSex().equals("male"))
                .count();
        System.out.println(countMale);
        System.out.println();

        System.out.print("Number of women: ");
        int countFemale = (int) people.stream()
                .filter(person -> person.getSex().equals("female"))
                .count();
        System.out.println(countFemale);
        System.out.println();

        System.out.print("Women name is A: ");
        int countFemaleNameA = (int)people.stream()
                .filter(person -> person.getSex().equals("female"))
                .filter(person -> person.getName().startsWith("A"))
                .count();
        System.out.println(countFemaleNameA);
    }
}
