package com.entity;



public class Employee {
	
	private String employeeName;
	private double employeeSalary;
	private String employeeLocation;
	
	public Employee(String employeeName, double employeeSalary, String employeeLocation) {
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeLocation = employeeLocation;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public String getEmployeeLocation() {
		return employeeLocation;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeSalary=" + employeeSalary + ", employeeLocation="
				+ employeeLocation + "]";
	}
	
	
	

	


}

    
	
	
	


