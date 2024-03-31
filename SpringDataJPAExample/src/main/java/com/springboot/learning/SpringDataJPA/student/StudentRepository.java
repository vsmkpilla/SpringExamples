package com.springboot.learning.SpringDataJPA.student;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRepository {
	@Autowired
	private StudentJPAInterface stdInterface;
	
	public void insert(Student std) {
		stdInterface.save(std);
	}
	
	public Optional<Student> findByID(long id) {
		return stdInterface.findById(id);
	}
	public void Delete(long id) {
		stdInterface.deleteById(id);
	}
	
	
}
