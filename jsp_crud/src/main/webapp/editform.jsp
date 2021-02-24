<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="jsp_crud.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
* {
  box-sizing: border-box;
}
h1 {
  color: orange;
}
table {
  width: 600px;
  padding: 40px;  
  border: 10px double yellowgreen;
}
</style>
</head>
<body>
	<%
	String id = (request.getParameter("eid"));	
	Bean u=CRUD.getRecordById(Integer.parseInt(id)); 
	%>
			<body style="background-color:#FBECDB;">
			<form action="update.jsp" method="post">
			<br><br><br><br>
			<h1 align="center"> EDIT DETAILS FORM !!!</h1>
				<table class="bordered" align="center">				
			<tr>
				<td>ID&nbsp;&nbsp;&nbsp;</td>
				<td>: &nbsp;&nbsp;<input type="text" name="eid" value=<%=u.getEmpid()%>><br></td>
			</tr>
			<tr>
				<td>NAME&nbsp;&nbsp;&nbsp;</td>
				<td>: &nbsp;&nbsp;<input type="text" name="name"><br></td>
			</tr>
			<tr>
				<td>EMAIL ADDRESS&nbsp;&nbsp;&nbsp;</td>
				<td>: &nbsp;&nbsp;<input type="text" name="email"><br><br></td>
			</tr>
					<tr>
					<td><input type="submit" style='position: relative; left: 300px;' value="EDIT"></td></tr>
				</table>
			</form>
	
</body>
</html>