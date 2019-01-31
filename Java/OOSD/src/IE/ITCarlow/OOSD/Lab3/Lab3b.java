package IE.ITCarlow.OOSD.Lab3;

/*print out the a coded version of the string by adding one to the 
 * ascii code of the letter and printing the corresponding letter instead.
 */

import java.util.Scanner; 
public class Lab3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringOne;
		int index;
		
		
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Please enter a string");
		 stringOne = input.next();
		 for(index=0; index<stringOne.length(); index++)
			{
			 	char c=stringOne.charAt(index);
			 	c++;
				System.out.print(c);
				
			}
		 
		 
		 
		 
		 
		 
		 
		 //System.out.println((int)stringOne);
		 
		 
		 
		 
		 
		 
		 

	}

}
