package com.springhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springhibernate.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
