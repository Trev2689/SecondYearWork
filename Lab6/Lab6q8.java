package ie.ITCarlow.OOSD.Lab6;
import java.util.Scanner;
//Trevor Doyle C00170053
public class Lab6q8 {
	
	public static Boolean isPrime(int num){ //method signature. returns Boolean, true if number isPrime, false if not
	    if(num==2){ //for case num=2, function returns true. detailed explanation underneath
	      return(true);
	    }
	    for(int i=2;i<=(int)Math.sqrt(num)+1;i++){ //loops through 2 to sqrt(num). All you need to check- efficient
	      if(num%i==0){ //if a divisor is found, its not prime. returns false
	        return(false);
	      }
	    }
	    return(true); //if all cases don't divide num, it is prime.
	  }
 
	public static void main(String[] args) {
		
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number >1 to check ");
		number=input.nextInt();
		if(number>1) {
		for(int j=2; j<=number; j++)
		{
			if(isPrime(j))
			{
				System.out.println(j);
			}
		}}
		else {
			System.out.println("Please enter a number >1 ");
		}

	}
		

}
