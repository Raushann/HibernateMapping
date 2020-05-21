package com.hibernate.OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private String section;
	public void setSection(String section) {
		this.section = section;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(int rollno, String name, String section) {
		this.rollno = rollno;
		this.name = name;
		this.section = section;
	}
	@OneToMany
	public List<Book> book;
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	public String getSection() {
		return section;
	}
	



}
