package com.project.payrollmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.payrollmanagementsystem.model.Month;
import com.project.payrollmanagementsystem.repository.MonthRepository;

@Service
public class MonthService {

	@Autowired
	private MonthRepository monthRepository;

	public List<Month> getAllMonths() {
		return monthRepository.findAll();
	}
}
