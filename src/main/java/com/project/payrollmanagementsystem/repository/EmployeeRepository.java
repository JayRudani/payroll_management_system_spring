package com.project.payrollmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.payrollmanagementsystem.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	
	@Query(value = "SELECT * FROM employee WHERE employee_first_name = ?1", nativeQuery = true)
	public List<Employee> searchUserByName(String employee_name);
	
	// Example of Native Query - SQL
	@Query(value = "SELECT * FROM employee, province WHERE province_id = employee_province", nativeQuery = true)
	public List<Employee> searchUserByProvince(String employee_province);
	

}