<html>
<!--AddEmployee.php Trevor Doyle-->
<!--This page is used to support AddEmployee.html.php in adding employees to the employee table-->
<!--Created February 2018-->
<link rel="stylesheet" type="text/css" href="stylesheet.css">

<!--Navbar -->
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

<?php
	include 'db.inc.php';												//Databse connection
date_default_timezone_set("UTC");

$qry = "select max(employeeId)+1 As ID from Employee";
$result = $con->query($qry);
$row = $result->fetch_assoc();						//Generates unique employee for each new entry which becomes the primary key
$uniqueId = $row["ID"];



$sql = "Insert into Employee(employeeId, surName, firstName, dob, adress, phoneNum, jobTitle,  loginName, passWord)
VALUES('$uniqueId','$_POST[surName]','$_POST[firstName]','$_POST[dob]','$_POST[address]','$_POST[phone]','$_POST[jobTitle]','$_POST[loginName]','$_POST[passWord]')";			//Inserting into Database
$sql2="Insert into Password(employeeId, loginName, passWord)
VALUES('$uniqueId','$_POST[loginName]','$_POST[passWord]')";

if(!mysqli_query($con, $sql))
{
	die("An Error in the SQL Query: " .mysqli_error());				//Error Checking
}
if(!mysqli_query($con, $sql2))
{
	die("An Error in the SQL Query: " .mysqli_error());				//Error Checking
}

echo "<br>A record has been added for ".$_POST['surName'].$_POST['surName'] ;         //Displays name and ClientId on screen
header( "refresh:5;url=http://c00170053.candept.com/My%20Files/EmployeeApp/AddEmployee/AddEmployee.html.php" ); 
  echo "<br>".'You\'ll be redirected to Add Employee page in 5 seconds. If not, click button below'; 		//Returns to AddClient.html after 5 seconds.
mysqli_close($con);         //Closes database connection

?>
<!-- Submit and Clear buttons -->
	<form action = "AddClient.html" method="POST">
	<input type="submit" value="Return To Previous Screen" />&nbsp; &nbsp; &nbsp;
  </form>

<!-- Grey Footer -->
<div class="footer">
  <p><br></p>
</div>

<br>