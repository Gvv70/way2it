package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
	Employee employee1 = new Employee("Petrov",1,10000);
	Employee employee2 = new Employee("Sidorov",2,15000);
	Employee employee3 = new Employee("Frolov",3,18000);
	
	List<Employee> employeeList = new ArrayList<Employee>();
	employeeList.add(employee1);
	employeeList.add(employee2);
	employeeList.add(employee3);
	System.out.println(employeeList);

	Methods methods = new Methods();
	methods.serializeEmployee(employee1,"C:\\Users\\goyvv\\IdeaProjects\\Serialization\\src\\com\\company\\text.txt");
	System.out.println(methods.deserializeEmployee(employee1, "C:\\Users\\goyvv\\IdeaProjects\\Serialization\\src\\com\\company\\text.txt"));
    }
}
