package com.project.payrollmanagementsystem.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "province")
@Entity(name = "province")

public class Province {

	private long province_id;
	private String province_name;
	
//	@OneToOne(fetch=FetchType.LAZY, mappedBy="state")
//    private Employee employee;
	
	
	public Province() {
		
	}

	public Province(long province_id, String province_name) {
		super();
		this.province_id = province_id;
		this.province_name = province_name;
	}


	@Override
	public String toString() {
		return "State [province_id=" + province_id + ", province_name=" + province_name + "]";
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getProvince_id() {
		return province_id;
	}


	public void setProvince_id(long province_id) {
		this.province_id = province_id;
	}


	public String getProvince_name() {
		return province_name;
	}


	public void setProvince_name(String province_name) {
		this.province_name = province_name;
	}
	
}
