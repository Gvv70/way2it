package com.company;

public class Person {
    String nameHuman;
    int ageHuman;

    public Person(String name, int age) {
        this.nameHuman = name;
        this.ageHuman = age;
    }

    public String getNameHuman() {
        return nameHuman;
    }

    public void setNameHuman(String nameHuman) {
        this.nameHuman = nameHuman;
    }

    public int getAgeHuman() {
        return ageHuman;
    }

    public void setAgeHuman(int ageHuman) {
        this.ageHuman = ageHuman;
    }
}
