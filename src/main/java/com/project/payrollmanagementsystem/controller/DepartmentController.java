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
import com.project.payrollmanagementsystem.model.Department;
import com.project.payrollmanagementsystem.repository.DepartmentRepository;
import com.project.payrollmanagementsystem.service.DepartmentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/departments")
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}

	@GetMapping("/departments/search/{name}")
	public List<Department> getDepartmentByName(@PathVariable(value = "name") String departmentName) {
			return departmentService.getDepartmentByName(departmentName);
	}
	
	@GetMapping("/departments/search-province/{province}")
	public List<Department> searchUserByProvince(@PathVariable(value = "province") String departmentProvince) {
			return departmentService.searchUserByProvince(departmentProvince);
	}
	
	@GetMapping("/departments/all-departments")
	public ArrayList getAllDepartmentFields() {
		return departmentService.getAllDepartmentFields();
	}
	
	@GetMapping("/departments/{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable(value = "id") Long departmentId)
			throws ResourceNotFoundException {
		return departmentService.getDepartmentById(departmentId);
	}

	@PostMapping("/departments")
	public Department createDepartment(@Valid @RequestBody Department department) {
		return departmentService.createDepartment(department);
	}

	@PutMapping("/departments/{id}")
	public ResponseEntity<Department> updateDepartment(@PathVariable(value = "id") Long departmentId,
			@Valid @RequestBody Department departmentDetails) throws ResourceNotFoundException {
		return departmentService.updateDepartment(departmentId,departmentDetails);
		
	}

	@DeleteMapping("/departments/{id}")
	public Map<String, Boolean> deleteDepartment(@PathVariable(value = "id") Long departmentId)
			throws ResourceNotFoundException {
		return departmentService.deleteDepartment(departmentId);
	}
}
