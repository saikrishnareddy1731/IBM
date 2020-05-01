package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	public Student addStudent(Student student);
	public List<Student> getAllStudent();
	public List<Student> getAllStudentBySchool(String name);
	public Student getStudentBySchoolAndRollNo(String name,int rollNo);
	public Student getStudent(int rollNo);
}
