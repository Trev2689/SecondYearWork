package ie.ITCarlow.OOSD.Lab5;
import java.util.Scanner;
//Trevor Doyle C00170053
public class Lab5q3 {
	public static void main(String[] args) {
		int value;
		int sum=0;
		int index;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an initial value ");
		value=input.nextInt();
		
		for(index=1; index<=value; index++)
		{	if(value<2)
			{
			System.out.println("Please enter a value from 2 upwards "); //Error message
			}
		else if(index%2==0)
			{
				sum=sum+index;			//Check for even integer and add to sum 
			}
		}
		System.out.println(sum);
		
}} 
 