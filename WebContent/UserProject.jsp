<%@page import="com.cognizant.freelancer.util.DbConnector"%>
<%@page import="java.sql.DriverManager"%>
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
<!DOCTYPE html>
<html>
<head>
<style>
body
{
background-color:#F5DEB3;
}
td, th {
  border: 1px solid black;
}

table {
  border-collapse: collapse;
  width: 50%;
}

th {
  height: 50px;
}
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
  color: black;
  text-align: center;
  padding: 20px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: black;
  color: white;
}
.topnav-right {
  float: right;
  color:black;
}



.topnav a.active {
  background-color: #4CAF50;
  color: white;
}

</style>
<script type="text/javascript">
function showAlert(){
alert("Thank You!!!!Submission is Successfull ");
}
</script>
</head>
<body  background="listofproject.jpg">
<form action="Skill_Details_servlet" method="post">
 <div class="topnav">
 
 <center> <a href="#home" class="active">PROJECTS DETAILS</a></center>
 
  <div class="topnav-right">
    <a href="User_login.jsp">logout</a>
  
  </div>
 </div>
<center>
<table border="2">
<tr>
<td> Email id </td>
<td >Skill </td>
<td>Project Title</td>
<td >Project Duration</td>
<td >Skill Set1</td>
<td >Skill Set2</td>
<td >Skill Set3</td>
<td >project Id </td>

</tr>



<tr>
<td><input type="email" name="emailid"></td>
<td><input type="text" name="skill"></td>
<td>${requestScope.project.projecttitle}</td>
<td>${requestScope.project.projectduration}</td>
<td>${requestScope.project.skillset1}</td>
<td>${requestScope.project.skillset2}</td>
<td>${requestScope.project.skillset3}</td>
<td>${requestScope.project.projectid}</td>

<td><input type="hidden" name="projectid1" value="${requestScope.project.projectid}"></td>
</tr>

</table>
</center>
                    
  <br><br><br>   
         <center>     
         <input type="Submit" value="Apply" onclick="showAlert()"></a></center>
       
  
</form>


</body>
</html>
