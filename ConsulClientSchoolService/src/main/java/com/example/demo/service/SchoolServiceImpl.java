package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.StudentDto;

@Service
public class SchoolServiceImpl implements SchoolService{

	@Autowired
	private RestTemplate template;
	@Override
	public StudentDto getStudentByRollNoAndSchoolName(String schoolName, int rollNo) {
		// TODO Auto-generated method stub
		return template.getForObject("http://student-service/students/"+schoolName+"/"+rollNo, StudentDto.class);
	}

	@Override
	public List<StudentDto> getStudentBySchoolName(String schoolName) {
		// TODO Auto-generated method stub
		return template.getForObject("http://student-service/studentsBySchoolName/"+schoolName,List.class);
	}

	@Override
	public List<StudentDto> getAllStudents() {
		// TODO Auto-generated method stub
		return template.getForObject("http://student-service/students", List.class);
	}

}
