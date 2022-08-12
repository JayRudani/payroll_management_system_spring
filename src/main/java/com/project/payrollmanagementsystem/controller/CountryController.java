package com.project.payrollmanagementsystem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.payrollmanagementsystem.model.Country;
import com.project.payrollmanagementsystem.service.CountryService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class CountryController {
	
	@Autowired
	private CountryService countryService;

	@GetMapping("/countries")
	public List<Country> getAllCountrys() {
		return countryService.getAllCountrys();
	}
}
