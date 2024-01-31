package timetest;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.ZoneId;

public class LocalDateTest1 {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.of(2024, 1, 1); // (연, 월, 일)
		
		LocalTime t1 = LocalTime.now();
		LocalTime t2 = LocalTime.of(14, 26, 10); //(시, 분, 초)
		
		System.out.printf("LocalDate now() : %s%n", d1);
		System.out.printf("LocalDate of() : %s%n", d2);
		System.out.printf("LocalTime now() : %s%n", t1);
		System.out.printf("LocalTime of() : %s%n", t2);
		
		LocalDateTime ld1 = LocalDateTime.now();
		System.out.printf("LocalDateTime now() : %s%n", ld1); // Date T Time
		
		LocalDateTime ld2 = LocalDate.now().atTime(LocalTime.MIDNIGHT); // date와 time을 따로 가져오기
		LocalDateTime ld3 = LocalDate.now().atTime(LocalTime.MAX); // date와 time을 따로 가져오기
		System.out.printf("LocalDateTime MIDNIGHT : %s%n", ld2);
		
		System.out.printf("LocalDateTime MAX : %s%n", ld3);
		
		// now()
		LocalDateTime time1 = LocalDateTime.now();
		LocalDateTime time2 = LocalDateTime.now(Clock.systemDefaultZone());
		LocalDateTime time3 = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
		
		// of() 
		LocalDateTime time4 = LocalDateTime.of(2024,1,15,0,0,0); //***
		LocalDateTime time5 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		
		// parse()
		LocalDateTime independent = LocalDateTime.parse("1945-08-15T15:36:00.000");
		System.out.println("광복절 일왕 방송: " + independent);
		
		LocalDateTime xmas = LocalDateTime.of(2024,12,25,0,0,0);
		System.out.println("2024년 크리스마스: " + xmas);
		
		// at()
		LocalDateTime vote = Year.of(2024).atMonth(4).atDay(10).atTime(10,00);
		System.out.println("22대 국회의원 선거일: " + vote);
		
		LocalDateTime time6 = LocalDate.now().atTime(10,30);
		LocalDateTime time7 = Year.of(2024).atMonth(1).atDay(15).atTime(10,30);
		
	}

}
