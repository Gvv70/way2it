package com.company;
import java.util.Scanner;

public class Animal {
    private String nameAnimal;
    private int speedAnimal;
    private int ageAnimal;

    public String getNameAnimal(){
        return nameAnimal;
    }

    public void setNameAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name animal: ");
        nameAnimal = scanner.next();
        this.nameAnimal = nameAnimal;
    }

    public int getSpeedAnimal() {
        return speedAnimal;
    }

    public void setSpeedAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input speed animal: ");
        speedAnimal = scanner.nextInt();
        this.speedAnimal = speedAnimal;
    }

    public int getAgeAnimal() {
        return ageAnimal;
    }

    public void setAgeAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input age animal: ");
        ageAnimal = scanner.nextInt();
        this.ageAnimal = ageAnimal;
    }
}

