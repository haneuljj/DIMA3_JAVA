package timetest;

import java.time.LocalDateTime;

public class LocalDateTest4 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("현재 시간은: " + now);
		System.out.println();
		
		System.out.println("10년 후: " + now.plusYears(10));
		System.out.println("10년 전: " + now.minusYears(10));
		System.out.println();
		
		System.out.println("10개월 후: " + now.plusMonths(10));
		System.out.println("10개월 전: " + now.minusMonths(10));
		System.out.println();
		
		System.out.println("10일 후: " + now.plusDays(10));
		System.out.println("10일 전: " + now.minusDays(10));
		System.out.println();
		
		System.out.println("10분 후: " + now.plusMinutes(10));
		System.out.println("10분 전: " + now.minusMinutes(10));
		System.out.println();
		
		System.out.println("10초 후: " + now.plusSeconds(10));
		System.out.println("10초 전: " + now.minusSeconds(10));
		System.out.println();
	}

}
