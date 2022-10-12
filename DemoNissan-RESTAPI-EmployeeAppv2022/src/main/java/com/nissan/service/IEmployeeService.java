package com.nissan.service;

import java.util.List;

import com.nissan.model.Employee;

public interface IEmployeeService {

	//get all employees
	List<Employee> getAllEmployees();
	
	//add an employee
	Employee addEmployee(Employee employee);
	
	//edit an employee
	Employee updateEmployee(Employee employee);
	
	//delete an employee
	Employee deleteEmployee(Employee employee);
	
	
	//search by phone
	Employee searchByPhone(long phone);
	
}
