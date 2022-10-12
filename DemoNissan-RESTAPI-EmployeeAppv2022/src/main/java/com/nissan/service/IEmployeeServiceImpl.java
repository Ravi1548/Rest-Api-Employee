package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nissan.model.Employee;
import com.nissan.repo.IEmployeeRepository;

@Service
public class IEmployeeServiceImpl implements IEmployeeService {
	
	//DI injection
	@Autowired
	IEmployeeRepository empRepo;

	//get all employees
	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) empRepo.findAll();
	}

	//add an employee
	@Transactional
	@Override
	public Employee addEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	//update an employee
	@Transactional
	@Override
	public Employee updateEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	//search by employee phone
	@Override
	public Employee searchByPhone(long phone) {
		Employee employee = empRepo.searchEmployeeByPhone(phone);
		if(phone == employee.getPhone()) {
			return employee;
		}
		return null;
	}

	//delete employee
	@Override
	public Employee deleteEmployee(Employee employee) {
		return empRepo.save(employee);
	}

}
