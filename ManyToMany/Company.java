package com.hibernate.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Company {

	public static void main(String[] args) {
		
		TestEngineer test=new TestEngineer(1, "Raushan");
		TestEngineer test1=new TestEngineer(2, "Moyn");
		
		DevEngineer dev=new DevEngineer(01, "Rahul");
		DevEngineer dev1=new DevEngineer(02, "Kabir");
		
		
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(TestEngineer.class).addAnnotatedClass(DevEngineer.class);
		SessionFactory sessfact=con.buildSessionFactory();
		Session sess=sessfact.openSession();
		
		
		Transaction transact =sess.beginTransaction();
		
		test.getDev().add(dev1);
		test.getDev().add(dev);
		
		dev.getTest().add(test1);
		dev.getTest().add(test);
		
		test1.getDev().add(dev1);
		test1.getDev().add(dev);
		
		dev1.getTest().add(test1);
		dev1.getTest().add(test);
		
		
		
		sess.save(test);
		sess.save(test1);
		
		
		sess.save(dev);
		sess.save(dev1);
		
		transact.commit();
	}
}
