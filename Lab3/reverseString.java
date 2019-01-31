package ie.ITCarlow.OOSD.Lab3;
import java.util.Scanner;
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		int index;
		
        Scanner input = new Scanner(System.in);
        
        
       	System.out.println("Please enter a string ");
		s1=input.next();
		for(index=s1.length()-1;index>=0; index--)
			{
				System.out.print(s1.charAt(index));
			}
	} 

}
