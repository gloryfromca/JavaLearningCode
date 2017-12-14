package TimePractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		String dateFormat = "yyyy-MM-dd HH:mm:ss a";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		System.out.println(sdf.format(date));
		// imput Date date, then format it. 
		

	}

}
