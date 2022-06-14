package com.company;

public class Animal {
    String typeAnimal;
    String nameAnimal;

    public Animal(String typeAnimal, String nameAnimal) {
        this.typeAnimal = typeAnimal;
        this.nameAnimal = nameAnimal;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }
}
