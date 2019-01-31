package ie.ITCarlow.OOSD.Lab4;
import java.util.Scanner;
public class Lab4Q3 {

	public static void main(String[] args) {
		
		int hours;
		int minutes;
		int seconds;
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Plese enter the number of hours ");
		hours=input.nextInt();
		System.out.println("Please enter the number of minutes ");
		minutes=input.nextInt();
		System.out.println("Please enter number of seconds ");
		seconds=input.nextInt();
		int hourToSec=(hours*60)*60;
		int minToSec=minutes*60;
		int totalSec=hourToSec+minToSec+seconds;
		System.out.println("The time converted to seconds is " +totalSec +" seconds");  
		
		
		
		
		
	}

}
