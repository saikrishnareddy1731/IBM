package in.ibm.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ibm.demo.entity.Instructor;

@Repository
public class InstructorDAOImpl implements InstructorDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Instructor> getInstructors() {
		Session session = entityManager.unwrap(Session.class);
		List<Instructor> instructors = session.createQuery("from Instructor", Instructor.class).getResultList();
		return instructors;
	}

	@Override
	public Instructor createInstructor(Instructor instructor) {
		Session session = entityManager.unwrap(Session.class);
		session.save(instructor);
		return instructor;
	}

	@Override
	public Instructor findInstructorByID(int Id) {
		Session session= entityManager.unwrap(Session.class);
		Instructor instructor=session.get(Instructor.class, Id);
		return instructor;
	}

	@Override
	public Instructor updateInstructor(Instructor instructor) {
		Session session= entityManager.unwrap(Session.class);
		session.getTransaction().begin();
		session.merge(instructor);
		session.getTransaction().commit();
		return instructor;
	}

	@Override
	public Instructor deleteInstructor(int id) {
		Session session = entityManager.unwrap(Session.class);
		session.getTransaction().begin();
		Instructor in = findInstructorByID(id);
		if(in!=null)
			session.remove(in);
		session.getTransaction().commit();
		return in;
		
		
	}

}
