package com.springboot.learning.SpringJDBC.studentSt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRepository {
	
	@Autowired
	private EntityManager eManager;
	
	
	
	public void insert(Student std) {
		eManager.merge(std);
	}
	public Student findByID(long id) {
		return eManager.find(Student.class, id);
		
	}
	public void Delete(long id) {
		Student std = findByID(id);
		eManager.remove(std);
	}
	
}
