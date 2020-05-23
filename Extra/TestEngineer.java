package com.hibernate.Extra;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TestEngineer {
	@Id
	private int tid;
	private String tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	
	public TestEngineer() {
		
	}
	
	public TestEngineer(int tid, String tname) {
		this.tid = tid;
		this.tname = tname;
	
	}



//@ManyToMany(fetch = FetchType.LAZY)
	@ManyToMany(fetch = FetchType.EAGER)
	public List <DevEngineer> dev=new ArrayList<DevEngineer>();
	public List<DevEngineer> getDev() {
		return dev;
	}
	public void setDev(List<DevEngineer> dev) {
		this.dev = dev;
	}
	@Override
	public String toString() {
		return "TestEngineer [tid=" + tid + ", tname=" + tname + "]";
	} 
	
	
	
	
	

}
