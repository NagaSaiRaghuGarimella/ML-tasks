package com.springhibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employees {

	@Id
	private Integer emp_id;

	@Column(name = "emp_name")
	private String emp_name;

	@Column(name = "emp_salary")
	private Long emp_salary;

	@Column(name = "emp_joining_date")
	private String emp_joining_date;

	@Column(name = "emp_status")
	private String emp_status;

	public Employees() {
		super();

	}

	public Employees(Integer emp_id, String emp_name, Long emp_salary, String emp_joining_date, String emp_status) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_joining_date = emp_joining_date;
		this.emp_status = emp_status;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public Long getEmp_salary() {
		return emp_salary;
	}

	public String getEmp_joining_date() {
		return emp_joining_date;
	}

	public String getEmp_status() {
		return emp_status;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public void setEmp_salary(Long emp_salary) {
		this.emp_salary = emp_salary;
	}

	public void setEmp_joining_date(String emp_joining_date) {
		this.emp_joining_date = emp_joining_date;
	}

	public void setEmp_status(String emp_status) {
		this.emp_status = emp_status;
	}

}
