package com.company;

import java.io.*;

public class Methods {
    public void serializeEmployee(Employee employee, String pathToFile) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathToFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(employee);
        }

        System.out.println("Serialize Employee  ");
    }

    public Employee deserializeEmployee (Employee employee, String pathToFile) throws IOException, ClassNotFoundException {
        Object object;
        try (FileInputStream fileInputStream = new FileInputStream(pathToFile);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            object = objectInputStream.readObject();
        }

        System.out.println("Deserialize Employee");
        return (Employee) object;
    }
}
