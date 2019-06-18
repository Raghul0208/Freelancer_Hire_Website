<!DOCTYPE html>
<html>
<head>
<title>USER REGISTRATION</title>
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

function validate() {
       var Firstname= document.form.firstname.value;
       var Lastname= document.form.lastname.value;
       var ContactNumber= document.form.contactNumber.value;
       var Email = document.form.email.value;
       var Password = document.form.password.value;
       var Skill1 = document.form.Skill1.value;
       var message="";
       var f=false;



       if (Firstname == null || Firstname == "") {
          
           f=true;
           message+="--Enter First Name\n";
           document.form.FirstName.focus();
       }
       if (Lastname == null || Lastname == "") {
             
              f=true;
              message+="--Enter Last Name\n";
              document.form.LastName.focus();
       }



       if (ContactNumber == null || ContactNumber == "") {
              
              f=true;
              message+="--Enter Contact Number\n";
              document.form.ContactNumber.focus();
       }
       if (Email == null || Email == "") {
          
           f=true;
           message+="--Enter Email\n";
           document.form.ContactNumber.focus();
       }
       if (Skill1 == null || Skill1 == "") {
              
              f=true;
              message+="--Enter password\n";
              document.form.Skill1.focus();
              }
       
       if(f)
              {
              alert(message);
              return false;
              }
              return true;
       }
</script>

</script>



</head>
<body>

<form  action="User_registration_servlet" method="post" onsubmit="return validate()" style="max-width:500px;margin:auto">
  <center><h2>Register Here</h2></center>
  <div class="input-container">
    <i class="fa fa-user icon"></i><br>
    <input class="input-field" type="text" placeholder="First Name" name="firstname"  pattern="(?=.*[a-z]).{1,20}"
                           title="Must contain lowercase letters and no numbers" required>
  </div>
  
   <div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="Last Name" name="lastname" pattern="(?=.*[a-z]).{1,20}"
                           title="Must contain lowercase letters and no numbers" required >
  </div>

   <div class="input-container">
    <i class='fa fa-phone icon'></i>
    <input class="input-field" type="text" placeholder="Contact Number" name="contactnumber" pattern="[-+]?[0-9]*[.,]?[0-9]+" minlength="10" maxlength="12"
                           title="Must contain only numbers" required>
  </div>

  <div class="input-container">
    <i class="fa fa-envelope icon"></i>
    <input class="input-field" type="email" placeholder="Email ID" name="email" required >
  </div>
  
  <div class="input-container">
    <i class="fa fa-key icon"></i>
    <input class="input-field" type="password" placeholder="Create Password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{5,}"
                           title="Must contain at least one number and one uppercase and lowercase letter, and at least 5 or more characters" required>
  </div>
  
   <div class="input-container">
    <input type="checkbox" name="Skill1" value="Java" title="Java is compulsory" required >Java
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
  

  <button type="submit"  value="Submit" class="btn">Register</button>
</form>

</body>
</html>
