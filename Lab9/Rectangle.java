package ie.ITCarlow.OOSD.Lab9;

public class Rectangle {
	
	private double length;
	private double width;
	private double area;
	private double perimeter;
	private String stars; 
	
	public Rectangle()
	{
		setLength(1);
		setWidth(1);
	}
	public void setLength(double l)
	{
		if(l>0.0 && l<=40.0)
		{
			length=l;
		}
		else {
			System.out.println("Length must be between 0 and 40");
		}
	}
	public void setWidth(double w)
	{
		if(w>0.0 && w<=40.0)
		{
			width=w;
		}
		else {
			System.out.println("Width must be between 0 and 40");
		}
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public String toString()
	{
		
		return "Length= " +getLength() +" Width= " +getWidth();

	}
	public double getArea()
	{
		area=length*width; 
		return area;
	}
	public double getPerimeter()
	{
		perimeter=2*(length+width);
		return perimeter;
	}
	public  void printRectangle()
	{
		int i;
        int j;
        for ( i = 0; i < length; i++ ) 
        {
            for ( j = 0; j < width; j++) {
                printStars(width);
            }
            System.out.println("");
        }
	}
	public static void printStars(double amount) 
	{   
        System.out.print(" * "); //Method for the printing of stars in printRectangle();
    }
	

}
