package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.service.IEmployeeService;

@RestController
public class TestController {
	
	//DI injection
	@Autowired
	IEmployeeService empService;
	

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Employee Management System";
	}
	
	
}
