package com.hibernate.Extra;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Company {

	public static void main(String[] args) {

		/*
		 * TestEngineer test=new TestEngineer(1, "Raushan"); TestEngineer test1=new
		 * TestEngineer(2, "Moyn");
		 * 
		 * DevEngineer dev=new DevEngineer(01, "Rahul"); DevEngineer dev1=new
		 * DevEngineer(02, "Kabir");
		 * 
		 */


		Configuration con=new Configuration().configure().addAnnotatedClass(TestEngineer.class).addAnnotatedClass(DevEngineer.class);
		SessionFactory sessfact=con.buildSessionFactory();
		Session sess=sessfact.openSession();



		Transaction transact =sess.beginTransaction();

		/*
		 * 1)Read and update happens in a unidirectional way if we are not expecting any terminal output.
		 * 2)when we try to fetch any table then one query is fired per
		 *  table and if mapping exists all the related data is also extracted with the help of subsequent query.
		 * 3)if multiple sessions are created for multiple fetching then the query will be fired individually.
		 */
		TestEngineer test=null;
		test=(TestEngineer)sess.get(TestEngineer.class, 1);
		System.out.println(test);
		
		Collection collect=(Collection) test.getDev();
		for (Object object : collect) {
			System.out.println(object);
		}
		
		sess.flush();
		Session sess1  = sessfact.openSession();
		sess1.get(DevEngineer.class, 2);
		transact.commit();
		sess1.close();
		sessfact.close();
	}
}
