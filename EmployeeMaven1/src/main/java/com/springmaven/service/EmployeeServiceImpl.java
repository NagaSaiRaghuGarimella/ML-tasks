package com.springmaven.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springmaven.entity.Employee;
import com.springmaven.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	@Override
	@Transactional
	public List<Employee> getAllActiveEmployees() {
		return (List<Employee>) repository.getAllActiveEmployees();

	}

	@Override
	public List<Employee> getAllEmployee() {

		List<Employee> list = new ArrayList<>();
		repository.findAll().forEach(e -> list.add(e));
		return list;

	}

}
