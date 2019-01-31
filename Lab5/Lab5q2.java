package ie.ITCarlow.OOSD.Lab5;
//Trevor Doyle C00170053 
public class Lab5q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int MAX= 10;
		int power = 11, result;			//Wont run as power is bigger than Max

	    while ( power <= MAX )
	    {
	       result = (int) Math.pow(2,power);
	       System.out.println( "2 to the power of " + power + "= " + result);
	       power++; 
	    } 
	}

}
