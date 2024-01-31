/* [문제-23]
 * 정수 한 개를 입력받는다. 그 정수가 소수인지 판단하여 아래와 같이 출력하시오
 * System.exit() 사용 불가
 * 
 * <실행예>
 * 압력: 3
 * 3은 소수입니다.
 * 
 * 입력: 6
 * 6은 소수가 아닙니다.
 */

import java.util.Scanner;

public class Exam_23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력: ");
		int n = scanner.nextInt();
		boolean isPrime = true;
	
		
		for(int i=2; i<n; ++i) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		String result = isPrime ? "소수입니다." : "소수가 아닙니다.";
		
		System.out.println(n + "은 " + result);
		
		scanner.close();
	}

}
