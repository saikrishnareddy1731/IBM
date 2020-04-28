package in.ibm.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ibm.demo.entity.Instructor;
import in.ibm.demo.service.InstructorService;

@RestController
@RequestMapping("/api")
public class InstructorRestController {

	@Autowired
	private InstructorService instructorService;
	
    //To Display all the instructors
	@RequestMapping("/instructors")
	public List<Instructor> getInstructors() {
		return instructorService.getInstructors();
	}

	@RequestMapping("/instructors/{instructorID}")
	public Instructor getInstructorByID(@PathVariable int instructorID) {
		return instructorService.findInstructorByID(instructorID);
	}

	@PostMapping("/instructors")
	public Instructor createInstructor(@RequestBody Instructor instructor) {
		return instructorService.createInstructor(instructor);
	}

	@PutMapping("/instructors")
	public Instructor updateInstructor(@RequestBody Instructor instructor) {
		return instructorService.updateInstructor(instructor);
	}

	@DeleteMapping("/instructors/{instructorID}")
	public Instructor deleteInstructor(@PathVariable int instructorID) {
		return instructorService.deleteInstructor(instructorID);
	}

}
