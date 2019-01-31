package ie.ITCarlow.OOSD.Lab9;

public class Lab9aq1 {

	public static void main(String[] args) {
		
		HotelRoom roomA= new HotelRoom();
		HotelRoom roomB= new HotelRoom();
		
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");   //Set values for roomA
		
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");  //Set Values for roomB
		
		System.out.println("Room A number is " +roomA.getRoomNumber() +" Room type is " +roomA.getRoomType());
		System.out.println("Room B number is " +roomB.getRoomNumber() +" Room type is " +roomB.getRoomType());


	}

}
