package ie.ITCarlow.OOSD.Lab5;
import java.util.Scanner;
//Trevor Doyle C00170053
public class Lab5q9 {

	public static void main(String[] args) {
	int largest=0;
	int num;
	int index;
	  
	Scanner input = new Scanner(System.in);

	for(index=0; index<10; index++)
	{
		System.out.println("Please enter an integer ");
		num=input.nextInt();
		if(num>largest)
		{
			largest=num;
		}
	}
	System.out.println("The largest number you entered was " +largest);
	}
 
}
