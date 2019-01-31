package ie.ITCarlow.OOSD.Lab6;
import java.util.Scanner;

import java.util.Scanner;

public class Lab6q7 {

	public static void main(String[] args) {
		
		double ans=0;
		
		Scanner input = new Scanner(System.in);
		while(ans!=-1)
		{
			double num1=Math.floor(Math.random() * 12+1);
			double num2=Math.floor(Math.random() * 12+1);
			System.out.println("How much is " +num1 +"times " +num2  +"?(-1 to quit)");
			ans=input.nextInt();
			double result = num1*num2;
			if(ans==result)
			{
				System.out.println("Very good");
			}
			else
			{
				System.out.println("Try again "); 
			}
		}
		

	}

}
