package com.employee;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Employee {
	static Connection connection;
	static CallableStatement col;
	Scanner scanner = new Scanner(System.in);
	static String dbURL = "jdbc:sqlserver://localhost\\BHAVNAWK722:1433;databaseName=Employees;encrypt=true;trustServerCertificate=true";
	static String username = "sa";
	static String password = "Bhavna@123";
	
	
   //Insert data to employee table
	public void addEmployee() {
		
		
		try {
			connection = DriverManager.getConnection(dbURL,username,password);
			
			 col = connection.prepareCall("{call Fetchdata(?,?,?,?,?)}");
			
			
			System.out.println("Enter the employee id: ");
			int empId = scanner.nextInt();
			col.setInt(1, empId);
			
			System.out.println("Enter the employee name: ");
			String empName = scanner.next();
			col.setString(2, empName);
			
			System.out.println("Enter the employee salary: ");
			int empSalary = scanner.nextInt();
			col.setInt(3, empSalary);
			
			System.out.println("Enter the employee joining date: ");
			String empJoiningDate = scanner.next();
			col.setString(4, empJoiningDate);
			
			System.out.println("Enter the department Id: ");
			int deptId = scanner.nextInt();
			col.setInt(5, deptId);
			
			col.execute();
			
			System.out.println("Inserted successfully");
			
			System.out.println("Employee Id: "+empId+" Employee Name: "+empName+"Employee Salary: "+empSalary+" Employee Joining date: "+empJoiningDate+" DeptId: "+deptId );
		
            
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		

	}
	
	
	//Insert data to department table
	public void addDept() {
		try {
			connection = DriverManager.getConnection(dbURL,username,password);
			col = connection.prepareCall("{call Insertdata(?,?)}");
			
			System.out.println("Enter the departmant id: ");
			int deptId = scanner.nextInt();
			col.setInt(1, deptId);
			
			System.out.println("Enter the department Name: ");
			String deptName  = scanner.next();
			col.setString(2, deptName);
		
			col.execute();
				
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
	
	
	//Fetch all the data from both Employee and Departmant tables as a single table
	public void fetchAllData() {
		
		try {
			connection = DriverManager.getConnection(dbURL,username,password);
			col = connection.prepareCall("{call fetchAllEmployeesData}");
			
			
			ResultSet rs = col.executeQuery();
			
			while(rs.next()){
				
				System.out.println("Employee Id is: "+rs.getInt("empId"));
				System.out.println("Employee Name : "+rs.getString("empName"));
				System.out.println("Employee Salary : "+rs.getInt("empSal"));
				System.out.println("Employee Joinng date : "+rs.getString("empJoiningDate"));
				System.out.println("Employee department Id : "+rs.getInt("deptId"));
				System.out.println("Employee department name : "+rs.getString("deptName"));
				System.out.println();	
				
			}
				
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
	
		
	
	//Update Employee details
	public void updateEmployee() {
		
		try {
			connection = DriverManager.getConnection(dbURL,username,password);
			
			 col = connection.prepareCall("{call Updatedata(?,?,?,?,?)}");
			
			
			System.out.println("Enter the employee id: ");
			int empId = scanner.nextInt();
			col.setInt(1, empId);
			
			System.out.println("Enter the employee name to update: ");
			String empName = scanner.next();
			col.setString(2, empName);
			
			System.out.println("Enter the employee salary to update: ");
			int empSalary = scanner.nextInt();
			col.setInt(3, empSalary);
			
			System.out.println("Enter the employee joining date to update: ");
			String empJoiningDate = scanner.next();
			col.setString(4, empJoiningDate);
			
			System.out.println("Enter the department Id to update: ");
			int deptId = scanner.nextInt();
			col.setInt(5, deptId);
			
			col.execute();
			
			System.out.println("Updated successfully");
			
		   System.out.println("Employee Id: "+empId+" Employee Name: "+empName+"Employee Salary: "+empSalary+" Employee Joining date: "+empJoiningDate+" DeptId: "+deptId );
		
           
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
	}
	
	//query to find the employees count in each department whose salary greater than 30000 (deptName,EmployeesCount)
	public void query() {
		try {
			connection = DriverManager.getConnection(dbURL,username,password);
			col = connection.prepareCall("{call empQuery}");
			
			
			ResultSet rs = col.executeQuery();
			
			while(rs.next()){
				
				System.out.println("Department name is: "+rs.getString("deptName"));
				System.out.println("Number of employees in "+rs.getString("deptName")+" department "+" whose salary greater than 30000: "+rs.getInt("EmployeesCount"));
				
			}
				
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
	
	//Use switch case to enter options
	public void getByOptions(int options) {
		switch(options) {
		case 1:
			System.out.println("Employee data Inserting: ");
			addDept();
			addEmployee();
			break;
			
		case 2:
			System.out.println("Fetch all the data of employees: ");
			fetchAllData();
			break;
		case 3:
			System.out.println("Employee data updating: ");
			updateEmployee();
			break;
		case 4:
			System.out.println("Query excecuted successfully");
			query();
			break;
		default:
			System.err.println("Invalid Option");
		}
		
		
	}
	
	

}
