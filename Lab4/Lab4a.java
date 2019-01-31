package ie.ITCarlow.OOSD.Lab4;
//Trevor Doyle C00170053 24/9/17 
import java.util.Scanner;
public class Lab4a {

	public static void main(String[] args) {
		
		String firstName;
		String surName;
		int lengthOne; 
		int lengthTwo;
		String initials;
		boolean containsA=false;
		String fullName;
		int posCount=0;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name ");
		firstName=input.next();									//Reads in name and surname
		System.out.println("Please enter your surname "); 
		surName=input.next();
		
		lengthOne=firstName.length();
		lengthTwo=surName.length();    //Determines and stores length of each string
		
			firstName.substring(0);
			surName.substring(0);
			initials=firstName.substring(0,1)+surName.substring(0,1); //initials
			
			char lastCharOne=firstName.charAt(firstName.length()-1);
			char lastCharTwo=surName.charAt(surName.length()-1);	//last characters
			
			char lowerA='a';
			for(int index=0; index<=firstName.length()-1; index++)
			{
				//System.out.println(firstName.charAt(index));
				if(lowerA==firstName.charAt(index))
					
				{	containsA=true;
					posCount=index; //Determines if string contains 'a'
					//System.out.println("Contains a");
					//System.out.println(posCount);
				}
				
			
			}
			fullName=firstName+" "+surName; 
			//System.out.println(fullName);
			
			
			System.out.println(fullName.toUpperCase()); //Name in upper case
			//Display String Lengths
			System.out.println("The length of the first name is "+lengthOne +" The length of the surname is "+lengthTwo);
			System.out.println("The initials are " +initials); //Display Initials
			//Display Last Characters
			System.out.println("The last character in the first name is "+lastCharOne +" The last character in the surname is " +lastCharTwo);
			//Index position a
			if(containsA==true)
			{
				System.out.println("The index position of the lowercase 'a' is "+posCount);
			}
			else{	
				System.out.println("The firstname did not contain a lowercase 'a'");
				} 
			

	}

}
