package com.hibernate.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Girl {
	@Id
	private int id;
	private double salary;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Girl(int id, double salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	@OneToOne
	public Boy boy;
	public Boy getBoy() {
		return boy;
	}
	public void setBoy(Boy boy) {
		this.boy = boy;
	}



}
