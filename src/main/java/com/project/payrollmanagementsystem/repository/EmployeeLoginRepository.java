package com.project.payrollmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.payrollmanagementsystem.model.Employee;
import com.project.payrollmanagementsystem.model.EmployeeLogin;

@Repository
public interface EmployeeLoginRepository extends JpaRepository<EmployeeLogin, Long> {

	@Query(value = "SELECT * FROM employee_login WHERE employee_email = ?1 AND employee_password = ?2", nativeQuery = true)
	public EmployeeLogin checkLogin(String employee_email, String employee_password);
}
