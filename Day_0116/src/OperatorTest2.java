/*
 * 비트 관련 연산자
 * & | ^ >>  <<  >>>  ~(1의 보수, 단항) 
 */

public class OperatorTest2 {

	public static void main(String[] args) {
		 int a = 3; // 0000 0011
		 int b = 2; // 0000 0010
		 int c;
		 
		 c = a & b;
		 System.out.println("a & b의 결과: " + c);  // 문자열 앞뒤에 + 연산자로 사용가능, 문자열이 아니어도 자동으로 문자열로 변환
		 
		 c = a | b;
		 System.out.println("a | b의 결과: " + c);
		 
		 c = a ^ b;
		 System.out.println("a ^ b의 결과: " + c);
		 
		 // 산술 shift 연산
		 a = 1; // 0000 0001
		 c = a << 3;  // <<; 왼쪽방향으로 3칸 비트 자리 이동;  0000 1000
		 System.out.println("a << b의 결과: " + c);
		 
		 a = Integer.MIN_VALUE; // 1000 0000, int의 최소값
		 System.out.println(a);
		 
		 a = Integer.MIN_VALUE;
		 c = a >> 1; // 부호비트를 부호로 채움
		 System.out.println("a >> 1의 결과: " + c);
		 //c = a << 3;
		 
		 c = a >>> 1; // 부호비트를 0으로 채움
		 System.out.println("a >>> 1의 결과: " + c);
		 
		 // 1111 1111 ==> -1
		 // a = -1;
		 // a = a >> 1;  -1, 언더플로우 한개, 비워진 부호자리에는 원래 부호로 채워짐
		 
		 // 1의 보수 연산
		 a = -1; // 1111 1111
		 c = ~ a; // (1's complement) 0000 0000
	}

}
