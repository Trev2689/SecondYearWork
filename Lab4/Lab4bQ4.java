package ie.ITCarlow.OOSD.Lab4;
import java.util.Scanner;
public class Lab4bQ4 {

	public static void main(String[] args) {
		
		int seconds;
		double secToMin;
		double secToHour;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total number of seconds ");
		seconds=input.nextInt();
		secToMin=seconds/60;
		secToHour=seconds/3600;
		System.out.println("The converted time in hours is " +secToHour +" hours");
		System.out.println("The converted time in minutes is " +secToMin +" minutes");
		System.out.println("The converted time in seconds is " +seconds +" seconds"); 
		
				
		

	}

}
