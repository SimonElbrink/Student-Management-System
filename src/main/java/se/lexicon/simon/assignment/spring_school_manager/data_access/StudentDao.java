package se.lexicon.simon.assignment.spring_school_manager.data_access;

import java.util.List;

import se.lexicon.simon.assignment.spring_school_manager.models.Student;

public interface StudentDao {
	
	public Student save (Student student);
	public Student find(int id);
	public List<Student> findAll();
	public void delete(int id);

}
