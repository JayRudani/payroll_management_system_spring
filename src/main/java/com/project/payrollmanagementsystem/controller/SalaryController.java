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
import com.project.payrollmanagementsystem.model.Month;
import com.project.payrollmanagementsystem.model.Salary;
import com.project.payrollmanagementsystem.repository.SalaryRepository;
import com.project.payrollmanagementsystem.service.SalaryService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class SalaryController {
	@Autowired
	private SalaryService salaryService;
	

	@GetMapping("/salaries")
	public List<Salary> getAllSalarys() {
		return salaryService.getAllSalarys();
	}

	@GetMapping("/salaries/search/{name}")
	public List<Salary> getSalaryByName(@PathVariable(value = "name") String salaryName) {
			return salaryService.getSalaryByName(salaryName);
	}
	
	@GetMapping("/salaries/search-state/{state}")
	public List<Salary> serchUserByState(@PathVariable(value = "state") String salaryState) {
			return salaryService.serchUserByState(salaryState);
	}
	
	@GetMapping("/salaries/all-salaries")
	public ArrayList getAllSalaryFields() {
		 return salaryService.getAllSalaryFields();
	}
	
	@GetMapping("/salaries/{id}")
	public ResponseEntity<Salary> getSalaryById(@PathVariable(value = "id") Long salaryId)
			throws ResourceNotFoundException {
		return salaryService.getSalaryById(salaryId);
				
	}

	@PostMapping("/salaries")
	public Salary createSalary(@Valid @RequestBody Salary salary) {
		return salaryService.createSalary(salary);
	}

	@PutMapping("/salaries/{id}")
	public ResponseEntity<Salary> updateSalary(@PathVariable(value = "id") Long salaryId,
			@Valid @RequestBody Salary salaryDetails) throws ResourceNotFoundException {
		
		return salaryService.updateSalary(salaryId, salaryDetails);
	}

	@DeleteMapping("/salaries/{id}")
	public Map<String, Boolean> deleteSalary(@PathVariable(value = "id") Long salaryId)
			throws ResourceNotFoundException {
		return salaryService.deleteSalary(salaryId);
	}
}
