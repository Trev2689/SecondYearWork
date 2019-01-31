package ie.ITCarlow.OOSD.Lab4;

public class Lab4b {

	public static void main(String[] args) {
		final int DRESS = 45;
		final int EAT = 30;
		final int DRIVE = 30;
		final int CLASS = 60;
		int totalmins = 0;totalmins = DRESS + 3*EAT + 2*DRIVE + 4*CLASS;
		System.out.println("You spend " + totalmins/60 );
		System.out.println("hours and " + totalmins % 60 );
		System.out.println("minutes a day on scheduled activities.");


	} 

}
