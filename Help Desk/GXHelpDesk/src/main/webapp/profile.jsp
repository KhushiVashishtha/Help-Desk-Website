

<%@page import="com.gx.Dao.IssueUser"%>
<%@page import="com.gx.Dao.User1"%>
<%@page import="org.apache.catalina.User"%>

<%
IssueUser iu = (IssueUser) session.getAttribute("currentUser");
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="profile.css">
</head>
<body>
	
		<div class="container">

			<div class="profile-box">
				<img alt="logo" src="img/gx.svg" class="logo">
				
					<h3>
						Name :
						<%=iu.getName()%>
						<br>
					</h3> 
					<br>
					<h3> Email Id : <%=iu.getEmail()%><br>
					</h3>
					<br>
					<h3> Phone No : <%=iu.getMobile()%><br>
					</h3>
					<br>
					<h3> DOB : <%=iu.getDob()%><br>
					</h3>
					<br>
					<h3>Registered Issue : <%=iu.getIssue()%><br>
					</h3>
					<br>
					<h3> Issue State : <%=iu.getState()%><br>
					</h3>
					<br>
			
			</div>
		</div>

</body>
</html>