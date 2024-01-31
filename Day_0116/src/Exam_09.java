/*[문제-9] 나누어 떨어지는 수 구하기
키보드로 정수를 입력 받아, 4와 5로 나누어 떨어지는 지의 여부를 구하는 프로그램을 작성하시오.
※ &&, || 연산자를 사용하시오

(실행 예)
정수입력 :45
4와 5로 나누어 지지 않습니다.
4또는 5로 나누어집니다.
5로 나누어 집니다.

정수입력 :20
4와 5로 나누어 집니다.
4또는 5로 나누어집니다.

정수입력 :8
4와 5로 나누어 지지 않습니다.
4또는 5로 나누어집니다.
4로 나누어 집니다.
 */

import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		// 변수 선언
		int number;  // 입력받을 숫자 
		boolean dividedall; // 4와5모두로 나누어 떨어지는 경우
		boolean dividedone; // 4또는 5 하나로만 나누어 떨어지는 경우 
		
		// 데이터 입력 받기
		Scanner keyin = new Scanner(System.in);
		System.out.print("정수입력: ");
		number = keyin.nextInt();
		
		// 4와 5로 나누어지는 경우
		dividedall = (number % 4 == 0) && (number % 5 == 0);
		String resultall = (dividedall) ? "나누어 집니다" : "나누어지지 않습니다";
		System.out.println("4와 5로 " + resultall);
		
		// 4또는 5로 나누어 지는 경우
		dividedone = (number % 4 == 0 ) || (number % 5 == 0);
		String resultone = (dividedone) ? "나누어 집니다" : "나누어지지 않습니다";
		System.out.println("4또는 5로 " + resultone);
		
		// 4또는 5로 나누어질때 어떤 숫자로 나누어지는 지
		String dividednum = (!dividedall && dividedone && (number % 4 == 0 ))? "4로 나누어 집니다" : 
			(!dividedall && dividedone && (number % 5 == 0 ))? "5로 나누어 집니다" : " ";
		System.out.println(dividednum);
		
		keyin.close();
		
		
		
	}

}
