package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setNameAnimal();
        animal.setSpeedAnimal();
        animal.setAgeAnimal();
        System.out.print("Назва тварини = " + animal.getNameAnimal());
        System.out.print(", Швидкість тварини = " + animal.getSpeedAnimal());
        System.out.print(" км/год, Вік тварини = " + animal.getAgeAnimal());
        System.out.print(" років \" \"-------------------------------------------------------------------------------");
        System.out.println();

        animal.setNameAnimal();
        animal.setSpeedAnimal();
        animal.setAgeAnimal();
        System.out.print("Назва тварини = " + animal.getNameAnimal());
        System.out.print(", Швидкість тварини = " + animal.getSpeedAnimal());
        System.out.print(" км/год, Вік тварини = " + animal.getAgeAnimal());
        System.out.print(" років \" \"-------------------------------------------------------------------------------");
        System.out.println();

    }
}
