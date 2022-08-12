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
import com.project.payrollmanagementsystem.model.Country;
import com.project.payrollmanagementsystem.model.Department;
import com.project.payrollmanagementsystem.model.Employee;
import com.project.payrollmanagementsystem.model.Province;
import com.project.payrollmanagementsystem.repository.EmployeeRepository;
import com.project.payrollmanagementsystem.service.EmployeeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		
		return employeeService.getAllEmployees();
	}

	@GetMapping("/employees/search/{name}")
	public List<Employee> getEmployeeByName(@PathVariable(value = "name") String employeeName) {
			return employeeService.getEmployeeByName(employeeName);
	}
	
	@GetMapping("/employees/search-province/{province}")
	public List<Employee> searchUserByProvince(@PathVariable(value = "province") String employeeProvince) {
			return employeeService.searchUserByProvince(employeeProvince);
	}
	
	@GetMapping("/employees/all-employees")
	public ArrayList getAllEmployeeFields() {
		 return employeeService.getAllEmployeeFields();
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		return employeeService.getEmployeeById(employeeId);
	}

	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
			@Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
		return employeeService.updateEmployee(employeeId, employeeDetails);
	}

	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		return employeeService.deleteEmployee(employeeId)
;	}
}
