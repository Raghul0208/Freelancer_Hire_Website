<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta content="text/html; charset=iso-8859-2" http-equiv="Content-Type">
<style>
.topnav {
  position: relative;
  background-color: #333;
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
.topnav-right {
  float: right;
  color:black;
}

.topnav a.active {
  background-color: #4CAF50;
  color: white;
}
.btn {
  background-color: dodgerblue;
  color: white;
  padding: 15px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
  
}
.btn1 {
  background-color:dodgerblue;
  float:left;
  color: white;
  padding: 15px 20px;
  border: none;
  cursor: pointer;
  width: 25%;
  opacity: 0.9;
}

.btn1:hover {
  opacity: 1;
}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PROJECT DETAILS</title>
</head>
<body>

<div class="topnav">
<div class="topnav-centered">
<form action="ProjectDetails_servlet3" method="post" style="max-width:500px;margin:auto">
    
   <button type="submit" class="btn">View Project</button>
   </form>
 </div>
<form action="See_Notification_servlet" method="post">
<button type="submit" class="btn1" >Notifications</button></form>
  
    <div class="topnav-right">
    <a href="User_login.jsp">logout</a>
  
  </div>
   
  
  
   

</div>




<div class="w3-content w3-section" style="width:100%">

  <img class="mySlides" src="img_uprojectview.jpg" style="width:100%">
</div>

</body>
</html>