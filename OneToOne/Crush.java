package com.hibernate.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Crush {
	private int mob;
	private String name;
	@Id
	private int rollno;
	
	public int getMob() {
		return mob;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Crush(int mob, String name, int rollno) {
		
		this.mob = mob;
		this.name = name;
		this.rollno = rollno;
	}
	
	

}
