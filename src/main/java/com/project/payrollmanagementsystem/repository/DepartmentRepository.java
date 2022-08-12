package com.project.payrollmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.payrollmanagementsystem.model.Department;
import com.project.payrollmanagementsystem.model.Salary;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	@Query(value = "SELECT * FROM department WHERE department_first_name = ?1", nativeQuery = true)
	public List<Department> searchUserByName(String department_name);
	
	// Example of Native Query - SQL
	@Query(value = "SELECT * FROM department, province WHERE province_id = department_province", nativeQuery = true)
	public List<Department> searchUserByProvince(String department_province);
	
	
}
