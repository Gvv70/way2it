import java.util.Scanner;

public class Java_Fundamental_Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the number y: ");
        double y = scanner.nextDouble();
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("The value of the z function is " + z);
    }
}
