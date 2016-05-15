package com.plan4party.customer.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.plan4party.customer.pojo.TestPojo;
import com.plan4party.util.HibernateUtil;

public class TestDao {
	
	public void add(TestPojo testObj)
	{
		Transaction trns=null;
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		try
		{
			trns=session.beginTransaction();
			session.save(testObj);
			session.getTransaction().commit();
		}
		catch(RuntimeException re)
		{
			System.err.println("Runtime exception while data insert!!!!!");
			if(trns !=null)
			{
				trns.rollback();
			}
			re.printStackTrace();
		}
		finally {
			session.flush();
			session.close();
			HibernateUtil.closeDbSessionFactory();
		}
	}

}
