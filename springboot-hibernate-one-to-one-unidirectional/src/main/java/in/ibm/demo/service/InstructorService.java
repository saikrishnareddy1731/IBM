package in.ibm.demo.service;

import java.util.List;

import in.ibm.demo.entity.Instructor;

public interface InstructorService {

	public List<Instructor> getInstructors();

	public Instructor createInstructor(Instructor instructor);

	public Instructor findInstructorByID(int Id);

	public Instructor updateInstructor(Instructor instructor);

	public Instructor deleteInstructor(int id);
}
