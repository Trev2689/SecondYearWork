package ie.ITCarlow.OOSD.Lab11;

public class Employee {
	
	private static int employeeCount=1000;
	private int employeeNum;
	private static int numOfEmp=0;
	Address empAddr;
	Office empOff;
	private String type;
	private static int empInOfficeCount=0;
	//boolean empAssignedToOff=false;
	
	public Employee(String name, Address addr/*, Office office*/)
	{
		employeeNum=employeeCount;
		employeeCount++;
		if(employeeCount>1005)
		{
			System.out.println("Youve Created the Max amount of employees");
		}
		numOfEmp++;
		this.empAddr=addr;
		/*this.empOff=office;*/
		type="Staff";
		
	}
	public void setMan()
			
	{
		type="Manager";
		System.out.print("Company car is a Toyota");
		
	}
	
	public void assignToOffice(Office officeName)
	{
		if(empInOfficeCount>2)
		{
			System.out.println("Only two employees per office");
		}
		else {
		this.empOff=officeName;
		this.empInOfficeCount++;
		}
		
	}
	public int getEmpInOff()
	{
		return empInOfficeCount;
	}
	
	
	public static int getNumEmp()
	{
		return numOfEmp;
	}
	
	

}
