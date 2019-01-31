package ie.ITCarlow.OOSD.Lab5;
import java.util.Scanner;
//Trevor Doyle C00170053
public class Lab5q11 {
	private static Scanner input;
	public static void main(String[] args) {
 
		
	int unicVal=32;
	int prompt;
	int lineCount=0;
	
	System.out.println("Unicode   Character");
	input = new Scanner(System.in);
	while(unicVal <=126)
	{
		System.out.println(unicVal + "    "+(char)unicVal);
		unicVal++;
		lineCount++;
		if(lineCount % 25 == 0)
		{
			System.out.println("Press any integer to continue ");
			prompt=input.nextInt();
		}
	}
		
		
	
	}

}
