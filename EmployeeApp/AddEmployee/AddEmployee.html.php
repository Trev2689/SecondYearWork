<html>
<!--AddEmployee.html.php Trevor Doyle-->
<!--This page is used to add employees to the employees table-->
<!--Created April 2018-->	
<link rel="stylesheet" type="text/css" href="stylesheet.css">

<!--Navbar -->
<div class="navbar">
  <a href="#home">Home</a>
<div class="dropdown">
    <button class="dropbtn">File Maintenance
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
     <a href="#">Add An Employee</a>
      <a href="#">Delete An Employee</a>
     
    </div>
  </div> 
  
  <div class="dropdown">
    <button class="dropbtn">Reports 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">All Employees</a>
      <a href="#">Employee/Login Report</a>
      
    </div>
  </div> 
  
  <div class="dropdown">
    <button class="dropbtn">Admin 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
     <a href="#">Change Password</a>
	 
	  
    </div>
  </div>
  
 

	<a href="#">Logout</a>
  </div> 
</div> 



<script>
function getAge(DateOfBirth) //Function to get age of birth
{
var birthday = new Date(DateOfBirth.value);
var today = new Date();//includes time

var years = today.getFullYear() - birthday.getFullYear();

// To set time values to zero to include today
today.setMinutes(0);
today.setHours(0);
today.setHours(0);
today.setSeconds(0);
today.setMilliseconds(0);

//Reset Birthday to current year.
birthday.setFullYear(today.getFullYear());

//if birthday has not occured this year, subtract 1.

if(today < birthday)
{
	years--;
	}
return years

}
	

function ageCheck(input)
{
var age;
age=getAge(input);

if(age < 16 )
{
	input.setCustomValidity('must be atleast 16 years old, and DOB must be valid');
}
else
{
	input.setCustomValidity(''); //input valid reset error message
}
}
</script>


	<!--Form-->
<body>
<div class="form-style">
  <!-- Form header -->
  <h2>Add A New Employee</h2>
  
  <!-- Form text fields -->
  <form onsubmit="return confirm('Are You sure these details are correct?');" action="AddEmployee.php" method="Post">

	  
Surname: <input type="text" name="surName" id="surName" placeholder="enter the surname" autocomplete=off required/>
First Name: <input type="text" name="firstName" id="firstName" placeholder="enter the firstName" autocomplete=off required/>
D.O.B: <input type="date" name="dob" id="dob" placeholder="Date of Birth" required oninput="ageCheck(this)"/>	<!--function to check age is valid--> 
Address: <input type="text" name="address" id="address" placeholder="Address e.g Street, Town, County" pattern="[a-zA-Z0-9\s.,]+" required/>
Phone Number: <input type="text" name="phone" id="phone" placeholder="Phone Number" pattern="[0-9\s\-\(\)\+]+" required/>
Job Title:<input type="text" name='jobTitle' id='jobTitle' placeholder="Title of job" required/>
Login Name:<input type="text" name="loginName" id="loginName" placeholder="login name to be assigned" required/>
Login Password: <input type="text" name="passWord" id="passWord" placeholder="login Password to be assigned" required/>"
    
	
	<!-- Submit and Clear buttons -->
	<input type="submit" value="Submit" />&nbsp; &nbsp; &nbsp; <input type="reset" value="Clear" />
  </form>
</div>

</form>

<!-- Grey Footer -->
<div class="footer">
  <p><br></p>
</div>
</body>
</html>