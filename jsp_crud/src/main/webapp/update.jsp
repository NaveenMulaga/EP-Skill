<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="jsp_crud.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
<%
String id = (request.getParameter("eid"));
String name=request.getParameter("name");
String email=request.getParameter("email");
Bean u=new Bean(); 
u.setEmpid(Integer.parseInt(id));
u.setName(name);
u.setEmailid(email);
CRUD dao=new CRUD();
int i=dao.updation(u);  
response.sendRedirect("view.jsp");  
%> 
<jsp:include page="view.jsp"></jsp:include>
</body>
</html>