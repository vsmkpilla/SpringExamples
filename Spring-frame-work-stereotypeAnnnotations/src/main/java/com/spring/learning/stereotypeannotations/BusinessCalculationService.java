package com.spring.learning.stereotypeannotations;

import org.springframework.stereotype.Service;

@Service
public class BusinessCalculationService {

	public DataService dataService;

	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public void executeCalculation() {
		dataService.Calculate();
	}
	
}
