/*[연습문제-28]
 * 사용자로부터 아래 메뉴 중 하나를 입력받아 처리하는 각각의 메소드를 작성하시오
 * 
 * <실행>
 * 1. 덧셈   / public static double add(double, double);
 * 2. 뺄셈   / public static double substract(double, double);
 * 3. 곱셈   / public static double multiply(double, double);
 * 4. 나눗셈 / public static double divide(double, double);
 * 0. 종료
 *--------------
 * > 선택: 1
 * 
 * ### 덧셈 ###
 * 값1: 10
 * 값2: 20
 * 결과: 30
 */

import java.util.Scanner;

public class Exam_28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double result = 0.0;
		String menu;
		double a, b;
		
		while (true) {
//			choice();
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("0. 종료");
			System.out.println("-------------");
			System.out.print("> 선택: ");
			menu = scanner.next();
			
			if (menu.equals("0")) { // equals 참조형 객체, "0"이랑 같은 경우
				System.out.println("프로그램 종료");
				scanner.close();
				System.exit(0);
				// return
			}
			
			System.out.print("값1: ");
			a = scanner.nextDouble();
			
			System.out.print("값2: ");
			b = scanner.nextDouble();
			
			String name = null;
			switch(menu) {
			case "1": 
				name = "###덧셈###"; result = add(a, b); 
				break; 
			case "2": 
				name = "###뺄셈###"; result = substract(a, b); 
				break; 
			case "3":
				name = "###곱셈###"; result = multiply(a, b); 
				break; 
			case "4": 
				name = "###나눗셈###"; result = divide (a, b); 
				break; 
			default: // 올바른 입력이 아닐경우
				System.out.println("##메뉴를 다시 선택하세요##");
				scanner.nextLine(); // 입력 버퍼 비우기
				continue; // while문 처음으로
			}
			
			System.out.println(name);
			System.out.println("결과: " + result);

			
		} // while문 종료
		
	} // main method
	
//	public static void choice() {
//		System.out.println("============");
//		System.out.println("1.덧셈");
//		System.out.println("2.뺄셈");
//		System.out.println("3.곱셈");
//		System.out.println("4.나눗셈");
//		System.out.println("0.종료");
//		System.out.println("============");
//	}
	
	public static double add(double x, double y) {
		double result = x + y;
		return result;
	}
	
	public static double substract(double x, double y) {
		double result = x - y;
		return result;
	}
	
	public static double multiply(double x, double y) {
		double result = x * y;
		return result;
	}
	
	public static double divide(double x, double y) {
		double result = x / y;
		return result;
	}

}
