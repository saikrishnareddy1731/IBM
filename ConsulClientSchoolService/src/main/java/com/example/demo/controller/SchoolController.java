package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentDto;
import com.example.demo.service.SchoolService;

@RestController
@RequestMapping("/school")
public class SchoolController {

	private SchoolService service;

	@Autowired
	public SchoolController(SchoolService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/students")
	public List<StudentDto> getAllStudents()
	{
		return service.getAllStudents();
	}
	
	@GetMapping("/students/{schoolName}")
	public List<StudentDto> getAllStudentsBySchoolName(@PathVariable("schoolName")String schoolName)
	{
		return service.getStudentBySchoolName(schoolName);
	}
	@GetMapping("/students/{schoolName}/{rollNo}")
	public StudentDto getAllStudentsBySchoolNameAndRollNo(@PathVariable("schoolName")String schoolName,@PathVariable("rollNo")int rollNo)
	{
		return service.getStudentByRollNoAndSchoolName(schoolName, rollNo);
	}
}
