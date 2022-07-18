package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Human human = new Human();
        Method[] methods = Human.class.getDeclaredMethods();
        Arrays.stream(methods).forEach(field -> System.out.println(field));
        Field[] clasFields = Human.class.getDeclaredFields();
        System.out.println();
        Arrays.stream(clasFields).forEach(System.out::println);
        Constructor<?>[] constructors = Human.class.getConstructors();
        System.out.println();
        Arrays.stream(constructors).forEach(System.out::println);
        Constructor<?> constructor1 = constructors[0];
        Constructor<?> constructor2 = constructors[1];
        System.out.println("constructor1 " + constructor1);
        System.out.println("constructor2 " + constructor2);


    }

}
