package com.springmaven.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springmaven.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value = "SELECT * FROM Employeedb  WHERE status = 'Active'", nativeQuery = true)
	Collection<Employee> getAllActiveEmployees();

}