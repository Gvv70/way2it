package com.company;

public class Main {

    public static void main(String[] args) {
        Rose rose = new Rose();
        Carnation carnation = new Carnation();
        Lily lily = new Lily();
        System.out.println();

        rose.setColor("Red");
        rose.getQuantity();
        rose.setPrice(4);
        rose.setSort(rose.getSort());
        System.out.println(rose.toString());

        carnation.setColor("Yellow");
        carnation.getQuantity();
        carnation.setPrice(2);
        carnation.setSort(rose.getSort());
        System.out.println(carnation.toString());

        lily.setColor("White");
        lily.getQuantity();
        lily.setPrice(8);
        lily.setSort(rose.getSort());
        System.out.println(lily.toString());

	// write your code here
    }
}
