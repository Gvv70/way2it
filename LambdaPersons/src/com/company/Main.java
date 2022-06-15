package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person person0 = new Person("Ivan", 19);
        Person person1 = new Person("Petr", 14);
        Person person2 = new Person("Maksim", 25);
        Person person3 = new Person("Alexandr", 10);
        Person person4 = new Person("Nikolay", 52);
        List<Person> personList = new ArrayList<>();
        personList.add(person0);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        List<String> adults = new ArrayList<>();
        personList.forEach((Person element) -> {
            if (element.age >= 18){
                adults.add(element.getName());
            }
        });
        adults.forEach(System.out::println);

        Date date = new Date();
        personList.forEach((Person element) -> {element.timestamp = date;});
        personList.forEach((Person element) -> {System.out.println(element.getTimestamp().toString());});

	// write your code here
    }
}
