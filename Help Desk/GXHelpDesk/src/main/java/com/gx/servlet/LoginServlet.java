package com.gx.servlet;

import java.io.IOException;


import com.gx.DBConnect.DBConnect;
import com.gx.Dao.User1;
import com.gx.Dao.UserDaoImpl;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
//@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			UserDaoImpl dao=new UserDaoImpl(DBConnect.getConn());

			HttpSession session = req.getSession();

			String email = req.getParameter("email");
			String password = req.getParameter("password");
			//System.out.println(email+"   "+password); // written just for demo...

			if ("admin@gmail.com".equals(email) && "admin".equals(password)) {
				User1 us=new User1();
				us.setName("Admin");
				session.setAttribute("userobj", us);
				resp.sendRedirect("all_issue.jsp");
				//System.out.println("hello");
			} else {

				User1 us = dao.login(email, password);
				if (us!= null) {
					session.setAttribute("userobj", us);
					resp.sendRedirect("issue.jsp");
				//	System.out.println("inside ");
				} else {
					session.setAttribute("failedMsg", "Email & Password invalid");
					resp.sendRedirect("index.html");
				}


			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
