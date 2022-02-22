package com.springmaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springmaven.entity.Employee;
import com.springmaven.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getActive")
	public List<Employee> showAllActiveEmployees() {
		System.out.println(" Active Employees Request passed:");
		List<Employee> employeeList = employeeService.getAllActiveEmployees();
		return employeeList;
	}

	@GetMapping("/getAllEmployees")
	public List<Employee> displayAllAEmployees() {
		System.out.println("Employee Page Requested passed for All  Employees");
		List<Employee> employeeList = employeeService.getAllEmployee();
		return employeeList;
	}

}
