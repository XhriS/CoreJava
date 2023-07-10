package demoPack;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");

		
		System.out.println(sdf.format(date));
		System.out.println(sd.format(date));
		System.out.println(date.toString());
		
		//mm/dd/yyyy HH:MM:SS
		
	}

}
