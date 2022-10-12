package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TblEmployee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String designation;
	private LocalDate doj;
	private double salary;
	private boolean isActive;
	private long phone;
	
	@JoinColumn(name="deptId")
	@ManyToOne
	private Department department;
	

	//default constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Employee(int empId, String empName, String designation, LocalDate doj, double salary, boolean isActive,long phone,
			Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.doj = doj;
		this.salary = salary;
		this.isActive = isActive;
		this.phone = phone;
		this.department = department;
	}

	//getters and setters
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	//custom methods
	
	//to string
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", doj=" + doj
				+ ", salary=" + salary + ", isActive=" + isActive + ", department=" + department + "]";
	}
	
	
	
	
}
