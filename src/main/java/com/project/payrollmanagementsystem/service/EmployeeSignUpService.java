package com.project.payrollmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.payrollmanagementsystem.model.Employee;
import com.project.payrollmanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeSignUpService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	public Employee signup(Employee employee) {
		
		return employeeRepo.save(employee);
	}
}
