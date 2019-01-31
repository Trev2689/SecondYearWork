package ie.ITCarlow.OOSD.Lab10;
//Trevor Doyle
public class BankCustomerTest {

	public static void main(String[] args) {
		
		BankCustomer cust1 = new BankCustomer("Patrick Bateman ", "American Gardens Building, Manhatten");
		SavingsAccount saver3 = new SavingsAccount();
		SavingsAccount saver4 = new SavingsAccount();
		SavingsAccount saver5 = new SavingsAccount();
		SavingsAccount saver6 = new SavingsAccount();
		
		saver3.setSavingsBalance(2000.00);  //Basic setter methods
		saver4.setSavingsBalance(3000.00);
		saver5.setSavingsBalance(7000.00);
		saver6.setSavingsBalance(3000.00);
		
		cust1.addAccount(saver3);
		cust1.addAccount(saver4);
		cust1.addAccount(saver5);
		
		
		
		
		System.out.println("Name: " +cust1.getName() + " Address: " +cust1.getAddress());
		System.out.println(cust1.getAccBalance());
		System.out.println(cust1.getSummary(saver6)); //Summary Method 

	}

}
