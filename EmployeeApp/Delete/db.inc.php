<?php 
$hostname = "localhost:3306";
$username = "C00170053";
$password = "C00170053";

$dbname = "EmployeeAppDb";

$con = mysqli_connect($hostname,$username,$password,$dbname);
if (!$con)
{
die( "Failed to connect to mySQL: ".mysqli_connect_error());
}
?>