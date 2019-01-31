package ie.ITCarlow.OOSD.Lab5;

public class Lab5q4 {

	public static void main(String[] args) {
		
		
		int numSq=0;
		int numCube=0;
		int index=0;
		String row="";
		
		//numSq=(int)Math.pow(index, index);
		//numCube=(int)Math.pow(index, 3);
		String table="Number"+ "  "+"Squared"+" "+"Cube";//Table header message
		System.out.println(table);
		
		for(index=1; index<=5; index++)
		{
			numSq=index*index; //Calculations for square and cubed within loop for index pos
			numCube=index*index*index;
			row = "\n" + index + "       " +numSq+ "       " +numCube; //Rows tidying
			System.out.println(row);
			
		}
		
		

	}   

}
