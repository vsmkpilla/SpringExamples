package com.springboot.learning.SpringJDBC.studentSt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String InsertQuery="""
			
insert into STUDENT (id,name)
values(?,?);
			""";
	
	private String SelectByIDQuery = """
			select * from STUDENT where id = ?;
			""";
	
	private String DeleteQuery ="""
			delete from STUDENT where id =?;
			""";
	
	public void insert(Student std) {
		jdbcTemplate.update(InsertQuery,std.getId(),std.getName());
	}
	public Student findByID(long id) {
		return jdbcTemplate.queryForObject(SelectByIDQuery,new BeanPropertyRowMapper<>(Student.class), id );
		
	}
	public void Delete(long id) {
		jdbcTemplate.update(DeleteQuery,id);
	}
	
}
