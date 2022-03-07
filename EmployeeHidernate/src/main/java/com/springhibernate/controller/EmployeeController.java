package com.springhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.springhibernate.entity.Department;
import com.springhibernate.service.EmployeeService;

@RestController
public class EmployeeController {


	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getAllEmployees")
	public List<Department> getAllEmployees() {
		List<Department> employees = employeeService.getEmployees();
		return employees;
	}

	@ResponseBody
	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestBody Department emp) {
		employeeService.saveEmployee(emp);
		return "Added successfully";
	}

	@GetMapping("/employeeById/{id}")
	public Department getEmployeeById(@PathVariable("id") int dept_id) {
		return employeeService.getEmpById(dept_id);
	}

	@ResponseBody
	@PutMapping("/updateById/{id}")
	public void updateEmployeeId(@PathVariable("id") int emp_id, @RequestBody Department emp) {
		employeeService.updateEmployeeById(emp_id, emp);
	}
}
