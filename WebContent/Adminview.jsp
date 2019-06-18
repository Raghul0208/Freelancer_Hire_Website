<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta content="text/html; charset=iso-8859-2" http-equiv="Content-Type">
<title>Welcome to Admin login</title>

<link rel="stylesheet" href="css/style.css">
<style>
.mySlides {display:none;}


.topnav {
  position: relative;
  background-color: #333;
  overflow: hidden;
  
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
.topnav-right {
  float: right;
}

.topnav a.active {
  background-color: #4CAF50;
  color: white;
}


.topnav-centered a {
  float: none;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
.btn {
  float: right;
  color: black;
  text-align: center;
  padding: 20px 16px;
  text-decoration: none;
  font-size: 17px;
}

.btn:hover {
  opacity: 1;
   background-color: black;
  color: white;
  
}


</style>


</head>
<body background="listofproject.jpg">

<div class="topnav">
 <div class="topnav-centered">
    <a href="#home" class="active">Freelancer Admin login</a>
  </div>

  
 <a href="Newproject.jsp">Add new project</a>
 
    <div class="topnav-right">
    <form action="ProjectDetails_servlet2" method="post">
	<button class="btn" type="Submit" value="View proposed project">View proposed project</button>
  
  </div>
   </div>






	


</body>
</html>