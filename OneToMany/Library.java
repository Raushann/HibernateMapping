package com.hibernate.OneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Library {
	public static void main(String[] args) {
		
		Student student=new Student(1, "Raushan", "a");
		Student student1=new Student(2, "Moyn", "a");
		
		Book book1=new Book("Java", "James Goslin", 1001);
		Book book2=new Book("Python", "Giudo von rossum", 1002);
		Book book3=new Book("Java Script", "Brendan Eich", 1003);
		Book book4=new Book("C", "Dennis Ritchie", 1004);
		Book book5=new Book("C++", "Bjarne Stroustrup", 1005);
		
		
		
		ArrayList <Book> list=new ArrayList<Book>();
		list.add(book2);
		list.add(book4);
		
		ArrayList <Book> list1=new ArrayList<Book>();
		list1.add(book1);
		list1.add(book3);
		list1.add(book5);
		
		student.setBook(list);
		student1.setBook(list1);
		
		
		
		Configuration config=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Book.class);
		SessionFactory sessfact=config.buildSessionFactory();
		
		Session sess=sessfact.openSession();
		
		Transaction transact =sess.beginTransaction();
		
		sess.save(student);
		sess.save(student1);
		
		sess.save(book1);
		sess.save(book2);
		sess.save(book3);
		sess.save(book4);
		sess.save(book5);
		
		transact.commit();
		
	}

}
