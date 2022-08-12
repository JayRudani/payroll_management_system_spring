package com.project.payrollmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.payrollmanagementsystem.model.Province;
import com.project.payrollmanagementsystem.repository.ProvinceRepository;

@Service
public class ProvinceService {

	@Autowired
	private ProvinceRepository provinceRepository;
	
	public List<Province> getAllProvinces() {
		return provinceRepository.findAll();
	}
}
