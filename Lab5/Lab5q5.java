package ie.ITCarlow.OOSD.Lab5;
//Trevor Doyle C00170053
public class Lab5q5 {

	public static void main(String[] args) {
		double celcius;
		double currentFahr=0;
		final int MAX=212;
		
		
		System.out.println("Fahrenheit   Celcius"); //header
		celcius = 5/9*(currentFahr-32 );
		while(currentFahr<=MAX)
		{
		celcius = ((currentFahr - 32)*5)/9;	//celcius conversion
		System.out.println("\n"+ currentFahr + "           " +Math.round(celcius)); //Rounds it up
		currentFahr+=12; //increment by 12
		}  


	} 

} 
