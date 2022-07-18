package com.company;

import java.util.Objects;

public class Human {
    private int age;
    public String lastName;

    public Human(int age, String lastName) {
        this.age = age;
        this.lastName = lastName;
    }

    public Human() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(lastName, human.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, lastName);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    private void whatever(){

    }
}
