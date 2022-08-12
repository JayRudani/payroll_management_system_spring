package com.project.payrollmanagementsystem.service;

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
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.payrollmanagementsystem.exception.ResourceNotFoundException;
import com.project.payrollmanagementsystem.model.Department;
import com.project.payrollmanagementsystem.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@PersistenceContext
    private EntityManager entityManager;

	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	public List<Department> getDepartmentByName(@PathVariable(value = "name") String departmentName) {
			return departmentRepository.searchUserByName(departmentName);
	}
	

	public List<Department> searchUserByProvince(@PathVariable(value = "province") String departmentProvince) {
			return departmentRepository.searchUserByProvince(departmentProvince);
	}
	

	public ArrayList getAllDepartmentFields() {
		 Query q = entityManager.createQuery("SELECT dept from department dept");
		 List<Object[]> department = q.getResultList();
		 ArrayList<HashMap<String, String>> resultArray = new ArrayList();
		 
		 for ( Object[] row : department ) {
			 Department department_details = (Department)row[ 0 ];
			 
			    HashMap<String, String> results = new HashMap();
			    results.put("department_id",String.valueOf(department_details.getDepartment_id()));
			    results.put("department_name",department_details.getDepartment_name());
			    
			    resultArray.add(results);			 
		 }	 
        return resultArray;
	}
	

	public ResponseEntity<Department> getDepartmentById(@PathVariable(value = "id") Long departmentId)
			throws ResourceNotFoundException {
		Department department = departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException("Department not found for this id :: " + departmentId));
		return ResponseEntity.ok().body(department);
	}


	public Department createDepartment(@Valid @RequestBody Department department) {
		return departmentRepository.save(department);
	}


	public ResponseEntity<Department> updateDepartment(@PathVariable(value = "id") Long departmentId,
			@Valid @RequestBody Department departmentDetails) throws ResourceNotFoundException {
		final Department updatedDepartment = departmentRepository.save(departmentDetails);
		return ResponseEntity.ok(updatedDepartment);
	}


	public Map<String, Boolean> deleteDepartment(@PathVariable(value = "id") Long departmentId)
			throws ResourceNotFoundException {
		Department department = departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException("Department not found for this id :: " + departmentId));

		departmentRepository.delete(department);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
