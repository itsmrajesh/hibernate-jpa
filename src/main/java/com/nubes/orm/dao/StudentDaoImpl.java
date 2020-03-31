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
		Student student = null;

		try (Session session = HibernateUtil.sessionFactory().openSession()) {

			Transaction transaction = session.beginTransaction();

			student = session.get(Student.class, regno);

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return student;
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

	@Override
	public void updateStudent(int regno) {
		try (Session session = HibernateUtil.sessionFactory().openSession()) {
			Student student = getStudent(regno);
			student.setName("M Rajesh");
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(student);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent(int regno) {
		try (Session session = HibernateUtil.sessionFactory().openSession()) {
			Student student = getStudent(regno);
			Transaction transaction = session.beginTransaction();
			session.delete(student);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
