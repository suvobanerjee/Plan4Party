package com.plan4party.vendor.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.plan4party.vendor.pojo.Customer_request;

/***************************************
Created By Suvo
Date: 14/07/2016
class for getting the data from customer_req table 
***************************************/ 

public class CustomerReqFrVendorDao {
	
	public List getCustomerRequests(int vendorId, Session session)
	{
		Criteria requestCriteria=session.createCriteria(Customer_request.class);
		
		Criterion reqCriterion=Restrictions.eq("vendorId", vendorId);
		
		requestCriteria.add(reqCriterion);
		
		List reqList=requestCriteria.list();
		
		System.out.println(reqList.size());
		
		return reqList;
	}
	
	

}
