package com.springmaven.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "Employeedb")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empId")
	private int empId;
	@Column(name = "empName")
	private String empName;
	@Column(name = "empSal")
	private int empSal;
	@Column(name = "empJoiningDate")
	private String empJoiningDate;
	@Column(name = "deptId")
	private int deptId;
	@Column(name = "deptName")
	private String deptName;
	@Column(name = "status")
	private String Status;

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public String getEmpJoiningDate() {
		return empJoiningDate;
	}

	public int getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public String getStatus() {
		return Status;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public void setEmpJoiningDate(String empJoiningDate) {
		this.empJoiningDate = empJoiningDate;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empJoiningDate="
				+ empJoiningDate + ", deptId=" + deptId + ",deptName=" + deptName + ", Status=" + Status + "]";
	}

}
