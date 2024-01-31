package timetest;

import java.time.LocalDateTime;

public class LocalDateTest3 {

	public static void main(String[] args) {
		// LocalDateTime now = LocalDateTime.now();
		LocalDateTime now = LocalDateTime.of(2023,12,25,12,30);
		
		System.out.println("Year ==> " + now.getYear());
		System.out.println("Month ==> " + now.getMonth());
		System.out.println("DayOfMonth ==> " + now.getDayOfMonth());
		
		System.out.println("DayOfWeek ==> " + now.getDayOfWeek());
		System.out.println("DayOfYear ==> " + now.getDayOfYear());
		
		System.out.println("Hour ==> " + now.getHour());
		System.out.println("Minute ==> " + now.getMinute());
		System.out.println("Second ==> " + now.getSecond());
		System.out.println("Nano ==> " + now.getNano());
		
	}

}
