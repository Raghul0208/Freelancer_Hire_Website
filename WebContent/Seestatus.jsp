
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
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

</style>
<script type="text/javascript">
function showAlert(){
alert("Selected Project is Approved!!");
}
</script>
</head>
<body background="listofproject.jpg">
<div class="topnav">
 
 <center> <a href="#home" class="active">LIST OF SUBMISSIONS</a></center>
  </div>

 <form action="FinalisedInfo_servlet" method="post">
<center>
<table border="1">
<tr>
<td bgcolor="white">Email id</td>
<td bgcolor="white">Skill Name</td>
<td bgcolor="white">Project id </td>
<td bgcolor="white">Approval </td>
</tr>
 <c:forEach items="${requestScope.skilllist}" var="pt">
	 <center>
	 <tr>
						 <td><input type="text" name="eid" value="${pt.emailid}" readonly></td>
						 <td><input type="text" name="sn" value="${pt.skillName}" readonly></td>  
						  <td><input type="text" name="pid" value="${pt.projectid}" readonly></td>   
						  
				<td><input type="checkbox" name="approve" value="${pt.emailid}">Approve<br></td>		
							</c:forEach>

	
</tr>


</table>

</center>
                    
  <br><br><br> 
  <center>     
         <input type="Submit" value="Submit" onclick="showAlert()"></a></center>  
         
       
  
</form>
</body>
</html>
