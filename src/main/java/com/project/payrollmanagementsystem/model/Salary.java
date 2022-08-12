package com.project.payrollmanagementsystem.model;

import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "salary")
@Entity(name = "salary")

public class Salary {

	private long salary_id;
	private String salary_employee_id;
	private String salary_month;
	private String salary_working_days;
	private String salary_basic;
	private String salary_dtax;
	private String salary_desc;
	private String salary_total;
	private String salary_dedc;
	
	public Salary(long salary_id, String salary_employee_id, String salary_month, String salary_working_days,
			String salary_basic, String salary_dtax,
			String salary_desc, String salary_total, String salary_dedc) {
		super();
		this.salary_id = salary_id;
		this.salary_employee_id = salary_employee_id;
		this.salary_month = salary_month;
		this.salary_working_days = salary_working_days;
		this.salary_basic = salary_basic;
		this.salary_dtax = salary_dtax;
		this.salary_desc = salary_desc;
		this.salary_total = salary_total;
		this.salary_dedc = salary_dedc;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getSalary_id() {
		return salary_id;
	}

	public void setSalary_id(long salary_id) {
		this.salary_id = salary_id;
	}

	public String getSalary_employee_id() {
		return salary_employee_id;
	}

	public void setSalary_employee_id(String salary_employee_id) {
		this.salary_employee_id = salary_employee_id;
	}

	public String getSalary_month() {
		return salary_month;
	}

	public void setSalary_month(String salary_month) {
		this.salary_month = salary_month;
	}

	public String getSalary_working_days() {
		return salary_working_days;
	}

	public void setSalary_working_days(String salary_working_days) {
		this.salary_working_days = salary_working_days;
	}

	public String getSalary_basic() {
		return salary_basic;
	}

	public void setSalary_basic(String salary_basic) {
		this.salary_basic = salary_basic;
	}

	public String getSalary_dtax() {
		return salary_dtax;
	}

	public void setSalary_dtax(String salary_dtax) {
		this.salary_dtax = salary_dtax;
	}

	public String getSalary_desc() {
		return salary_desc;
	}

	public void setSalary_desc(String salary_desc) {
		this.salary_desc = salary_desc;
	}

	public String getSalary_total() {
		return salary_total;
	}

	public void setSalary_total(String salary_total) {
		this.salary_total = salary_total;
	}

	public String getSalary_dedc() {
		return salary_dedc;
	}

	public void setSalary_dedc(String salary_dedc) {
		this.salary_dedc = salary_dedc;
	}

	public Salary() {
		
	}
	
	
}
