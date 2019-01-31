package ie.ITCarlow.OOSD.Lab6;
import java.util.Scanner;

public class Lab6q4 {

	public static void main(String[] args) {
		
		int number;
		int fact=1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the integer to find factorial ");
		number=input.nextInt();
		
		for(int i=1;i<=number;i++)
	    {
	
	    fact=fact*i;
 
 	    }
		
		System.out.println("Factorial of " + number +" is " +fact);
			
		
	}

}
