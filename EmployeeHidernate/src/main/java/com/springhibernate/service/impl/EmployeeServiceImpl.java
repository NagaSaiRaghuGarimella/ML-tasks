package com.springhibernate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springhibernate.employeedao.EmployeeDAO;
import com.springhibernate.entity.Department;
import com.springhibernate.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public List<Department> getEmployees() {
		return employeeDAO.getEmployees();
	}

	@Override
	public void saveEmployee(Department emp) {

		employeeDAO.saveEmployee(emp);
	}

	@Override
	public Department getEmpById(int dept_id) {

		return employeeDAO.getEmpById(dept_id);
	}

	@Override
	public void updateEmployeeById(int emp_id, Department emp) {

		employeeDAO.updateEmployeeById(emp_id, emp);
	}

}
