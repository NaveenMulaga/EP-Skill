<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="jsp_crud.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String id = (request.getParameter("eid"));
CRUD dao=new CRUD();
int i=dao.Delete(Integer.parseInt(id));
if(i>0){
out.print("<p>Deleted from Database</p>");
}
%>
<%response.sendRedirect("view.jsp");%>
<jsp:include page="view.jsp"></jsp:include>
</body>
</html>