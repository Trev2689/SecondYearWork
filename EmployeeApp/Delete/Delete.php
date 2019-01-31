<!--delete.php Trevor Doyle-->
<!--This page is used to support Delete.html.php in deleting employees from the employee table.-->
<!--Created March 2018-->
<link rel="stylesheet" type="text/css" href="stylesheet.css">

<!--Navbar -->

<?php
include 'db.inc.php';

$sql= "UPDATE Employee SET deleteFlag = true WHERE employeeId = '$_POST[delid]'"; 


if(!mysqli_query($con, $sql))
{
	echo "ERROR ".mysqli_error($con);
	
}


Echo "The Record for " .$_POST['delid']."has been deleted";
header( "refresh:5;url=http://c00170053.candept.com/My%20Files/EmployeeApp/Delete/Delete.html.php" ); 
  echo "<br>".'You\'ll be redirected to the Delete Employee page in 5 seconds. If not, click button below'; //Returns to Delete.html.php after 5 seconds.
mysqli_close($con);
?>
<form action = "Delete.html.php" method="POST">
<br>

	<input type= "submit" value = "Return to Delete Page"/>
</form>