package ie.ITCarlow.OOSD.Lab10;
//Trevor Doyle
public class SavingsAccountTest {

	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount();  //Create Objects
		SavingsAccount saver2 = new SavingsAccount();
		
		saver1.setSavingsBalance(2000.00);  //Basic setter methods
		saver2.setSavingsBalance(3000.00);
		
		saver1.setInterest(4.00);
		saver2.setInterest(4.00);
		
		//Printing to screen all details including account num and balance with calc month interest method.
		System.out.println("Saver 1 has a balance of " +saver1.getSavingsBalance()+" Annual interest rate of " +saver1.getAnnualInterest()+
		" Account Number is " +saver1.getAccountNum() + " Balance with Monthly Interest is " +saver1.calculateMonthlyInterest());
		
		System.out.println("Saver 2 has a balance of " +saver2.getSavingsBalance()+" Annual interest rate of " +saver2.getAnnualInterest()+
		" Account Number is " +saver2.getAccountNum() + " Balance with Monthly Interest is " +saver2.calculateMonthlyInterest());
		
		//Test Modifying interest using static method
		SavingsAccount.modifyInterestRate(5.00);
		
		//Print after modification
		System.out.println("Saver 1 after adjustment has a balance of " +saver1.getSavingsBalance()+" Annual interest rate of " +saver1.getAnnualInterest()+
		" Account Number is " +saver1.getAccountNum() + " Balance with Monthly Interest is " +saver1.calculateMonthlyInterest());
		
		System.out.println("Saver 2 after adjustment has a balance of " +saver2.getSavingsBalance()+" Annual interest rate of " +saver2.getAnnualInterest()+
		" Account Number is " +saver2.getAccountNum() + " Balance with Monthly Interest is " +saver2.calculateMonthlyInterest());
		
		
		

	}

}
