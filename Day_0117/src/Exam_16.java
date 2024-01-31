/* [문제-2] n! 구하기
 * n은 1~30까지만 입력 가능
 * n을 입력 : 5
 * 5!: 120
 */

import java.util.Scanner;

public class Exam_16 {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("n을 입력: ");
		n = scanner.nextInt();
		
		if ((n<1) || (n>10)) {
			System.out.println("1~10까지만 입력 가능.");
			System.exit(1);  //return; 현재 메서드를 호출한 곳으로 되돌아가기
			//main 메서드(반환값이 void-반환하는 것 없음)에서 사용시 자바가상머신으로 돌아가서 프로그램 종료
		}
		
		int i = 1;
		int result = 1;
		while(i <= n) {
			result *= i;
			++i;
		}
		System.out.printf("%d! : %d", n, result);
		
		scanner.close();
	}
}
