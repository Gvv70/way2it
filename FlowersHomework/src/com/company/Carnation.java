package com.company;
import java.util.Scanner;

public class Carnation extends Flower{
    private String sort;

    public String getSort() {
        Scanner scanner = new Scanner(System.in);
        sort = scanner.nextLine();
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    private int quantityFlovers;
    public int getQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input quantity carnation: ");
        quantityFlovers = scanner.nextInt();
        return quantityFlovers;
    }

    @Override
    public String toString() {
        return "Bouquet of carnation{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", sort='" + sort + '\'' +
                ", quantity='" + quantityFlovers + '\'' +
                ", bouquet price='" + quantityFlovers * price + '\'' +
                '}';
    }
}
