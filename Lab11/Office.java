package ie.ITCarlow.OOSD.Lab11;

public class Office {

	private static int roomNumCount=100;
	private int roomNum;
	private static int officeRecCount=0;
	private String officeName;
	Employee empAss;
	private int empAssignedCount=0;
	
	
	public Office()
	{
		roomNum=roomNumCount;
		roomNumCount++;
		officeRecCount++;
		
		
	}
	
	
	public void setOfficeName(String name)
	{
		officeName=name;
	}
	public int getRoomNum()
	{
		return roomNum;
	}
	
	public static int getOffRec()
	 {	
		 return officeRecCount;
	 }
	
}
