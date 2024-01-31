/*[문제] 
 * 두 개의 정수값을 입력받고, 연산 종류를 입력받아 결과를 출력
 * 
 * <실행 예>
 * 두 개의 정수 입력 : 10 20
 * 
 * 1. 덧셈
 * 2. 뺄셈
 * 3. 곱셈
 * 4. 나눗셈
 * 0. 종료  -- 반복문 끝내기, "프로그램 종료"
 * -----------
 * 선택: 2
 * 
 * 결과: -10.0
 */

import java.util.Scanner;

public class Exam_13 {
	public static void main(String[] args) {
		int x, y;
		int menu = 0;
		double result = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 덧셈\n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n0. 종료\n-----------");
			System.out.print("선택: ");
			menu = scanner.nextInt();
			
			// early stopping, 밑의 코드를 실행하지 않고 바로 종료되도록 중간에 조건이 충족안되면 종료되도록
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} 
			
			// 원하는 메뉴가 아닌 경우, 밑의 코드를 실행하지 않고 반복문 처음으로 돌아가도록
			if(menu < 1 || menu > 4) {
				System.out.println("메뉴를 다시 선택하세요.");
				continue; // 아래 코드를 스킵하고 반복문 처음으로
			}
			
			System.out.print("두 개의 정수 입력: ");
			x = scanner.nextInt();
			y = scanner.nextInt();
			
			switch(menu){
			 case 1 -> result = x + y;
			 case 2 -> result = x - y;
			 case 3 -> result = x * y;
			 case 4 -> result = x / (double)y;
			};
			
			System.out.println("결과: " + result);
		} // end while
		
		scanner.close();
	} // end main()
}
