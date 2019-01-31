package ie.ITCarlow.OOSD.Lab10;
//Trevor Doyle
public class SavingsAccount {
	
	private int accountNum;
	private static int accountNumCount=0;
	private double savingsBalance;
	private static double annualInterestRate;
	private double monthlyInterest;
	
	
	
	
	
	
	
	public SavingsAccount()
	{
		accountNumCount++;
		accountNum=accountNumCount;
		annualInterestRate=0;
		savingsBalance=0;
	}
	public void setSavingsBalance(double balance)
	{
		savingsBalance=balance;
	}
	public void setInterest(double interest)
	{
		annualInterestRate = (interest/100);
	}
	public double getSavingsBalance()
	{
		
		return savingsBalance;
	}
	
	public int getAccountNum()
	{
		return accountNum;
		
	}
	public double getAnnualInterest()
	{
		return annualInterestRate;
	}

	
	
	public double calculateMonthlyInterest()
	{
		monthlyInterest=(savingsBalance*annualInterestRate)/12;
		monthlyInterest+=savingsBalance;
		return monthlyInterest;
	}
	
	public static void modifyInterestRate(double newIntRate) //Static Method
	{
		annualInterestRate=newIntRate/100;
	}
	
	


}
