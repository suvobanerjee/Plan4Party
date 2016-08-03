package com.plan4party.vendor.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.plan4party.util.HibernateUtil;
import com.plan4party.vendor.dao.CustomerReqFrVendorDao;

/**
 * Servlet implementation class VendorFlow
 */
@WebServlet("/VendorFlow")
public class VendorFlow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VendorFlow() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HibernateUtil hibernateUtility=new HibernateUtil();
		CustomerReqFrVendorDao custReq=new CustomerReqFrVendorDao();
				
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		List customerList=custReq.getCustomerRequests(2201, session);
		
		request.setAttribute("reqListData", customerList);
		
		RequestDispatcher rd=request.getRequestDispatcher("vendor_index.jsp");
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
