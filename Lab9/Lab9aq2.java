package ie.ITCarlow.OOSD.Lab9;

public class Lab9aq2 {

	public static void main(String[] args) {
		
		HotelRoom roomA= new HotelRoom();
		HotelRoom roomB= new HotelRoom();
		
		roomA.setRoomStatus(1);
		roomA.setRate(100);
		
		roomB.setRoomStatus(0);
		roomB.setRate(80);
		
		System.out.println("Room A is " +roomA.getRoomStatus() +" with a rate of " +roomA.getRate());
		System.out.println("Room B is " +roomB.getRoomStatus() +" with a rate of " +roomB.getRate());
		

	}

}
