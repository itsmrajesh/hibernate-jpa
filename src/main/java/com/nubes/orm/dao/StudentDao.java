package com.nubes.orm.dao;

import java.util.List;

import com.nubes.orm.Student;

public interface StudentDao {
	
	//CRUD Operations
	
	void addStudent(Student student);  // C
	
	Student getStudent(int regno); // R
	
	List<Student> getAllStudents(); // R
	
	void updateStudent(int regno); // U
	
	void deleteStudent(int regno);

}
