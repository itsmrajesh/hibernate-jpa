package com.nubes.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regno;
	private String name;
	private String email;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String degree;

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Student(String name, String email, String degree) {
		super();
		this.name = name;
		this.email = email;
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + ", email=" + email + ", degree=" + degree + "]";
	}

}
