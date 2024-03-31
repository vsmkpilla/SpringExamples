package com.springboot.learning.SpringJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learning.SpringJDBC.studentSt.Student;
import com.springboot.learning.SpringJDBC.studentSt.StudentRepository;
@Component
public class StudentCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private StudentRepository stdRepo;

	@Override
	public void run(String... args) throws Exception {
		
				stdRepo.insert(new Student(2,"Santhu"));
				stdRepo.insert(new Student(3,"Santhu"));
				stdRepo.insert(new Student(4,"Santhu"));
				stdRepo.insert(new Student(5,"Santhu"));
				stdRepo.insert(new Student(6,"Santhu"));
				
				System.out.println(stdRepo.findByID(4));
			
				stdRepo.Delete(6);
		
		
	}

}
