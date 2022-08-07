import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        float a = scanner.nextFloat();
        System.out.print("Enter the number b: ");
        float b = scanner.nextFloat();
        System.out.print("Enter the number c: ");
        float c = scanner.nextFloat();
        float z = (b + (float) Math.sqrt(b * b + 4 * a * c)) / 2 * a - a * a * a * c + 1 / b * b;
        System.out.println("The value of the z function is " + z);
    }
}
