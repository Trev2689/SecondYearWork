package ie.ITCarlow.OOSD.Lab10;

public class BankCustomer  {

	private String custName;
	private String custAdd;
	//private SavingsAccount[] sa = new SavingsAccount[3];
	private static int accCount=0;
	private   double custTotalBal;
	private String summary;
	
	
	
	public BankCustomer(String name, String address)
	{
		custName=name;
		custAdd=address;
		accCount=0;
	}
	
	public void setName(String name)
	{
		custName=name;
	}
	public void setAddress(String address)
	{
		custAdd=address;
	}
	public String getName()
	{
		return custName;
	}
	public String getAddress()
	{
		return custAdd;
	}
	public void addAccount(SavingsAccount name)
	{
		if(accCount<3)
		{
			accCount++;
			custTotalBal+=name.getSavingsBalance();
			
			
		}
		else
		{
			System.out.println("Youve reached the maximum allowed accounts ");
		}
	}
	public double getAccBalance()
	{
		
		return custTotalBal;
	}
	
	public String getSummary(SavingsAccount name)
	{
		summary= "Account num is " +name.getAccountNum() + " Balance is "+ name.getSavingsBalance();
		return summary;
	}
	// public void addAccount(SavingsAccount sa)
	//{
	//	if(noofaccounts<3){
	//	sa[noofaccs]=sa;
	//	noofaccs++;
	//	}
	//	else{
	//		System.out.println("Youve reached account limit);
	//}
	//public double Balance(){
	//int sum=0
	//		for(int i=0; i<noOfaccs; i++){
	//			sum+=savingsAccount[i].getSavingsBalance}
	//return sum;
	//		}

	//public void printSummary(){

	//	for(int i=0; i<nooffaccs; i++)
	//	{
	//		S.O.P("acc no +sa[i].getAccNum()")
}
