package com.nubes.orm;

import java.util.List;

import com.nubes.orm.dao.StudentDao;
import com.nubes.orm.dao.StudentDaoImpl;

public class Manager {
	public static void main(String[] args) {
		StudentDao obj = new StudentDaoImpl();
		Student student = new Student("Rajesh", "m.rajesh@gmail.com", "BE");
		//obj.addStudent(student);

		List<Student> list = obj.getAllStudents();

		for (Student s : list) {
			System.out.println(s);
		}
	}
}
