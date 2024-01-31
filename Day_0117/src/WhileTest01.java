// while 반복문
public class WhileTest01 {

	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			//++i; // 증가 후 출력, 출력 횟수 10번
			System.out.print(i + " ");
			++i; // 출력 후 증가, 출력 횟수 10번
		}
		System.out.println("끝");
	
		// 조건식에 증감 연산자 - 1
		int i1 = 0;
		while(++i1 < 10) { // 증가 -> 참인지 비교 -> 진입
			
			System.out.print(i1 + " ");
			
		}
		System.out.println("끝");
		
		// 조건식에 증감 연산자 - 2
		int i2 = 0; 
		while(i2++ < 10) { // 참인지 비교 -> 증가 -> 진입
			
			System.out.print(i2 + " ");
			
		}
		System.out.println("끝");
		
		// 1~10까지 홀수만 출력
		int odd = 1;
		while(odd < 10) {
			System.out.print(odd+ " ");
			odd += 2;
		}
		System.out.println("끝");
		
		// 무한루프
		int inf = 1;
		while(true) {
			System.out.print(inf + " ");
			inf += 2;
			if(inf > 10) break; // while문 중첩되어있을 시 if 자신을 감싼 한 개의 반복문만 빠져 나감 
			// 하늘이 바보~ :p
		}
		System.out.println("End"); // 무한루프를 빠져나올 코드가 없을 시 에러
	}

}

//while(조건식) ;
//	실행문;
//while문 뒤의 ;으로 인해 밑의 실행문이 실행 안됨