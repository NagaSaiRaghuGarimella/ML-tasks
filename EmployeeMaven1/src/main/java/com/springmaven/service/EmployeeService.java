package com.springmaven.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springmaven.entity.Employee;

@Service
public interface EmployeeService {

	public List<Employee> getAllActiveEmployees();

	public List<Employee> getAllEmployee();

}
