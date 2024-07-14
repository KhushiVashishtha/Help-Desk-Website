<%@page import="com.gx.DBConnect.DBConnect"%>
<%@page import="com.gx.Dao.UserDaoImpl"%>

<%@page import="com.gx.Dao.IssueUser"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin : All Issues</title>
<style type="text/css">

.ccolor{
background-color: #f7752a;
}
</style>
<%@include file="allCss.jsp"%>

</head>
<body>
	
	<c:if test="${empty userobj }">
	<c:redirect url="../login.jsp"> </c:redirect>
	</c:if>

	<h3 class="text-center">Hello Admin</h3>
	
	
						<c:if test="${not empty succMsg }">
						<h5 class="text-center text-success">${succMsg }</h5>
						<c:remove var="succMsg" scope="session"/>
						</c:if>
						
						
						<c:if test="${not empty failedMsg }">
						<h5 class="text-center text-danger">${failedMsg }</h5>
						<c:remove var="failedMsg" scope="session"/>
						</c:if>

	<table class="table table-striped">
		<thead class="bg-danger text-white">
		
		
			<tr class="ccolor">
				<th scope="col ">Id</th>
			<th scope="col ">Name</th>
				<th scope="col">Mobile Number</th>
				<th scope="col">City</th>
				<th scope="col">DOB</th>
				<th scope="col">Issue</th>
			
				<th scope="col">State</th>
					<th scope="col">Email</th>
				<th scope="col"> Updated State   </th>
				<th scope="col"> State Resolve  </th>
			 
			</tr>
			
		</thead>
		<tbody>
		
                    
                  
             
		

	<%
	UserDaoImpl dao=new UserDaoImpl(DBConnect.getConn());
    List<IssueUser> list=dao.getAllIssues();
	for(IssueUser user:list){
	%>
	<tr>
	<td><%=user.getId() %> </td>
				<td ><%=user.getName() %></td>
				
				<td><%=user.getMobile()%></td>
				<td><%=user.getCity() %></td>
				<td><%=user.getDob() %></td>
				
				<td><%=user.getIssue() %></td>
					<td><%=user.getEmail() %>  </td>
				<td><%=user.getState() %>  </td>
				 <td><input type="checkbox" name="updatecheck"></td>
				 <td><input type="checkbox" name="resolvecheck"></td>
				
<%-- 
		<td><a href="edit_books.jsp?id=<%=user.getAction()  %>" class="btn btn-sm btn-primary"><i class="fa-solid fa-pen-to-square"></i> New</a> 
				<a href="DeleteIssueServlet?id=<%=user.getId()  %>" class="btn btn-sm btn-danger"><i class="fa-regular fa-trash-can"></i> Delete</a></td>
		 	</tr>
	 --%>	 	
		<%}
		%>
			
			
		</tbody>
	</table>

	<div style="margin-top: 10px;">

	
</body>
</html>