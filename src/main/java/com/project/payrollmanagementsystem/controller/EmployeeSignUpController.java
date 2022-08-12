package com.project.payrollmanagementsystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.payrollmanagementsystem.model.Employee;
import com.project.payrollmanagementsystem.model.EmployeeLogin;
import com.project.payrollmanagementsystem.service.EmployeeLoginService;
import com.project.payrollmanagementsystem.service.EmployeeSignUpService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class EmployeeSignUpController {

	@Autowired
	private EmployeeSignUpService employeeSignUpService;
		
	@PostMapping("/employeesignup")
	public EmployeeLogin signup(@Valid @RequestBody EmployeeLogin employee) {
		
		return employeeSignUpService.signup(employee);
		
	}
}
