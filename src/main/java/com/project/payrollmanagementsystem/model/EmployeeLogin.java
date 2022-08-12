package com.project.payrollmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "employee_login")
@Entity(name = "employee_login")
public class EmployeeLogin {

	@Id
	private String employee_email;
	private String employee_password;
	
	public EmployeeLogin()
	{}
	
	public EmployeeLogin(String employee_email, String employee_password) {
		super();
		this.employee_email=employee_email;
		this.employee_password=employee_password;
	}

	public String getEmployee_email() {
		return employee_email;
	}

	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}

	public String getEmployee_password() {
		return employee_password;
	}

	public void setEmployee_password(String employee_password) {
		this.employee_password = employee_password;
	}

	@Override
	public String toString() {
		return "EmployeeLogin [employee_email=" + employee_email + ", employee_password=" + employee_password + "]";
	}
	
	
}
