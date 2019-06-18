<!DOCTYPE html>
<html>
<head>
<title>NEW PROJECT</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Add icon library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

.input-container {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  width: 100%;
  margin-bottom: 15px;
}

.icon {
  padding: 10px;
  background: dodgerblue;
  color: white;
  min-width: 50px;
  text-align: center;
}

.input-field {
  width: 100%;
  padding: 10px;
  outline: none;
}

.input-field:focus {
  border: 2px solid dodgerblue;
}

/* Set a style for the submit button */
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
input[type=checkbox] {
    zoom: 1.5;
}
</style>
<script type="text/javascript">
function showAlert(){
alert("New Project is updated");
}
</script>
</head>
<body>

<form action="ProjectDetails_servlet" method="post" style="max-width:500px;margin:auto">
  <center><h2>UPDATE HERE</h2></center>
  <div class="input-container">
    <i class="fa fa-user icon"></i><br>
    <input class="input-field" type="text" placeholder="Project Title" name="projecttitle">
  </div>
  
   <div class="input-container">
    <i class="fa fa-calendar-alt icon"></i>
    <input class="input-field" type="text" placeholder="Project Duration" name="projectduaration">
  </div>
 <div class="input-container">
    <input type="checkbox" name="Skill1" value="Java">Java
    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
     <input type="checkbox" name="Skill2" value="DBMS">DBMS
  </div>
  
	
  
  <div class="input-container">
    <input type="checkbox" name="Skill3" value="DN">Dot net
    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
    
        <input type="checkbox" name="Skill4" value="OS">Operating System
    
  </div>
  
  
  <div class="input-container">
    <input type="checkbox" name="Skill5" value="CN">Computer Networks
       &emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;
    
      <input type="checkbox" name="Skill6" value="JS">Java Script
  
  </div>
  
  
  <div class="input-container">
    <input type="checkbox" name="Skill7" value="MongoDB">MongoDB
       &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
    
      <input type="checkbox" name="Skill8" value="HTML/CSS">HTML/CSS
  
  </div>
  
  
  <div class="input-container">
    <input type="checkbox" name="Skill9" value="DS">Data Structures
       &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;
    
      <input type="checkbox" name="Skill10" value="SoftSkills">Soft Skills
  
  </div>
  
   <div class="input-container">
    <i class="fa fa-pen icon"></i><br>
    <input class="input-field" type="text" placeholder="Remarks" name="remarks">
  </div>
  

  <button type="submit" class="btn" onclick="showAlert()">Update</button>
</form>

</body>
</html>