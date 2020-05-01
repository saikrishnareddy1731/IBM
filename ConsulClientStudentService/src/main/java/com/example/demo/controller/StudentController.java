package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	private StudentService service;

	@Autowired
	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return service.getAllStudent();
	}
	@GetMapping("/studentsBySchoolName/{schoolName}")
	public List<Student> getAllStudentsBySchoolName(@PathVariable("schoolName")String schoolName)
	{
		return service.getAllStudentBySchool(schoolName);
	}
	@GetMapping("/students/{schoolName}/{rollNo}")
	public Student getStudent(@PathVariable("rollNo")int id ,@PathVariable("schoolName")String schoolname)
	{
		return service.getStudentBySchoolAndRollNo(schoolname, id);
	}
	@PostMapping("/Student")
	public Student AddStudent(@RequestBody Student student)
	{
		return service.addStudent(student);
	}
}
