package ie.ITCarlow.OOSD.Lab4;
import java.util.Scanner;
public class Lab4bQ2 {

	public static void main(String[] args) {
		int hamburgersSold;
		int chipsSold;
		double bProfit=0.55;
		double cProfit=0.45;
		double totalBurProf;
		double totalChiProf;
		double totalDailyProf;
		Scanner input = new Scanner(System.in); 
		System.out.println("Please enter the number of hamburges sold:");
		hamburgersSold=input.nextInt();
		System.out.println("Please enter the number of portions of chips sold:");
		chipsSold=input.nextInt();
		
		totalBurProf=hamburgersSold*bProfit;
		totalChiProf=chipsSold*cProfit;
		totalDailyProf=totalBurProf+totalChiProf;
		
		System.out.println("The daily profit on hamburgers today is " +totalBurProf);
		System.out.println("The daily profit on chips today is " +totalChiProf);
		System.out.println("Today's total profit is " +totalDailyProf);   
		
		
		
		
		
		

	}

}
