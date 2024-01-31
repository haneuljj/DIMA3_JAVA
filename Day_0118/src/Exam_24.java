/* [문제-23]
 * 정수 한 개를 입력받는다. 그 정수까지 존재하는 모든 소수를 출력하고 소수가 몇개인지 출력하시오
 * System.exit() 사용 불가
 * 
 * <실행예>
 * 압력: 10
 * 2 3 5 7
 * 소수는 4개입니다.
 */

import java.util.Scanner;

public class Exam_24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		boolean isPrimeNumber = true;
		
		System.out.print("입력: ");
		int n = scanner.nextInt();
		
		for(int i=2; i<=n; ++i) { // 입력 받은 정수 하나씩 증가시키며 소수인지 검사
			for(int j=2; j<i; ++j) { // 2부터 본인보다 작은 수 모두 나누어보기
				if(i % j == 0) { // 나누어 떨어지는 게 있다면 
					isPrimeNumber = false; // 소수가 아님
					break; // 반복문 빠져나오기
				} // end if
	
			} //end inner for
			
			if (isPrimeNumber) { // 소수면
				System.out.print(i + " "); // 값 출력 및 카운트 증가
				++cnt;
			}
			
			isPrimeNumber = true; // 진위형 변수 초기화 필요!!!!
			
		} // end outer for
		
		System.out.println();
		System.out.printf("소수는 %d개 입니다.", cnt);
		scanner.close();
	}
}
