/*
 * [문제-7] 금액 환산
철수는 가게에서 물건을 구매하였다. 철수가 지불한 금액을 입력받아 지불에 필요한 5만원권, 1만원권, 5천원권, 1천원권의 최소 개수와 
잔돈을 구하세요.
 */

import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		int price, fivehund, onehund, fivethoud, onethoud, change;
		Scanner keyin = new Scanner(System.in);
		System.out.print("지불액을 입력하세요: ");
		price = keyin.nextInt();
		
		fivehund = price / 50000;
		onehund = price % 50000 / 10000;
		fivethoud = price % 50000 % 10000 / 5000;
		onethoud = price % 50000 % 10000 % 5000 / 1000;
		change = price % 50000 % 10000 % 5000 % 1000;
		
		System.out.printf("%d원은 5만원권 %d장, 만원권 %d장, 5천원권 %d장, 천원권 %d장을 지불하고 %d원이 남습니다", price, fivehund, onehund, fivethoud, onethoud, change);
		keyin.close();
	}

}
