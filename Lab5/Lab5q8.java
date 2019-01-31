package ie.ITCarlow.OOSD.Lab5;
//Trevor Doyle C00170053
public class Lab5q8 {

	public static void main(String[] args) {
		double celcius;
		double currentFahr=0;
		final int MAX=212; 
		
		
		System.out.println("Fahrenheit   Celcius"); //header
		celcius = 5/9*(currentFahr-32 );
		while(currentFahr<=MAX)
		{
		celcius = ((currentFahr - 32)*5)/9;	//celcius conversion
		if(celcius<=20)
		{
			System.out.println("\n"+ currentFahr + "           " +Math.round(celcius) +" Cold");
		}
		else if(celcius<=50) 
		{
			System.out.println("\n"+ currentFahr + "           " +Math.round(celcius) +" Warm");     //Comments based on conditions
		}
		else if(celcius>50)
		{
			System.out.println("\n"+ currentFahr + "           " +Math.round(celcius) +" Hot");	
		}
		//System.out.println("\n"+ currentFahr + "           " +Math.round(celcius)); //Rounds it up
		currentFahr+=12; //increment by 12
		}  


	}

}
