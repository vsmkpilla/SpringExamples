package com.springboot.learning.empdetails.rest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learning.empdetails.jpa.Employee;
import com.springboot.learning.empdetails.jpa.EmployeeControllerRepository;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeControllerRepository empRepo;
	
	@RequestMapping("/insertEmployee")
	public Employee insertEMployee(@RequestParam long id, @RequestParam String name) {
		empRepo.insert(new Employee(id,name));
		return empRepo.findByID(id);
		
	}
	
	@RequestMapping("/findEmployee")
	public Employee findEmployee(@RequestParam long id) {
		return empRepo.findByID(id);
	}

	
	
}
