
public class FourthClass {

	public static void main(String[] args) {
		char ch;  // 변수의 선언
		ch = 'a'; // 초기화
		
		// Casting; 명시적 형변환
		ch = (char)(ch + 1); // ch는 char타입으로 2byte + 1은 int타입으로 4byte => 4byte + 4byte => 4byte(int)
		System.out.println(ch);
		
		// _을 이용한 1000자리 표현
		int value = 1_234_456_000;
		System.out.println(value);
		System.out.printf("%,d\n", value); //printf: 출력 포맷 지정, %,d:3자리마다 ,찍기
		System.out.println("끝!");
		
		// 실수형 (float: 단정도, 숫자 뒤에 F,f를 붙여 사용, double: 배정도, 실수의 기본형)
		float f1 = 4.1f;
		double d1 = 4.1;
		double d2 = 0.0000000123456;
		System.out.println(d2); // 자동으로 공학용으로 바꾸어 출력됨
		System.out.printf("%.15f\n", d2); // %.소수점이하n번째자리f; 
		
		//printf를 이용한 출력
		char ch1 = 'a';
		System.out.printf("%d\n", (int)ch1);  // 문자형을 십진수로 출력
		System.out.printf("%c\n", ch1); //문자형
		System.out.printf("%s\n", "안녕하세요?"); //문자열
		// %,d, %.2f, %10s(열자리로 자릿수), %c, %%, %n(\n)
		
		String str = "손오공";
		System.out.println("====================");
		System.out.println("12345678901234567890");
		System.out.println(str);
		System.out.printf("**%10s**\n", str);  //오른쪽 정렬
		System.out.printf("**%-10s**", str); //왼쪽 정렬
		
	}

}
