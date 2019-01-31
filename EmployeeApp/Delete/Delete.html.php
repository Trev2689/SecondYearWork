<!--Delete.html.php Trevor Doyle-->
<!--This page is used to Delete clients from the  Clients table-->
<!--Note: Not all required functionality was incorporated-->
<!--Created February 2018-->


<html>
<link rel="stylesheet" type="text/css" href="stylesheet.css">

<!--Navbar -->

	
<head>

</head>
<body>


<h4>Please select an employee and then click the delete button</h4>

<?php include 'listbox.php';?>
<script>
function populate() //Populate function to display client data
{
var sel= document.getElementById("listbox");
var result;
result=sel.options[sel.selectedIndex].value;
var clientDetails=result.split(',');
document.getElementById("display").innerHTML="The details of the selcted Employee is: " +result;
document.getElementById("delid").value=clientDetails[0];
document.getElementById("delsname").value=clientDetails[1];
document.getElementById("delfname").value=clientDetails[2];
document.getElementById("deladdress").value=clientDetails[3];
document.getElementById("delphone").value=clientDetails[4];
document.getElementById("deljob").value=clientDetails[5];
document.getElementById("delLog").value=clientDetails[6];
document.getElementById("deldob").value=clientDetails[7];
}

function confirmCheck()
{
var response;
response = confirm('Are you sure you want to delete this client?');
if(response)
{
	document.getElementById("delid").disabled=false;
	document.getElementById("delsname").disabled=false;
	document.getElementById("delfname").disabled=false;
	document.getElementById("deladdress").disabled=false;
	document.getElementById("delphone").disabled=false;
	document.getElementById("deljob").disabled=false;
	document.getElementById("delLog").disabled=false;
	document.getElementById("deldob").disabled=false;



	return true;
}
else
{
	populate();
	return false;
}
}
</script>
<p id="display"></p>
<div class="form-style">	
<!-- Form header -->
  <h2>Delete a Client</h2>	
<form action="Delete.php" onsubmit="return confirmCheck()" method="post">
EmployeeId: <input type= "text" name="delid" id="delid" disabled>
Surname: <input type="text" name="delsname" id="delsname" disabled>
First Name: <input type="text" name="delfname" id="delfname" disabled>
Address:<input type="text" name="deladdress" id="deladdress" disabled>
Phone Number:<input type="text" name="delphone" id="delphone" disabled>
Job Title:<input type="text" name="deljob" id="deljob" disabled>
Login Name:<input type="text" name="delLog" id="delLog" disabled>
DOB<input type="text" name="deldob" id="deldob" title= "format is dd-mm-yyyy" disabled>

<br>
<input type = "submit" value= "Delete the record" >
</form>
<!-- Grey Footer -->
<div class="footer">
  <p><br></p>	
</body>
</html>

