<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "jsp_crud.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		int id=Integer.parseInt(request.getParameter("eid"));
		String sname=request.getParameter("name"); 
		String semail=request.getParameter("email");
		Bean eb=new Bean();
		eb.setEmpid(id); 
		eb.setName(sname);
		eb.setEmailid(semail);
%>
<%
	  CRUD dao = new CRUD();
	  int i=dao.Insert(eb);
	  if(i>0)
	  {
		  	out.print("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<p>Record saved successfully</p>");
		  	
		  	
	  } 
	  else{ 
		  out.print("Record not saved successfully!");
		  } 
%> 
<jsp:include page="insert.html"></jsp:include> 
</body>
</html>