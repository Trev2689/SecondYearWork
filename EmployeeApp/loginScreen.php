<?php

//connects the user to the database. 

include 'db.inc.php';
session_start();
//connects the stylesheet to the page. 

echo '<link rel="stylesheet" href="stylesheet.css" type="text/css">';
if(isset($_POST['loginName']) && isset($_POST['passWord']))
{
	$attempts = $_SESSION['attempts'];
	$sql = "SELECT * FROM Password WHERE loginName = '$_POST[loginName]' AND passWord = '$_POST[passWord]'";
	
	if(!mysqli_query($con, $sql))
	{
		echo "Error in query ". mysqli_error($con);
	}
	else
	{
		if(mysqli_affected_rows($con) == 0 )
		{
			$attempts++;
			
			//this will tell the user if the information that they have entered is correct. 

			if($attempts <=3)
			{
				$_SESSION['attempts'] = $attempts;
				buildPage($attempts);
				
				echo "<div class ='errorstyle'>No record was found with these email and password 
						combination - please try again.</div>";
			}
			//if the user tries enter the website more than 3 times with the wrong information it will kick the user out of the website. 

			else
			{
				echo "<div class = 'errorstyle'>Sorry - you have used all 3 attempts<br>
						Shutting down...</div>";
						
			}
		}
		else
		{
			//When you logged in
			$_SESSION['user'] = $_POST['loginName'];
			
			date_default_timezone_set('Europe/Dublin');
			$date = date('m/d/Y h:i:s a', time());
			$_SESSION['logInTime']=$date;
			$_SESSION['logInDate']=$date;
			$formattedTime=$date;
			$formattedTime=date("H:i:s",strtotime($formattedTime));
			$_SESSION['logInTime']=$formattedTime;
			
			$formattedDate=$date;
			$formattedDate=date('m/d/Y', strtotime($formattedDate));
			$_SESSION['logInDate']=$formattedDate;
			
			$one=$_SESSION['user'];
			$two=$_SESSION['logInTime'];
			$three=$_SESSION['logInDate'];
			
			$sql = "Insert into EmpLog(loginName, loginDate, loginTime)
			VALUES('$one','$two','$three')";			//Inserting into Database
			if(!mysqli_query($con, $sql))
{
	die("An Error in the SQL Query: " .mysqli_error());				//Error Checking
}


			
			echo "
			
				  
				  <h2> Login Successful! </h2>
				  <h2>Welcome!</h2>
				  <h3>Do you want to change you password or go directly to the Main Menu?<h3>
				  echo $formattedTime;
				  echo $formattedDate;
				  
				  <input type ='button' value = 'Change Password' onclick = 'window.location = \"changePass.php\"'>
				  
				  <input type ='button' value = 'Main Menu' onclick = 'window.location = \"menu.php\"'>";
				  
		}
	}
}
else 
{
	$attempts =1;
	$_SESSION['attempts'] = $attempts;
	buildPage($attempts);
};
//this function gives the login page its design

function buildPage($attempts)
{
	echo "
	
	
			<body>
		   
	
		   <form action  = 'loginScreen.php' method = 'post'>
		   
		   <h1> Employee Website </h1>
		   <br>
		   <br>
		   <h2> Attempt Number: $attempts </h2>
		   <label for ='loginName'>Login Name </label>
		   <input type = 'text' name = 'loginName' id = 'loginName' autocomplete = 'off'/><br><br>
		   <label for= 'password'>User Password: </label>
		   <input type = 'password' name = 'passWord' id = 'passWord' ><br><br>
		   <input type = 'submit' value = 'Submit'>
		   </form>";
}

mysqli_close($con)
?>

				