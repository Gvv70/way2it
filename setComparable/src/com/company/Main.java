package com.company;

//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        NameCode name = new NameCode();
        NameCode code = new NameCode();

        Set<String> setName = new HashSet<>();
        Set<Integer> setCode = new HashSet<>();
        Set<String> linkedSetName = new LinkedHashSet<>();
        Set<Integer> linkedSetCode = new LinkedHashSet<>();
        Set<String> treeSetName = new TreeSet<>();
        Set<Integer> treeSetCode = new TreeSet<>();

        name.setName("Michael");
        code.setCode(1);
        setName.add(name.getName());
        setCode.add(code.getCode());
        linkedSetName.add(name.getName());
        linkedSetCode.add(code.getCode());
        treeSetName.add(name.getName());
        treeSetCode.add(code.getCode());
        name.setName("Ben");
        code.setCode(15);
        setName.add(name.getName());
        setCode.add(code.getCode());
        linkedSetName.add(name.getName());
        linkedSetCode.add(code.getCode());
        treeSetName.add(name.getName());
        treeSetCode.add(code.getCode());
        name.setName("Alexandr");
        code.setCode(2);
        setName.add(name.getName());
        setCode.add(code.getCode());
        linkedSetName.add(name.getName());
        linkedSetCode.add(code.getCode());
        treeSetName.add(name.getName());
        treeSetCode.add(code.getCode());

        System.out.println("Set printed:");
        for (String a : setName){
            System.out.println("Name - " + a);
        }
        for (Integer b : setCode){
            System.out.println("Code - " + b);
        }
        System.out.println();

        System.out.println("LinkedSet printed:");
        for (String a : linkedSetName){
            System.out.println("Name - " + a);
        }
        for (Integer b : linkedSetCode){
            System.out.println("Code - " + b);
        }
        System.out.println();

        System.out.println("TreeSet printed:");
        for (String a : treeSetName){
            System.out.println("Name - " + a);
        }
        for (Integer b : treeSetCode){
            System.out.println("Code - " + b);
        }

    }
}
