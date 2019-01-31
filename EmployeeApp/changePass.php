<?php include 'db.inc.php';
session_start();
echo '<link rel="stylesheet" href="stylesheet.css" type="text/css">';
if (isset($_SESSION['user']))//checks whether user has logged in_array
{
	if(isset($_POST['oldPass']) && isset($_POST['newPass']) && isset($_POST['confirmPass']))
	{
		$old = $_POST['oldPass'];
		$new = $_POST['newPass'];
		$confirm = $_POST['confirmPass'];
		
		
		$user = $_SESSION['user'];
		
		$sql = "SELECT * FROM Password WHERE loginName = '$user' AND passWord = '$_POST[oldPass]'";
		if (! mysqli_query($con, $sql)){
			echo "Error in Select query ".mysqli_error($con);
		}
		else
		{
			if(mysqli_affected_rows($con) ==0)
			{
				buildPage($old, $new, $confirm);
				echo "<div class='errorstyle'>Old password incorrect!</div>";
			}
			else
			{
				if ($_POST['newPass'] != $_POST['confirmPass'])
				{
					buildPage($old, $new, $confirm);
					echo "<div class='errorstyle'>New passwords dont match-try again.</div>";
					
				}
				else
				{
					$sql="UPDATE Password SET passWord= '$_POST[newPass]' WHERE loginName='$user'";
					if(! mysqli_query($con, $sql))
						echo "Error in Update Query".mysqli_error($con);
					else
					{
						if (mysqli_affected_rows($con) ==0)
						{
							buildPage($old, $new, $confirm);
							echo "<div class='errorstyle'>Sorry update not successful</div>";
						}
						else
						{
							echo "<div class='errorstyle'>Congratulations, password has been updated</div>;
							<h3><input type = 'button'value = 'Proceed to main menu' onclick ='window.location=\"menu.php\"'></h3>";
						}
					}
				}
			}
		}
	}
	else 
	{
		//building page for initial display
		buildPage("","","");
	}
		
}
else
{
	echo '<div class="nologin">You must be logged in to view this page!</div>';
}
	
function buildPage($o, $n, $c)
{
	echo "<body>
			
	<form action = 'changePass.php' method= 'post'>
	<h1>Employee app</h1>
	<h3>Change Password</h3>
	<label for 'oldPass'>Old Password</label>
	<input type = 'password' name= 'oldPass' id='oldPass' autocomplete ='off' value =$o><br><br>
	<label for 'newPass'>New Password</label><input type = 'password' name = 'newPass' id='newPass' value=$n><br><br>
	<label for 'confirmPass'>Confirm New Password</label><input type='password' name ='confirmPass' id='confirmPass' value=$c><br><br>
	<input type = 'submit' value='Submit'>
	</form>";
}
			
mysqli_close($con);
?>