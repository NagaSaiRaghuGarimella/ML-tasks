package com.employee.rest.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.rest.entity.Employee;
import com.employee.rest.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/Employee")
	public Employee addEmployee(@RequestBody Employee employee) throws IOException {
		return service.saveEmployee(employee);
	}

	@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable("id") int emp_id) {
		return service.getEmployeeById(emp_id);
	}

	@PutMapping("/updateEmployee/{id}")

	public ResponseEntity<Employee> updateStudent(@PathVariable("id") int emp_id, @RequestBody Employee employee) {

		return new ResponseEntity<Employee>(service.updateEmployee(emp_id, employee), HttpStatus.OK);

	}

	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable("id") Integer emp_id) {

		service.deleteEmployeeById(emp_id);

		return new ResponseEntity<>("Employee deleted Successfully", HttpStatus.OK);

	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		
		return service.getAllEmployees();
		
	}
	
	@GetMapping("/pageEmployees")
	Page<Employee> employeesPageable(Pageable pageable){
		return service.employeesPageable(pageable);
		
	}
}
