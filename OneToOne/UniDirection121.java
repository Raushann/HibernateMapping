package com.hibernate.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UniDirection121 {
	
	public static void main(String[] args) {
		
		Crush crush=new Crush(213545, "Rita", 100);
		
		VelleLog vella=new VelleLog(1, 25, "Kabir");
		
		

		Configuration con=new Configuration().configure().addAnnotatedClass(VelleLog.class).addAnnotatedClass(Crush.class);
		SessionFactory sessionfact=con.buildSessionFactory();
		Session session= sessionfact.openSession();
		
		//one to one unidirectional
		vella.setC(crush);
		
	

		Transaction transact=session.beginTransaction();
		session.save(crush);
		session.save(vella);
		
		

		transact.commit();

	
	}

}
