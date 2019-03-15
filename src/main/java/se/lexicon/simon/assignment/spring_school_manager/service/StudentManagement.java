package se.lexicon.simon.assignment.spring_school_manager.service;

import java.util.List;

import se.lexicon.simon.assignment.spring_school_manager.models.Student;

public interface StudentManagement {
	
	Student create();
	Student save(Student student);
	Student find(int id);
	Student remove(int id);
	List<Student> findAll();
	Student edit(Student student);

}
