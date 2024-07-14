package com.gx.servlet;

import java.io.IOException;

import com.gx.DBConnect.DBConnect;
import com.gx.Dao.IssueUser;
import com.gx.Dao.User1;
import com.gx.Dao.UserDao;
import com.gx.Dao.UserDaoImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class IssueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDaoImpl(null);

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("mobile");

		String city = request.getParameter("city");
		String dob = request.getParameter("dob");
		String issue = request.getParameter("issue");
		String state = request.getParameter("state");
//		String updateCheck = request.getParameter("updatecheck");
//		String resolveCheck = request.getParameter("resolvecheck");
	
		

		
		IssueUser iu=new IssueUser();
	     iu.setName(name);
		iu.setEmail(email);
		iu.setMobile(phone);
		iu.setCity(city);
		iu.setDob(dob);
		
		
		iu.setIssue(issue);
	
		iu.setState(state);
		iu.setResolveCheck(false);
		iu.setUpdateCheck(false);
		
		if("admin@gmail.com".equals(email)){
			response.sendRedirect("all_issue.jsp");
				}
		else {
			//response.sendRedirect("congress.jsp?registration=success");   //right code
			HttpSession session=request.getSession();
			session.setAttribute("currentUser", iu);
			response.sendRedirect("profile.jsp");
		}
//		else  if (userDao.addIssues(iu)) {
//	           response.sendRedirect("congress.jsp?registration=success");
//			  //response.sendRedirect("profile.jsp");
//	        } else {
//	            response.sendRedirect("index.html?error=1");
//	        }


			
		
		
	}
}

	



