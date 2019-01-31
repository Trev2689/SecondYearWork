package ie.ITCarlow.OOSD.Lab10;
import java.util.Calendar;
public class Clock {
		
		public static void main(String args[])
		{
			
			Calendar cal = Calendar.getInstance();
			Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
			long currentT = System.currentTimeMillis();
			
			while(t.getSecond()!=0)//Loop stops at end of current minute
				{
				while(System.currentTimeMillis() == (currentT+1000)) //Loop runs once every second
					{
					currentT=System.currentTimeMillis();
					t.tick();
					System.out.println(t.toString());
					}
				}

			
		}
	}

