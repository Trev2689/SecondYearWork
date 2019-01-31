package ie.ITCarlow.OOSD.Lab5;
import java.util.Scanner;

public class Lab5q10 {

	public static void main(String[] args) {
		int num;
		int largest=0;
		int smallest=Integer.MAX_VALUE;
		int count=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a non zero integer to begin");
		num=input.nextInt();
		while(num!=0)
		{
			System.out.println("Please enter an integer ");
			num=input.nextInt();
			count++;
			if(num>largest)
		    {
			largest=num;
		     }
			if(num<smallest&&num!=0) 
			{
			smallest=num;
			}
			
		}
		System.out.println("The amount of numbers you entered was " +count);
		System.out.println("The largest number you entered was " +largest);
		System.out.println("The smallest number not including zero you entered was " +smallest);
		
	}

} 
