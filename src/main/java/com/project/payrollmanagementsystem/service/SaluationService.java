package com.project.payrollmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.payrollmanagementsystem.model.Saluation;
import com.project.payrollmanagementsystem.repository.SaluationRepository;

@Service
public class SaluationService {

	@Autowired
	private SaluationRepository saluationRepository;

	public List<Saluation> getAllSaluations() {
		return saluationRepository.findAll();
	}
}
