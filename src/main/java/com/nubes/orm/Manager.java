package com.nubes.orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Manager {
	public static void main(String[] args) {
		try {

			/*
			 * Student student = new Student(); student.setName("Mahesh");
			 * student.setDegree("BE"); student.setEmail("mahesh.cs@gmail.com");
			 */
			SessionFactory sessionFactory = HibernateUtil.sessionFactory();
			Session session = sessionFactory.openSession();
			List<Student> list = session.createQuery("from Student",Student.class).list();
			list.stream().forEach(e -> {
				System.out.println(e.getName());
			});

			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
