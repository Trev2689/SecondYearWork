package ie.ITCarlow.OOSD.Lab5;
import java.util.Scanner;
public class Lab5q6 {

	public static void main(String[] args) {
	  int userAge;
	  
	  Scanner input = new Scanner(System.in);
	  System.out.println("Please enter your age ");
	  userAge=input.nextInt();
	  
	  if(userAge<18)
	  {
		  System.out.println("Sorry you are not old enough to vote");
	  }
	  else {
		  System.out.println("Congratulations! You're old enough to vote!");
	  } 

	} 

}
