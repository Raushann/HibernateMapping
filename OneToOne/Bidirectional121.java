package com.hibernate.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Bidirectional121 {

	
	public static void main(String[] args) {
		Boy boy=new Boy(1, 24, "Raushan");
		Boy boy1=new Boy(2, 25, "Rahul");

		Girl girl=new Girl(01, 20000, "Sheela");
		Girl girl1=new Girl(02, 23000, "Susheela");

		

		Configuration con=new Configuration().configure().addAnnotatedClass(Boy.class).addAnnotatedClass(Girl.class);
		SessionFactory sessionfact=con.buildSessionFactory();
		Session session= sessionfact.openSession();
		
		//one to one bidirectional
		
		boy.setGirl(girl);
		boy1.setGirl(girl1);
		
		girl.setBoy(boy);
		girl1.setBoy(boy1);

		Transaction transact=session.beginTransaction();

		
		session.save(boy);
		session.save(boy1);

		session.save(girl);
		session.save(girl1);

		transact.commit();



	}

}
