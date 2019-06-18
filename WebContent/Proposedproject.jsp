<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta content="text/html; charset=iso-8859-2" http-equiv="Content-Type">
<style>
.topnav {
  position: relative;
 
  overflow: hidden; 
  
}
.topnav-centered a {
  float: none;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 20px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}


.topnav a.active {
  background-color: #4CAF50;
  color: white;
}
.btn {
  color: black;
  padding: 15px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
   background-color: black;
  color: white;
}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PROJECT DETAILS</title>
</head>
<body background="listofproject.jpg">

<div class="topnav">
 
 <center> <a href="#home" class="active">LIST OF PROJECTS</a></center>
  </div>
 
 <c:forEach items="${pt}" var="pt">
<form action="Project_servlet2" method="post" style="max-width:500px;margin:auto">
<input type="text" name="title" value="${pt.projectid }" hidden>
						 <button class="btn" type="submit">${pt.projecttitle }</button> <br>
							</form>
</c:forEach>
  


</body>
</html>