import java.util.Scanner;

public class Java_Fundamental_Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number R in the form nnn.ddd: ");
        float r = scanner.nextFloat();
        int number = (int) (r * 1000);
        int r1 = number / 100000;
        int r2 = (number - r1 * 100000) / 10000;
        int r3 = (number - r1 * 100000 - r2 * 10000) / 1000;
        int r4 = (number - r1 * 100000 - r2 * 10000 - r3 * 1000) / 100;
        int r5 = (number - r1 * 100000 - r2 * 10000 - r3 * 1000 - r4 * 100) / 10;
        int r6 = (number - r1 * 100000 - r2 * 10000 - r3 * 1000 - r4 * 100 - r5 * 10);
        int numberOut = r4 * 100000 + r5 * 10000 + r6 * 1000 + r1 * 100 + r2 * 10 + r3;
        System.out.println((float)numberOut / 1000);
    }
}
