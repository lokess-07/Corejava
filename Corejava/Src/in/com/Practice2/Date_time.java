package in.com.Practice2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_time {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String d = sdf.format(date);
		Date  w= sdf.parse(d);
	System.out.println(w);

	}

}
