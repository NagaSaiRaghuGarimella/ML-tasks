package com.employee.rest.service;

import java.io.IOException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.employee.rest.entity.Employee;
import com.employee.rest.exception.InvalidIdException;
import com.employee.rest.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee saveEmployee(Employee employee) throws IOException {
		Optional<Employee> var = repository.findById(employee.getEmp_id());
		if (var.isPresent()) {

			throw new IOException("EMPLOYEE ALREADY EXIST");
		} else {

			return repository.save(employee);
		}

	}

	@Override
	public Employee getEmployeeById(Integer emp_id) {
		return repository.findById(emp_id)
				.orElseThrow(() -> new InvalidIdException(" Employee not exsits with id " +emp_id));
	}

	@Override
	public Employee updateEmployee(Integer emp_id, Employee employee) {
		repository.findById(emp_id).orElseThrow(() -> new InvalidIdException(" Employee not exsits with id " +emp_id));
		return repository.save(employee);

	}

	@Override
	public void deleteEmployeeById(Integer emp_id) {

		repository.findById(emp_id).orElseThrow(() -> new InvalidIdException(" Employee not exsits with id " +emp_id));
		repository.deleteById(emp_id);

	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	@Override
	public Page<Employee> employeesPageable(Pageable pageable) {
		return repository.findAll(pageable);
	}

}
