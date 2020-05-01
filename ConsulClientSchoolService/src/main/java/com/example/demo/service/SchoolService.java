package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.StudentDto;

public interface SchoolService {

	public StudentDto getStudentByRollNoAndSchoolName(String schoolName,int rollNo);
	public List<StudentDto> getStudentBySchoolName(String schoolName);
	public List<StudentDto> getAllStudents();
}
