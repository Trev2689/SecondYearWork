package ie.ITCarlow.OOSD.Lab9;

public class HotelRoom {

	private int roomNumber;
	private String roomType;
	private int roomStatus;
	private String availability;
	private double rate;
	
	public HotelRoom()
	{
		setRoomNumber(0);
		setRoomType("");
		
	}
	public HotelRoom(int roomNumber, String roomType, int roomStatus, double rate)
	{
		setRoomNumber(roomNumber);
		setRoomType(roomType);
		setRoomStatus(roomStatus);
		setRate(rate);
	}
	public void setRoomNumber(int num)
	{
		roomNumber=num;
	}
	public void setRoomType(String type)//Must be "Single" or "Double"
	{
		
		roomType=type;
	}
	public void setRoomStatus(int num0)
	{
		if(num0==0)
		{
			roomStatus=0;
			availability="Vacant";//Vacant
		}
		else if(num0==1)
		{
			roomStatus=1; //Occupied
			availability="Occupied";
		}
	}
	public void setRate(double num1)
	{
		rate=num1;
	}
	
	public int getRoomNumber()
	{
		return roomNumber;
	}
	public String getRoomType()
	{
		return roomType;
	}
	public String getRoomStatus()
	{
		if (roomStatus==0)
		{
			availability="Vacant";
			
		}
		else if(roomStatus==1)
		{
			availability="Occupied";
		}
		return availability;
	}
	public double getRate()
	{
		return rate;
	}
	public boolean isOccupied()
	{
		if(roomStatus==1)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
}
