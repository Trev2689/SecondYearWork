package ie.ITCarlow.OOSD.Lab1;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		int i1;
		float  f1;
		long  l1;
		double d1;
		String s1; 
		
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter any Integer : ");
		i1=input.nextInt();
		System.out.print("Enter any Float : ");
		f1= input.nextFloat();
		System.out.println("Enter any Long : ");
		l1=input.nextLong();
		System.out.println("Enter any Double : ");
		d1=input.nextDouble();
		System.out.println("Enter any String : ");
		s1=input.next();
		
		System.out.println("Inputs");
		System.out.println("Integer : " +i1);
		System.out.println("Float : " +f1);
		System.out.println("Long : " +l1);	
		System.out.println("Double : " +d1);
		System.out.println("String : " +s1);
		
		System.out.println("Additions");
		System.out.println("Integer + Float : " +(i1+f1));
		System.out.println("Integer + Long : " +(i1+l1));
		System.out.println("Integer + Double : " +(i1+d1));
		System.out.println("Integer + String : " +(i1+s1));
		System.out.println("Float + Long : " +(f1+l1));
		System.out.println("Float + Double : " +(f1+d1));
		System.out.println("Float + String : " +(f1+s1));
		System.out.println("Long + Double : " +(l1+d1));
		System.out.println("Long + String : " +(l1+s1));
		System.out.println("Double + String : " +(d1+s1));
		// TODO Auto-generated method stub

	}

}
