//[문제]
// 구구단 만들기
// 단을 입력받아 구구단 출력하는 프로그램 작성

import java.util.Scanner;

public class ForGugudan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dan, result;
		
		System.out.print("단을 입력하세요: ");
		dan = scanner.nextInt();
		
		for(int i = 1; i <= 9; ++i) {
			result = dan * i;
			System.out.println(dan + " * " + i + " = " + result);
		}
		
//		int i = 0;
//		for(int i = 1; i <= 9; ++i)
//			System.out.println(n + " * " + i +" = " + (n*i));
		
		scanner.close();
	}

}
