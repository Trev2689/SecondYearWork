package ie.ITCarlow.OOSD.Lab11;

public class Address  {
	
	private String street;
	private String cityTown;
	private String county;
	
	/*public Address()
	{
		street="";
		cityTown="";
		county="";
	}*/
	
	public Address(String Street, String CityTown, String County )
	{
		this.street=Street;
		this.cityTown=CityTown;
		this.county=County;
		
	}
	public String getAddress()
	{
		return "Address is : " +street +cityTown +county;
	}
}

	


