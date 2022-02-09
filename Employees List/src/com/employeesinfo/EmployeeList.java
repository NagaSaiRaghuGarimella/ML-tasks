package com.employeesinfo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.entity.Employee;

public class EmployeeList {
	
	
    List<Employee> employeeList = new ArrayList<Employee>();
	static Map<String, List<Employee>> map;
	
	public void employeeDetails() {
	
	
	Employee employee1 = new Employee( "Satish",25000.0,"Hyderabad");
	Employee employee2 = new Employee( "Harish",28000.0,"Banglore");
	Employee employee3 = new Employee( "Martin",150000.5,"Vijayawada");
	Employee employee4 = new Employee( "King",27000.0,"Kolkata");
	Employee employee5 = new Employee( "Sarala",100000.0,"Vijag");
	Employee employee6 = new Employee( "Sowmya",30000.0,"Pune");
	Employee employee7 = new Employee( "Mahesh",180000.0,"Mumbai");
	Employee employee8 = new Employee( "Kiran",30000.0,"Ahmedabad");
	Employee employee9 = new Employee( "Lenin",35000.0,"Noida");
	Employee employee10 = new Employee( "Veda",42000.0,"Chennai");
	
	employeeList.add(employee1);
	employeeList.add(employee2);
	employeeList.add(employee3);
	employeeList.add(employee4);
	employeeList.add(employee5);
	employeeList.add(employee6);
	employeeList.add(employee7);
	employeeList.add(employee8);
	employeeList.add(employee9);
	employeeList.add(employee10);
	
    //Employee count whose name starts with 's'.
    System.out.println("Employee count starting with S ");
    long count = employeeList.stream().filter(x-> x.getEmployeeName().startsWith("S")).count();
    System.out.println(count);
    
    //Employee with location Hyderabad.
    System.out.println(" Employees with location Hyderabad ");
	List<Employee> result = employeeList.parallelStream().filter(loc->loc.getEmployeeLocation().equalsIgnoreCase("Hyderabad")).collect(Collectors.toList());
	System.out.println(result);
    
	//Employees whose salary greater than 100000.
    System.out.println("Employees whose salary is greater than 100000");
    List<Employee> salary = employeeList.stream().filter(sal->sal.getEmployeeSalary()>100000).toList();
    System.out.println(salary);
    
     //Get location as key and employee details as values.
	map =employeeList.stream().collect(Collectors.groupingBy(Employee::getEmployeeLocation,Collectors.mapping(employee->employee, Collectors.toList())));
		
	System.out.println("Details of all the employees:");
	
	System.out.println(map);
	
      //Sorted based on names.
	 System.out.println("Sorting based on names:");
	 employeeList.stream().sorted(Comparator.comparing(empName->empName.getEmployeeName())).forEach(System.out::println);
	
	 //Sorted based on Locations.
	 System.out.println("Sorting based on Locations:");
	 employeeList.stream().sorted(Comparator.comparing(empLoc->empLoc.getEmployeeLocation())).forEach(System.out::println);
	
	
	}
    
	
}
