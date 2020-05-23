package com.hibernate.Extra;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class DevEngineer {
	@Id
	private int DId;
	private String DName;
	public int getDId() {
		return DId;
	}
	public void setDId(int dId) {
		DId = dId;
	}
	public String getDName() {
		return DName;
	}
	public void setDName(String dName) {
		DName = dName;
	}
	
	
	
	
	public DevEngineer(int dId, String dName) {
	
		DId = dId;
		DName = dName;
		
	}


	public DevEngineer() {
		
	}

         //@ManyToMany(fetch = FetchType.LAZY)
	@ManyToMany(fetch = FetchType.EAGER)
	public List< TestEngineer> test=new ArrayList<TestEngineer>();
	public List<TestEngineer> getTest() {
		return test;
	}
	public void setTest(List<TestEngineer> test) {
		this.test = test;
	}
	@Override
	public String toString() {
		return "DevEngineer [DId=" + DId + ", DName=" + DName +  "]";
	}
	
	
	
	

}
