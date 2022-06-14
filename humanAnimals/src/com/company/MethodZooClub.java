package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MethodZooClub {



    public String inputString() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

    public boolean checkHuman(String nameHuman, Map<String, List> zooClub) {
        if (zooClub.containsKey(nameHuman)){
            return true;
        }
        else {
            return false;
        }
    }

    public static Map addPerson (String nameHuman, Map<String, List> zooClub) {
        List<String> listAnimal = new ArrayList<>();
        zooClub.put(nameHuman, listAnimal);
        System.out.println("Human added!");
        System.out.println();
        return zooClub;
    }

    public boolean checkAnimal(String nameAnimal, String nameHuman, Map<String, List> zooClub) {
        if (checkHuman(nameHuman, zooClub)){
            List<String> listAnimals = new ArrayList<String>();
            listAnimals = zooClub.get(nameHuman);
            if (listAnimals.contains(nameAnimal)){
                return true;
            }
            else {
                System.out.println("Animal not found in humans!");
                return false;
            }
        }
        else {
            System.out.println("Human not found!");
            return false;
        }
    }

    public static Map addAnimal (String nameAnimal, String nameHuman, Map<String, List> zooClub) {
        List<String> listAnimal = new ArrayList<>();
        listAnimal = zooClub.get(nameHuman);
        listAnimal.add(nameAnimal);
        zooClub.put(nameHuman, listAnimal);
        System.out.println("Animal added!");
        System.out.println();
        return zooClub;
    }

    public static Map delAnimal (String nameAnimal, String nameHuman, Map<String, List> zooClub) {
        List<String> listAnimal = new ArrayList<>();
        listAnimal = zooClub.get(nameHuman);
        listAnimal.remove(nameAnimal);
        zooClub.put(nameHuman, listAnimal);
        System.out.println("Animal deleted!");
        System.out.println();
        return zooClub;
    }

    public static Map delHuman (String nameHuman, Map<String, List> zooClub) {
        zooClub.remove(nameHuman);
        System.out.println("Human deleted!");
        System.out.println();
        return zooClub;
    }
}
