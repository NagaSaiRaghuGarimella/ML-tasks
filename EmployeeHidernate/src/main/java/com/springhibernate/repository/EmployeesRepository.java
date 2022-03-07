package com.springhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springhibernate.entity.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

}
