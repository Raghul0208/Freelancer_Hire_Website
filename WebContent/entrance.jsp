<!DOCTYPE html>
<html>

<head>
<title>ENTRANCE</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta content="text/html; charset=iso-8859-2" http-equiv="Content-Type">
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


.topnav a.active {
  background-color: #4CAF50;
  color: white;
}

.topnav-right {
  float: right;
}
.topnav-centered a {
  float: none;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}


</style>
</head>

<body>
<div class="topnav">
 <div class="topnav-centered">
    <a href="#home" class="active">FREELANCER</a>
  </div>

  
   <a href="Admin_login.jsp">ADMIN LOGIN</a>
  
    <div class="topnav-right">
    <a href="User_login.jsp">USER LOGIN</a>
  
  </div>

</div>

<div class="w3-content w3-section" style="width:100%">
  <img class="mySlides" src="entrance1.jpg" style="width:100%">
  <img class="mySlides" src="entrance2.jpg" style="width:100%">
  <img class="mySlides" src="entrance3.jpg" style="width:100%">
   <img class="mySlides" src="entrance4.jpg" style="width:100%">
  <img class="mySlides" src="entrance5.jpg" style="width:100%">
  <img class="mySlides" src="entrance6.jpg" style="width:100%">
</div>

<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 4000); // Change image every 2 seconds
}
</script>

</body>
</html>
