package com.mainmethod;

import java.util.Scanner;

import com.employeesinfo.EmployeeList;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		EmployeeList emp = new EmployeeList();
//		System.out.println("Enter option 1 to get the count of the employees starting with s. ");
//		System.out.println("Enter option 2 to get the employees in Hyderabad. ");
//		System.out.println("Enter option 3 to print  all the employee details. ");
//		System.out.println("Enter option 4 to print employees whose salary greater than 100000.");
//		System.out.println("Enter option 5 to get employees data by location. ");
		
//		int options = scanner.nextInt();
		
		
		emp.employeeDetails();
//		emp.getByOptions(options);

	}

}
