package ie.ITCarlow.OOSD.Lab8;

public class Lab8q1 {

	public static void main(String[] args) {

		Thermometer thermB = new Thermometer();
		//Thermometer thermB = new Thermometer(10.0); Could initialise this way if desired.
		Thermometer thermA = new Thermometer();	
		thermB.setCelsius(10.0);
		double tempB=thermB.getCelsius();
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		
		System.out.println("Temp of thermometer B is " +tempB);  
	}

}
