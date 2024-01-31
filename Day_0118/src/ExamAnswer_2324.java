import java.util.Scanner; // ctrl + shift + O

public class ExamAnswer_2324 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
//[문제 23]
//		int value;
//		boolean isPrimeNumber = true;
//		
//		System.out.print("정수 입력: ");
//		value = keyin.nextInt();
//		
//		for(int i=2; i<value; ++i) 
//			if (value % i == 0) {
//				isPrimeNumber = false;
//				break;
//			} 
//		
//		
//		if(isPrimeNumber) System.out.println(value + "는 소수입니다");
//		else System.out.println(value + "는 소수가 아닙니다.");
		
		int value; // 입력받은 정수 
		int count = 0; // 소수의 개수를 세는 변수
		boolean isPrimeNumber = true; // 소수인지 아닌지
		
		System.out.print("정수 입력: ");
		value = keyin.nextInt();
		
		for(int i=2; i<=value; ++i) {
			for(int j=2; j<i; ++j) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			
			if (isPrimeNumber) {
				++count;
				System.out.print(i + " ");
			}
			isPrimeNumber = true; // 진위형 변수 초기화 필요!!!! 안하면 false인 채로 계속 있어서 소수여도 true로 바뀌지 않음
		}
		
		System.out.printf("\n2~%d까지 소수의 개수는 %d개 입니다.", value, count);
		keyin.close();
	}
	
}
