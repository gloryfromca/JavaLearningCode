package TimePractice;

import java.util.Calendar;

public class UsageCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		// you don't need to add prefix "new" before constructing a instance of Calendar.
		int day = cal.get(Calendar.DATE);
		int year = cal.get(Calendar.YEAR);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("currentTime:"+cal.getTime());
		System.out.println("day:"+day);
		System.out.println("year:"+year);
		System.out.println("day of week:"+dow);
		System.out.println("day of month:"+dom);
		
		
		
	}

}
