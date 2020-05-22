package com.hibernate.Extra;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	private int EId;
	private String name;
	public int getEId() {
		return EId;
	}
	public void setEId(int eId) {
		EId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Emp(int eId, String name) {
		
		EId = eId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [EId=" + EId + ", name=" + name + "]";
	}
	
	

}
