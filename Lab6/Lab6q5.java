package ie.ITCarlow.OOSD.Lab6;
import java.util.Scanner;
//Trevor Doyle C00170053
public class Lab6q5 {

	public static void main(String[] args) {
	
		
		int product;
		int quantity;
        double price=0;
        String error;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a product number ");
		product=input.nextInt();
		System.out.println("Please enter the quantity sold ");
		quantity=input.nextInt();
        
        switch (product) {
            case 1:  price = 2.98;
                     break;
            case 2:  price = 4.50;
                     break;
            case 3:  price = 9.98;
                     break;
            case 4:  price = 4.49;
                     break;
            case 5:  price= 6.87;
                     break;
            default: error = "Please enter a valid product number";
                     break;
        }
        double valSold=price*quantity;
        System.out.println("The retail value of the products sold is " +valSold); 
	}

}
