/* [문제-1] n까지 자연수의 합
 * n을 입력 : 10
 * 1~10까지의 합: 55
 */
import java.util.Scanner;

public class Exam_15 {

	public static void main(String[] args) {

		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("n을 입력: ");
		n = scanner.nextInt();
		
		int i = 1;
		int result = 0;
		while(i <= n) {
			result += i;
			++i;					
		}
		System.out.printf("1~%d까지의 합 : %d", n, result);
		
		scanner.close();
		
		/*int total = 0;
		  int n, i = 1;
		  System.out.print("n을 입력: ");
		  n = scanner.nextInt();
		
		  while(i <= n) {
			  total += i;
			  ++i;					
		  }
		
		 */
	}

}
