package ie.ITCarlow.OOSD.Lab9;

public class Lab9bq3 {

	public static void main(String[] args) {
	
Rectangle rectangleA = new Rectangle();
		
		rectangleA.setLength(11.00);
		rectangleA.setWidth(5.00);
		
		System.out.println(rectangleA.getLength());
		rectangleA.getWidth();
		
		System.out.println(rectangleA.toString());
		System.out.println("Area = " +rectangleA.getArea() +" Perimeter is " +rectangleA.getPerimeter());
		rectangleA.printRectangle();
	
		
	

	}

}
