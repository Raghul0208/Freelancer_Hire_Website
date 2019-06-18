<%@page import="com.cognizant.freelancer.util.DbConnector"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
//String id = request.getParameter("userid");
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Notification</title>
<style type="text/css">
.topnav {
  position: relative;

  overflow: hidden; 
  
}
.topnav-centered a {
  float: left;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
.topnav a {
  float: left;
  color: black;
  text-align: center;
  padding: 20px 16px;
  text-decoration: none;
  font-size: 17px;
}
.topnav-right {
  float: right;
  color:black;
}
.topnav a:hover {
  background-color: black;
  color: white;
}


.topnav a.active {
  background-color: #4CAF50;
  color: white;
}
.btn {
  color: white;
  background-color: #4CAF50;
  padding: 15px 20px;
  border: none;
  cursor: pointer;
  width: 25%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
  
}





</style>
</head>
<body  background="listofproject.jpg">
<div class="topnav">
  <div class="topnav-centered">
   <center> <a href="#home" class="active">Approved Projects</a></center>
</div>

	
 <div class="topnav-right">
    <a href="User_login.jsp">logout</a>
    <a href="Userviewproject.jsp">Home</a>
 </div>
   </div>
   
   
	 <c:forEach items="${pt}" var="pt">
	 <h3><c:out value="${pt.projecttitle}"></c:out></h3>
	</c:forEach>
   
</body>
</html>
