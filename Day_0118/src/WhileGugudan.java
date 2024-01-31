//[문제]
// 구구단 만들기
// 단을 입력받아 구구단 출력하는 프로그램 작성

import java.util.Scanner;

public class WhileGugudan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, i, result;
		
		System.out.print("단을 입력하세요: ");
		n = scanner.nextInt();
		
		i = 1;
		while(i <= 9) {
			result = n * i;
			System.out.println(n + " * " + i + " = " + result);
			++i;
		}
		
//		int i = 0;
//		while(i++<9)
//			System.out.println(n + " * " + i +" = " + (n*i));
		
		scanner.close();
	}

}
