package com.project.payrollmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.payrollmanagementsystem.model.Country;
import com.project.payrollmanagementsystem.repository.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepo;
	
	public List<Country> getAllCountrys(){
		return countryRepo.findAll();
	}
}
