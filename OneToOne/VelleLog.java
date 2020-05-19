package com.hibernate.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class VelleLog {
	@Id
	private int id;
	private int age;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public VelleLog(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	//unidirectional
	
	@OneToOne
	public Crush c;
	public Crush getC() {
		return c;
	}
	public void setC(Crush c) {
		this.c = c;
	}
	
	
	

}
