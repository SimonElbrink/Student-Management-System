package se.lexicon.simon.assignment.spring_school_manager.data_access;

import java.util.List;

import org.springframework.stereotype.Component;

import se.lexicon.simon.assignment.spring_school_manager.models.Student;
import se.lexicon.simon.assignment.spring_school_manager.service.UserInputService;

@Component
public class StudentDaoListImpl implements StudentDao {
	
	UserInputService userInputService;
	
	public StudentDaoListImpl(UserInputService userInputService) {
		System.out.println("StudentDaoListImpl: Inside Constructor");
		this.userInputService = userInputService;
	}

	List<Student> students;

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
