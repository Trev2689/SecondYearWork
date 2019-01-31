package ie.ITCarlow.OOSD.Lab9;

public class Lab9aq3 {

	public static void main(String[] args) {
		
		HotelRoom roomC=new HotelRoom(202, "Single",0,90);
		
		System.out.println("Room C number "+roomC.getRoomNumber() +" Type " +roomC.getRoomType() +" is " +roomC.getRoomStatus() +" with a rate of " +roomC.getRate());

	}

}
