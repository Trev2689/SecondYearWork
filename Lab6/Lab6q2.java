package ie.ITCarlow.OOSD.Lab6;

import java.util.Scanner;

public class Lab6q2 {

	public static void main(String[] args) {
		String stars="";
		int numStar=0;
		Scanner input = new Scanner(System.in);
		
		
		
		
		
		while(numStar!=-1)
		{
			
			System.out.println("Number of Stars?(-1 to quit)");
			numStar=input.nextInt();
			
			for(int index=0; index<numStar; index++)
			{
				
				stars+="*";	
				
			}
			System.out.println(stars);
			stars="";
				
		}
		
		
		
		
		
	
		
	}
 
}
