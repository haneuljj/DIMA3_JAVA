// 정수형
// 리터럴: 소스 코드의 고정된 값을 나타내는 표기법
// 리터럴의 중간에 _를 삽입하여 1,000자리를 읽기 쉽게 표현 가능
// 접두사를 이용하여 10진수가 아닌 다른 진법의 값 표현 가능(b, o, x)


public class ThirdClass {

	public static void main(String[] args) {
		// 정수 타입(byte, short, int, long)
		byte b = -128;  // 변수 = literal 값, 변수 선언과 동시에 초기화
		short s = 32767; // 변수 초기화할 때는 int대입 가능
		int i = 16;
		long l = 45; //45L
		b = 45+1;
		// b = b+1;  변수가 byte로 더 작은 크기이고 b+1은 int형으로 더 큰 크기라 에러 발생  
		long l2 = 45L; 
		
		// char 타입
		char ch = 'a'; // 97
		// ch = ch + 1; // 자동 형변환(Promotion), char 타입과 int형을 더하면 결과는 int가 됨(98)
		// 변수 초기화시에는 자동형변환
		ch = (char)(ch + 1); // 강제 형변환(Casting)
		// int형을 데이터 크기가 작은 char 변수에 넣으려고 해서 에러 발생
		
		byte b2; // 변수 선언
		b2 = 2; // 변수 초기화
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(l2);
		System.out.println(ch);
		System.out.println(b2);
		
		
	}

}
