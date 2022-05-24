package com.company;
import java.util.Scanner;

public class Rose extends Flower{
    private String sort;

    public String getSort() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input sort roses: ");
        sort = scanner.nextLine();
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    private int quantityFlovers;
    public int getQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input quantity roses: ");
        quantityFlovers = scanner.nextInt();
        return quantityFlovers;
    }

    @Override
    public String toString() {
        return "Bouquet of roses{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", sort='" + sort + '\'' +
                ", quantity='" + quantityFlovers + '\'' +
                ", bouquet price='" + quantityFlovers * price + '\'' +
                '}';
    }
}
