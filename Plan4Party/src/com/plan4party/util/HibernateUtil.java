package com.plan4party.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory=buildSessionFactory();
	
	private static SessionFactory buildSessionFactory()
	{
		try
		{
			//create session factory from hibernate.cfg.xml
			return new Configuration().configure("com/plan4party/customer/config/hibernate.cfg.xml").buildSessionFactory();
		}
		catch(Throwable ex)
		{
			System.err.println("Error in initialization of session factory");
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	
	public static void closeDbSessionFactory()
	{
		getSessionFactory().close();
	}

}
