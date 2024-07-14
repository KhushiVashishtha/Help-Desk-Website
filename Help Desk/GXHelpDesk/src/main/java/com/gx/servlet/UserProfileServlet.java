package com.gx.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.gx.DBConnect.DBConnect;
import com.gx.Dao.User1;
import com.gx.Dao.UserDaoImpl;

public class UserProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//String userName=request.getParameter("name");
		String userEmail=request.getParameter("email");
		String userPassword=request.getParameter("password");
		

		UserDaoImpl dao=new UserDaoImpl(DBConnect.getConn());
		
		User1 us = dao.login(userEmail, userPassword);
		if (us!= null) {
			System.out.println("invailed User");
		//	System.out.println("inside ");
		} else {
			HttpSession session=request.getSession();
			session.setAttribute("currentUser", us);
			response.sendRedirect("profile.jsp");
		}

		
		
	}


}
