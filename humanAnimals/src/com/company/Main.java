package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, List> zooClub = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean exitFlag = false;
        MethodZooClub methodZooClub = new MethodZooClub();
        while (!exitFlag){
            System.out.println("Add a person to the club press       P ");
            System.out.println("Add an animal to a person press      A ");
            System.out.println("Take an animal from a person press   T ");
            System.out.println("delete a person press                D ");
            System.out.println("Print zoo club press                 Z ");
            System.out.println("Exit press                           E ");
            String choice = scanner.next();
            if (choice.equals("P")){
                System.out.println("Input human name: ");
                String nameHuman = methodZooClub.inputString();
                if (methodZooClub.checkHuman(nameHuman, zooClub)){
                    System.out.println("The person is in the database");
                }
                else {
                    methodZooClub.addPerson(nameHuman, zooClub);
                }
            }
            else if (choice.equals("A")){
                System.out.println("Input animal name: ");
                String nameAnimal = methodZooClub.inputString();
                System.out.println("Input human name: ");
                String nameHuman = methodZooClub.inputString();
                if (!methodZooClub.checkAnimal(nameAnimal, nameHuman, zooClub)){
                    methodZooClub.addAnimal(nameAnimal, nameHuman, zooClub);
                }
            }
            else if (choice.equals("T")){
                System.out.println("Input animal name for delete: ");
                String nameAnimal = methodZooClub.inputString();
                System.out.println("Input human name: ");
                String nameHuman = methodZooClub.inputString();
                if (methodZooClub.checkAnimal(nameAnimal, nameHuman, zooClub)){
                    methodZooClub.delAnimal(nameAnimal, nameHuman, zooClub);
                }
            }
            else if (choice.equals("D")){
                System.out.println("Input human name for delete: ");
                String nameHuman = methodZooClub.inputString();
                if (methodZooClub.checkHuman(nameHuman, zooClub)){
                    methodZooClub.delHuman(nameHuman, zooClub);
                }
                else {
                    System.out.println("Human not found!");
                }
            }
            else if (choice.equals("Z")){
                System.out.println(zooClub.entrySet());
            }
            else if (choice.equals("E")){
                exitFlag = true;
            }
            else {
                System.out.println("Invalid input. Check out the choice.");
            }
        }
        System.out.println("The program has ended");
	// write your code here
    }
}
