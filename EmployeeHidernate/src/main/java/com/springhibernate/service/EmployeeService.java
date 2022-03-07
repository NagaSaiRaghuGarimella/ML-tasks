package com.springhibernate.service;

import java.util.List;

import com.springhibernate.entity.Department;

public interface EmployeeService {

	List<Department> getEmployees();

	void saveEmployee(Department emp);

	Department getEmpById(int dept_id);

	void updateEmployeeById(int emp_id, Department emp);

}
