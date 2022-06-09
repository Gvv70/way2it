package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        hashSetExample();
        linkedSetExample();
        treeSetExample();
    }

    public static void hashSetExample() {
        Set<SetNameCode> setNameCodes = new HashSet<>();
        setNameCodes.add(new SetNameCode("Michael", 34));
        setNameCodes.add(new SetNameCode("Ben", 25));
        setNameCodes.add(new SetNameCode("Alexandr", 96));
        setNameCodes.add(new SetNameCode("Maria", 14));
        setNameCodes.add(new SetNameCode("Natalya", 88));
        System.out.println("Set printed:");
        for (SetNameCode a : setNameCodes){
            System.out.println(a.toString());
        }
        System.out.println();
    }

    public static void linkedSetExample() {
        Set<SetNameCode> setNameCodes = new LinkedHashSet<>();
        setNameCodes.add(new SetNameCode("Michael", 34));
        setNameCodes.add(new SetNameCode("Ben", 25));
        setNameCodes.add(new SetNameCode("Alexandr", 96));
        setNameCodes.add(new SetNameCode("Maria", 14));
        setNameCodes.add(new SetNameCode("Natalya", 88));
        System.out.println("LinkedSet printed:");
        for (SetNameCode a : setNameCodes){
            System.out.println(a.toString());
        }
        System.out.println();
    }

    public static void treeSetExample() {
        Set<SetNameCode> setNameCodes = new TreeSet<>(Comparator.comparingInt(SetNameCode::getCode));
        setNameCodes.add(new SetNameCode("Michael", 34));
        setNameCodes.add(new SetNameCode("Ben", 25));
        setNameCodes.add(new SetNameCode("Alexandr", 96));
        setNameCodes.add(new SetNameCode("Maria", 14));
        setNameCodes.add(new SetNameCode("Natalya", 88));
        System.out.println("TreeSet printed:");
        for (SetNameCode a : setNameCodes){
            System.out.println(a.toString());
        }
        System.out.println();
    }
}
