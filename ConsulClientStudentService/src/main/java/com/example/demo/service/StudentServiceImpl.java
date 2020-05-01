package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentDao dao;
	@Autowired
	public StudentServiceImpl(StudentDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return (List<Student>) dao.findAll();
	}

	@Override
	public List<Student> getAllStudentBySchool(String name) {
		// TODO Auto-generated method stub
		return (List<Student>) dao.findBySchoolName(name);
	}

	@Override
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		return dao.findById(rollNo).get();
	}

	@Override
	public Student getStudentBySchoolAndRollNo(String name, int rollNo) {
		// TODO Auto-generated method stub
		return dao.findBySchoolNameAndRollNo(name, rollNo).get();
	}

}
