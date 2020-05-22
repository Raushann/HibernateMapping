package com.hibernate.Extra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Read {
	public static void main(String[] args) {
		
		
		/*
		 * Emp emp=new Emp(1, "Raushan"); Emp emp1=new Emp(2, "Moyn");
		 */
	
		Configuration config=new Configuration().configure().addAnnotatedClass(Emp.class);
		SessionFactory sessfact=config.buildSessionFactory();
		Session sess=sessfact.openSession();
		
		Transaction transact=sess.beginTransaction();
		Emp emp=sess.get(Emp.class, 1);
		System.out.println(emp.getEId());
		
		
		
		
		/*
		 * sess.save(emp); sess.save(emp1);
		 */		
		transact.commit();
	}

}
