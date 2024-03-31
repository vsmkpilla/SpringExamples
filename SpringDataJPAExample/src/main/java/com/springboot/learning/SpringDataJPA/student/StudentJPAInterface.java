package com.springboot.learning.SpringDataJPA.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJPAInterface extends JpaRepository<Student, Long> {

}
