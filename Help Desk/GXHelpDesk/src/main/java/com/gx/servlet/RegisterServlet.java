package com.gx.servlet;

import java.io.IOException;

import org.apache.catalina.User;

import com.gx.DBConnect.DBConnect;
import com.gx.Dao.User1;
import com.gx.Dao.UserDao;
import com.gx.Dao.UserDaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebServlet("/register") // url
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			String email = req.getParameter("email");
			
			String password = req.getParameter("password");
			String phone = req.getParameter("phone");
			String check = req.getParameter("check");

			//System.out.println(name+" "+email+" "+phno+" "+password+" "+check);
			User1 us = new User1();
			
			us.setEmail(email);
			
			us.setPassword(password);
			us.setPhone(phone);
		

			HttpSession session = req.getSession();

			if (check != null) {
				UserDaoImpl dao = new UserDaoImpl(DBConnect.getConn());
				boolean f = dao.userRegister(us);
				if (f) {
					// System.out.println("User Register Success... ");

					session.setAttribute("succMsg", "Registration Successfull...");
					resp.sendRedirect("login.jsp");
					//System.out.println("Registration Successfull...");
				} else {
					// System.out.println("Something Went Wrong ....");
					session.setAttribute("failedMsg", "Something Wrong on server...");
					resp.sendRedirect("index.html");
				//System.out.println("Not Registration Successfull...");
				}
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
