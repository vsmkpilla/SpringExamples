package com.springboot.learning.jpaclasses;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;


@Component
public class EmployeJPACommandLineRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository eRepository;
	@Override
	public void run(String... args) throws Exception {
		
		eRepository.insert(new Employee(1,"Mani","hyd"));
	}

}
