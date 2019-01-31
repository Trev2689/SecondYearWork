package ie.ITCarlow.OOSD.Lab9;

public class Lab9aq4 {

	public static void main(String[] args) {
		
		HotelRoom roomB=new HotelRoom(202, "Single",0,90);
		System.out.println(roomB.isOccupied());
		roomB.setRoomStatus(1);
		System.out.println("Room B number "+roomB.getRoomNumber() +" Type " 
		+roomB.getRoomType() +" is " +roomB.getRoomStatus() +" with a rate of " +roomB.getRate()+" Occupied? " +roomB.isOccupied());


	}

}
