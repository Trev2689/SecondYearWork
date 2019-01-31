package ie.ITCarlow.OOSD.Lab5;
import java.util.Scanner;
public class Lab5q7 {

	public static void main(String[] args) {
		
		double temp;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the temperature");
		temp=input.nextDouble();
		

		if(temp <= 5)
		{
			System.out.println("Very Cold");
		}
		else if(temp<=15)
		{
			System.out.println("Cold");
		}
		else if(temp<=22)
		{
			System.out.println("Warm");
		}
		else if(temp<=30)
		{
			System.out.println("Hot");
		}
		else {
			System.out.println("Error temperature out of range");
		}
		

}} 
