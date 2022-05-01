package com.company;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class File2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Name file: ");
        String nameFile = scanner.nextLine();
        System.out.print("Input N: ");
        int n = scanner.nextInt();
        File testRootDir = new File("C:\\Users\\goyvv\\Documents\\Java\\Test");
        testRootDir.mkdirs();
        File childFile = new File(testRootDir, nameFile);
        childFile.createNewFile();
        PrintStream ps = new PrintStream(childFile.getAbsolutePath());
        for (int i = 1; i <= n; i++){
            ps.print(i*2 + " ");
        }
        ps.close();
    }
}
