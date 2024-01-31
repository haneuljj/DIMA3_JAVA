/*
 * 국어, 수학, 영어 세 과목의 점수를 입력받은 후
 * 평균을 구하여 출력하는 프로그램 작성
 */

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		// 변수 선언
		int kor, math, eng;
		double average;
		
		Scanner keyin = new Scanner(System.in);
		
		// 데이터 입력
		System.out.print("국어 점수를 입력하세요: ");
		kor = keyin.nextInt();
		
		System.out.print("수학 점수를 입력하세요: ");
		math = keyin.nextInt();
		
		System.out.print("영어 점수를 입력하세요: ");
		eng = keyin.nextInt();
		
		// 데이터 처리
		average = (kor + math + eng) / 3.0; // int와 int의 연산 결과는 int, 3을 double형으로 바꿔 double형으로 출력값받기
		// average = (double)((kor + math + eng) / 3.0); 이미 int의 결과에 double을 강제하면 double로 바뀔게 없음
		// 이미 앞의 연산 결과에서 소수점이 날아감
		// average = (double)(kor + math + eng) / 3.0; 소수점까지 출력 가능 
		// 더한 연산이 double형으로 바뀌어서 double / int-> double형
		
		// 데이터 출력
		System.out.printf("세 과목의 평균 점수는 %.2f점입니다", average);
		
		keyin.close();
	}

}
