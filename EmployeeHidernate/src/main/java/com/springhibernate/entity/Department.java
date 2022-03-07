package com.springhibernate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	
	@Id
	@Column(name = "dept_id")
	private Integer dept_id;
	
	@Column(name = "dept_name")
	private String dept_name;
	
	@OneToMany(targetEntity = Employees.class,fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "dept_id", referencedColumnName = "dept_id")
	private List<Employees> employees;

	public Department() {
		super();
		
	}

	public Department(Integer dept_id, String dept_name, List<Employees> employees) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.employees = employees;
	}

	public Integer getDept_id() {
		return dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public List<Employees> getEmployees() {
		return employees;
	}

	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}
	
	
	
	

}
