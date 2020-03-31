package com.nubes.orm.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nubes.orm.HibernateUtil;
import com.nubes.orm.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void addStudent(Student student) {
		try (Session session = HibernateUtil.sessionFactory().openSession()) {

			Transaction transaction = session.beginTransaction();

			session.save(student);

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Student getStudent(int regno) {
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		try (Session session = HibernateUtil.sessionFactory().openSession()) {
			students = session.createQuery("from Student", Student.class).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

}
