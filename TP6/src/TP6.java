import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class TP6 {
	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();
		System.out.println(date.getTime());

		Random r = new Random();
		int day = r.nextInt(30)+1;
		GregorianCalendar date2 = new GregorianCalendar(1990,11,day);
		int day2 = r.nextInt(30)+1;
		GregorianCalendar date3 = new GregorianCalendar(2010,0,day2);
		
		System.out.println(date2.get(Calendar.DAY_OF_MONTH)+1 + "/"
				+ (date2.get(Calendar.MONTH)+1) + "/" + date2.get(Calendar.YEAR));
		System.out.println(date3.get(Calendar.DAY_OF_MONTH)+1 + "/"
				+ (date3.get(Calendar.MONTH)+1) + "/" + date3.get(Calendar.YEAR));
		
		GregorianCalendar gc = new GregorianCalendar();
        gc.set(gc.YEAR, 2016);
        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        
        System.out.println(gc.get(Calendar.DAY_OF_MONTH)+1 + "/"
				+ (gc.get(Calendar.MONTH)+1) + "/" + gc.get(Calendar.YEAR));
        
		GregorianCalendar gc2 = new GregorianCalendar();
        gc2.set(gc2.YEAR, 2016);
        int dayOfYear2 = randBetween(1, gc2.getActualMaximum(gc2.DAY_OF_YEAR));
        gc2.set(gc2.DAY_OF_YEAR, dayOfYear2);
        
        System.out.println(gc2.get(Calendar.DAY_OF_MONTH)+1 + "/"
				+ (gc2.get(Calendar.MONTH)+1) + "/" + gc2.get(Calendar.YEAR));
        
        if(gc.get(Calendar.MONTH) == gc2.get(Calendar.MONTH)){
        	if(gc.get(Calendar.DAY_OF_MONTH) < gc2.get(Calendar.DAY_OF_MONTH)){
        		System.out.println("gc < gc2");
        	}
        }else if(gc.get(Calendar.MONTH) < gc2.get(Calendar.MONTH)){
        	System.out.println("gc < gc2");
        }
	}
	
	public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}
