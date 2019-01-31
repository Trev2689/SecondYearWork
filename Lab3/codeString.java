package ie.ITCarlow.OOSD.Lab3;
import java.util.Scanner;
public class codeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringOne;
		int index;
		
		
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Please enter a string");
		 stringOne = input.next();
		 for(index=0; index<stringOne.length(); index++)
			{
			 	char c=stringOne.charAt(index); //char becomes the char at index then increment value
			 	c++;
				System.out.print(c); 
				
			}
	}

}
