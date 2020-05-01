package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer>{

	public Iterable<Student> findBySchoolName(String name);
	public Optional<Student> findBySchoolNameAndRollNo(String schoolName,int rollNo);
}
