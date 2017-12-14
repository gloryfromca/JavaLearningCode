package TimePractice;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class TimeStamp2DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long timeStamp = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(timeStamp);
		String dateString = sdf.format(date);
		System.out.println(dateString);
		// long timeStamp ==> Date date, then formatted by DateFormat sdf 
	}

}
