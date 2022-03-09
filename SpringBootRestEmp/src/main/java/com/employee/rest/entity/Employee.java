package com.employee.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Integer emp_id;
	@Column(name = "emp_name")
	private String emp_name;
	@Column(name = "emp_sal")
	private Long emp_sal;
	@Column(name = "emp_age")
	private Integer emp_age;
	@Column(name = "job_title")
	private String job_title;
	@Column(name = "gender")
	private String gender;

	public Employee() {
		super();
	}

	public Employee(Integer emp_id, String emp_name, Long emp_sal, Integer emp_age, String job_title, String gender) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
		this.emp_age = emp_age;
		this.job_title = job_title;
		this.gender = gender;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public Long getEmp_sal() {
		return emp_sal;
	}

	public Integer getEmp_age() {
		return emp_age;
	}

	public String getJob_title() {
		return job_title;
	}

	public String getGender() {
		return gender;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public void setEmp_sal(Long emp_sal) {
		this.emp_sal = emp_sal;
	}

	public void setEmp_age(Integer emp_age) {
		this.emp_age = emp_age;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
