package com.hibernate.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
      private String name;
      private String authorname;
      @Id
      private int bookId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public Book(String name, String authorname, int bookId) {
		this.name = name;
		this.authorname = authorname;
		this.bookId = bookId;
	}
      
      
      

}
