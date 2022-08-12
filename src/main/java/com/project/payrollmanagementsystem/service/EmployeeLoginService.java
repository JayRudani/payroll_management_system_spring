package com.project.payrollmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.payrollmanagementsystem.model.Employee;
import com.project.payrollmanagementsystem.repository.EmployeeRepository;

@Service
public class EmployeeLoginService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	public Employee checkLogin(Employee employee) {
		
		return employeeRepo.checkLogin(employee.getEmployee_email(), employee.getEmployee_password());
		
	}
	
}
