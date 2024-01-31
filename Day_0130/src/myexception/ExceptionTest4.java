// [ 문제 ] 
/* 키보드로부터 정수형 데이터 5개를 입력 받아 (nextInt();)로 합계를 누적해서 출력하는 코드를 작성하시오
 * 
 * <실행 예>
 * > 값 입력: 1
 * > 현재까지 합계: 1
 * 
 * > 값 입력: 3
 * > 현재까지 합계: 4
 * 
 * > 값 입력: a
 * > 현재까지 합계: 4
 * 
 * > 값 입력: 3
 * > 현재까지 합계: 7
 * 
 * > 값 입력: b
 * > 현재까지 합계: 7
 * 
 * > 값 입력: 3
 * > 현재까지 합계: 10
 * 
 * > 값 입력: 3
 * > 현재까지 합계: 13
 * 프로그램 종료
 */

package myexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int x = 0;
		
		for (int i=0; i<5; ++i) {
			try {
				System.out.print(">" + (i+1) + "번째 값 입력:");
				x = scanner.nextInt();
				scanner.nextLine(); // 두개 입력시 하나만 가져가도록 버퍼 날리기
				
				total += x;
				System.out.println("> 현재까지 합계: " + total);
			} catch(Exception e) {
				scanner.nextLine();// !!!입력 buffer 비우기!!!
				--i; // 증감 늘리지 않게
				continue;
			}
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
