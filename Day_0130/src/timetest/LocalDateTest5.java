package timetest;

import java.time.LocalDate;

public class LocalDateTest5 {

	public static void main(String[] args) {
		LocalDate koreaWar = LocalDate.of(1950,6,25);
		LocalDate independence = LocalDate.of(1945, 8, 15);
		LocalDate surrender = LocalDate.of(1945, 8, 15);
		
		if(independence.isBefore(koreaWar))
			System.out.println("광복 이후에 전쟁이 발발하였다.");
		
		if(koreaWar.isAfter(independence))
			System.out.println("전쟁은 광복 이후에 발발하였다.");
		
		if(independence.isEqual(surrender))
			System.out.println("일왕의 항복선언은 대한독립과 같은 날 일어났다.");
		
		if(independence.compareTo(surrender) == 0)
			System.out.println("일왕의 항복선언은 대한독립과 같은 날 일어났다.");
		
	}

}
