package com.springboot.learning.SpringDataJPA;

import org.hibernate.tool.schema.spi.CommandAcceptanceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.stereotype.Component;

import com.springboot.learning.SpringDataJPA.student.Student;
import com.springboot.learning.SpringDataJPA.student.StudentRepository;
@Component
public class StudentCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private StudentRepository stdRepo;
	@Override
	public void run(String... args) throws Exception {
		
		stdRepo.insert(new Student(1,"Santhu"));
		stdRepo.insert(new Student(2,"Santhu"));
		stdRepo.insert(new Student(3,"Santhu"));
		
		System.out.println(stdRepo.findByID(2));
		stdRepo.Delete(3);
		
	}

}
