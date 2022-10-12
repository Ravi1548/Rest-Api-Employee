package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Employee;
import com.nissan.service.IEmployeeService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class UserController {
	
	//field DI injection
	@Autowired
	IEmployeeService empService;
	
	
	//get all employees
	@GetMapping("/")
	public List<Employee> getEmployees() {
		return empService.getAllEmployees();
	}
	
	//add an employee
	@PostMapping("/")
	public Employee addEmployee(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}
	
	// update employee
	@PutMapping("/")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return empService.updateEmployee(employee);
	}
	
	// delete an employee
	@PutMapping("/delete")
	public Employee deleteEmployee(@RequestBody Employee employee) {
		return empService.deleteEmployee(employee);
	}
	
	// search employee by phone
	@RequestMapping("/search/{phone}")
	public Employee searchEmployee(@PathVariable Long phone) {
		return empService.searchByPhone(phone);
	}
}
