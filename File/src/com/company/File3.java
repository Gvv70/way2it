package com.company;
import java.io.*;
import java.util.Scanner;

public class File3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name File: ");
        String nameFile = scanner.nextLine();
        System.out.print("Input A: ");
        int a = scanner.nextInt();
        System.out.print("Input B: ");
        int b = scanner.nextInt();
        File rootDir = new File("C:\\Users\\goyvv\\Documents\\Java");
        File inerDir = new File( rootDir, "Test3");
        File newFile = new File(inerDir, nameFile);
        inerDir.mkdirs();
        newFile.createNewFile();
        //PrintStream ps = new PrintStream(newFile.getAbsolutePath());
        FileOutputStream fos = new FileOutputStream(newFile.getAbsolutePath());
        DataOutputStream dos = new DataOutputStream(fos);
        for (int i = 0; i < 10; i++){
            int temp = a + b * i;
            dos.writeByte(temp);
            //dos.writeUTF(" ");
        }
        dos.close();
        fos.close();
        FileInputStream fis = new FileInputStream(newFile.getAbsolutePath());
        DataInputStream dis = new DataInputStream(fis);
        for (int i = 0; i < newFile.length(); i++) {
            int outTemp = dis.readByte();
            System.out.print(outTemp + " ");
        }
        dis.close();
        fis.close();
    }
}
