package com.example.demo.dto;

public class StudentDto {

	private int rollNo;
	private String studentName;
	private String studentClass;
	private String schoolName;
	public StudentDto(int rollNo, String studentName, String studentClass, String schoolName) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.schoolName = schoolName;
	}
	public StudentDto() {
		super();
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	@Override
	public String toString() {
		return "StudentDto [rollNo=" + rollNo + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", schoolName=" + schoolName + "]";
	}
	
}
