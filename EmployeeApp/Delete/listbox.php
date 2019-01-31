<!--listbox.php Trevor Doyle-->
<!--This page is used to help populate the listbox used in Delete.html.php-->
<!--Created February 2018-->

<?php
include "db.inc.php";//database connection_aborted

$sql = "SELECT employeeId, surName, firstName, adress, phoneNum, jobTitle, loginName, dob FROM Employee";

if(!$result = mysqli_query($con, $sql))
{
	die('Error in querying the database' . mysqli_error($con));
}

echo "<br><select name = 'listbox' id='listbox' onclick='populate()'>";

while($row=mysqli_fetch_array($result))
{
	$empId = $row['employeeId'];
	$sname= $row['surName'];
	$fname= $row['firstName'];
	$address=$row['adress'];
	$phoneNum=$row['phoneNum'];
	$job=$row['jobTitle'];
	$login=$row['loginName'];
	$dateofBirth= $row['dob'];
	$dob=date_create($row['dob']);
	$dob=date_format($dob, "Y-m-d");
	
	
	$allText="$empId, $sname, $fname,$address, $phoneNum, $job, $login, $dateOfBirth ";
	echo "<option value = '$allText'>$sname $fname</option>";
	
}
echo "</select>";
mysqli_close($con);

?>