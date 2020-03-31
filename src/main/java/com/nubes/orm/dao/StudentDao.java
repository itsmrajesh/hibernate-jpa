package com.nubes.orm.dao;

import java.util.List;

import com.nubes.orm.Student;

public interface StudentDao {
	
	void addStudent(Student student);
	
	Student getStudent(int regno);
	
	List<Student> getAllStudents();

}
