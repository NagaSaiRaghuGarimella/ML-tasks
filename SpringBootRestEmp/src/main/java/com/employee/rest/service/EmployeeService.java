package com.employee.rest.service;

import java.io.IOException;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.employee.rest.entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee) throws IOException;
	Employee getEmployeeById(Integer emp_id);
	Employee updateEmployee(Integer emp_id,Employee employee);
	void deleteEmployeeById(Integer emp_id);
	List<Employee> getAllEmployees();
	Page<Employee> employeesPageable(Pageable pageable);
		
}
