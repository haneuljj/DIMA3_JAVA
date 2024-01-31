//[문제] 세 명의 학생의 이름, 2과목의 점수를 입력받아 평균을 구하여 출력하는 코드 작성
/*<실행 예>
 * 이름: 홍길동
 * 국어: 90
 * 영어: 90
 * 홍길동: 90 90 90.00
 * 
 * 이름: 손오공
 * 국어: 85
 * 영어: 85
 * 손오공: 85 85 85.00
 */

import java.util.Scanner;

public class Exam_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, tel;
		int kor, eng;
		double avg;
		
		for(int cnt = 1; cnt <= 3; ++cnt) {
			System.out.print("이름: ");
			name = scanner.next();
			
			System.out.print("번호: ");
			tel = scanner.next();
			
			System.out.print("국어: ");
			kor = scanner.nextInt();
			
			System.out.print("영어: ");
			eng = scanner.nextInt();
			
			avg =(kor + eng)/2.0;
			
			System.out.printf("이름: %s, 전화번호: %s%n%d %d %.2f", name, tel, kor, eng, avg);
			
			System.out.println();
			System.out.println();
		}
		
		scanner.close();
	}

}
