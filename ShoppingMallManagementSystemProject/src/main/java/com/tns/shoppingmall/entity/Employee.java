package com.tns.shoppingmall.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Employee {

	@Id
	@Column(name="empId")
	private int empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empDOB")
	private LocalDate empDOB;
	
	@Column(name="empSalary")
	private float empSalary;
	
	@Column(name="empAddress")
	private String empAddress;
	
	@Column(name="empDesignation")
	private String empDesignation;
	
	@ManyToOne
	private Shop shop;
	
	public Employee() {
	}

	public Employee(int empId, String empName, LocalDate empDOB, float empSalary, String empAddress,String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDOB = empDOB;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.empDesignation = empDesignation;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public LocalDate getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(LocalDate empDOB) {
		this.empDOB = empDOB;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDOB=" + empDOB + ", empSalary=" + empSalary
				+ ", empAddress=" + empAddress + ", empDesignation=" + empDesignation + ", getEmpId()=" + getEmpId()
				+ ", getEmpName()=" + getEmpName() + ", getEmpDOB()=" + getEmpDOB() + ", getEmpSalary()="
				+ getEmpSalary() + ", getEmpAddress()=" + getEmpAddress() + ", getEmpDesignation()="
				+ getEmpDesignation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
