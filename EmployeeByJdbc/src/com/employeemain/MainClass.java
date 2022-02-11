package com.employeemain;

import java.util.Scanner;

import com.employee.Employee;


public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter option 1 to insert employee and dept data. ");
		System.out.println("Enter option 2 to  fetch all data. ");
		System.out.println("Enter option 3 to update employee data. ");
		System.out.println("Enter option 4 to execute the query. ");
		
		int options = scanner.nextInt();
		scanner.close();
		
		
		Employee emp = new Employee();
		emp.getByOptions(options);
		

	}

}
