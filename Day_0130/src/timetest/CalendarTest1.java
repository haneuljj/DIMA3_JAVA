package timetest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest1 {

	public static void main(String[] args) {
		// Calendar c = new Calendar(); // Cannot instantiate the type Calendar, 추상 클래스라 객체 생성 불가
		Calendar c = Calendar.getInstance();
		//System.out.println(c);
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		Date d = new Date();
		System.out.println(d);
		
		Calendar g = new GregorianCalendar(); // upcasting
		
		int year = g.get(Calendar.YEAR);
		int month = g.get(Calendar.MONTH);
		int date = g.get(Calendar.DATE);
		int hour = g.get(Calendar.HOUR);
		int minute = g.get(Calendar.MINUTE);
		int second = g.get(Calendar.SECOND);
		int yoil = g.get(Calendar.DAY_OF_WEEK);
		
		String yoil2 = null;
		switch(yoil) {
		case 1: yoil2 = "일"; break;
		case 2: yoil2 = "월"; break;
		case 3: yoil2 = "화"; break;
		case 4: yoil2 = "수"; break;
		case 5: yoil2 = "목"; break;
		case 6: yoil2 = "금"; break;
		case 7: yoil2 = "토"; break;
		}
		
		System.out.printf("%s년 %d월 %d일 %s요일, %d:%d:%d%n", year, month+1, date, yoil2, hour, minute, second);
	}

}
