package com.springboot.learning.SpringDataJPA.empdetails.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeRepository empRepo;
	
	@RequestMapping("/insert")
	public void insertEmployee(@RequestParam long id, @RequestParam String name) {
		empRepo.save(new Employee(id,name));
	}
	
	@RequestMapping("/find")
	public Optional<Employee> findEmployee(@RequestParam long id) {
		Optional<Employee> emp =  empRepo.findById(id);
		return emp;
	}
	
	@RequestMapping("/findAllEmployees")
	public List<List<Employee>> findAll(){
		return Arrays.asList(empRepo.findAll()) ;
	}

}
