package com.project.payrollmanagementsystem.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.payrollmanagementsystem.exception.ResourceNotFoundException;
import com.project.payrollmanagementsystem.model.Employee;
import com.project.payrollmanagementsystem.model.Login;
import com.project.payrollmanagementsystem.repository.EmployeeRepository;
import com.project.payrollmanagementsystem.repository.LoginRepository;
import com.project.payrollmanagementsystem.service.EmployeeLoginService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class EmployeeLoginController {
	
	@Autowired
	private EmployeeLoginService employeeLoginService;
		
	@PostMapping("/employeelogin")
	public Employee checkLogin(@Valid @RequestBody Employee employee) {
		
		return employeeLoginService.checkLogin(employee);
		
	}
}
