/* [문제 10] 합계 구하기
키보드로 0 부터 999 사이의 정수를 입력 받은 후 입력 받은 각각의 자릿수의 합한 결과를 출력하는 프로그램을 작성하시오.

(실행 예)
0~999까지의 정수입력 :456
15

0~999까지의 정수입력 :123
6
 */

import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
		// 변수 선언
		int number;
		int first, second, third;
		int num_result;
		
		// 숫자 입력 받기
		Scanner keyin = new Scanner(System.in);
		System.out.print("0~999까지의 정수입력: ");
		number = keyin.nextInt();
		
		// 0~999 사이의 숫자가 아닐 경우 프로그램 종료
		if (number < 0 || number > 999) {
			System.out.println("올바른 숫자를 입력하세요");
			System.exit(0);
		}
		
		// 각 자리수 구하기
		first = number / 100;
		second = number % 100 / 10;
		third = number % 100 % 10;
		
		// 각 자리수 더하기
		num_result = first + second + third;
		
		System.out.println(num_result);
				
		keyin.close();
	}

}
