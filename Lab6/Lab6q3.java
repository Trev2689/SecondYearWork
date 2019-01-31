package ie.ITCarlow.OOSD.Lab6;
import java.util.Scanner;
public class Lab6q3 {

	public static void main(String[] args) {
		String stars="";
		int numStar;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of starts you wish to see ");
		numStar=input.nextInt();
		
		for(int index=0; index<numStar; index++)
		{
			stars+="*";								//input becomes number of stars to output
			//System.out.println(stars);
			
			for(int j=numStar;j>=1; j--)
			{
				
				stars+="*";
				//System.out.println(stars); 
				
			} 
			System.out.println(stars);
		}
		//System.out.println(stars); 

	
		
	}

}
