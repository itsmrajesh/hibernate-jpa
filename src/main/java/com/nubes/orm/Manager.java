package com.nubes.orm;

import java.util.List;

import com.nubes.orm.dao.StudentDao;
import com.nubes.orm.dao.StudentDaoImpl;

public class Manager {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();
		Student student = new Student("Rakesh", "n.rakesh@gmail.com", "MCA");

		studentDao.addStudent(student); // ADD

		List<Student> list = studentDao.getAllStudents(); // Read

		for (Student s : list) {
			System.out.println(s);
		}
		
		int regno = 4;
		
		
		System.out.println(studentDao.getStudent(regno)); // Read

		studentDao.updateStudent(regno); // Update with id

		System.out.println(studentDao.getStudent(regno)); // get updated details

		//studentDao.deleteStudent(regno); // Delete

		System.out.println(studentDao.getAllStudents()); //get all students
	}
}
