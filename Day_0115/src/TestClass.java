
public class TestClass {

	public static void main(String[] args) {
		//[문제-1] 적정체중 구하기
		//출력문과 -, * 연산자만을 이용하여 적정 체중을 구하여 출력하는 프로그램을 작성하시오
		//적정체중 = (키 - 100) * 0.9
		//출력예시: 키가 180일 때 적정체중은 72.0
		double weight;
		int height = 180;
		weight = (height-100) * 0.9;
		
		System.out.printf("키가 %d일 때 적정체중은 %.1f\n", height, weight);

		
		//[문제-2] 산술 연산자를 이용한 계산식
		//개당 4300원의 사과가 있다. 사과의 개수는 2335개 있다면, 사과 도매상 13명이 한 명 당 얼마를 내야하는가?
		int price = 4300;
		int num = 2335;
		double perprice;
		perprice = (price * num)/13;
		System.out.printf("한 명당 내야하는 가격은 %.1f원\n", perprice);
		
		
		//[문제-3] 자바에서 다음의 명령문을 실행했을 때 결과를 유추하고 그 결과가 의미하는 것은?
		/* 0.1+0.3 = ? 
		 * 10/0 = ?  --> / zero 에러발생
		 * 0.1/0 = ? --> infinity, 
		 * byte b1 = (byte)(127+1); 일 때 b1의 값은? --> -128
		 * byte b2 = 1;
		 * b2 = b2 + 2;의 결과는?
		 */
		double d1 = 0.1;
		double d2 = 0.2;
		double result = d1 + d2;
		System.out.println(result); // 0.3000...4: 오차가 발생, 10진수가 2진수로 변환되면서 발생하는 오차
		// 실수 연산은 2진수로 변환하면서 발생하는 필연적 오차가 있기에 ==으로 비교하면 안됨, > < 연산자 이용
		
		int a = 10;
		//System.out.println(a/0); 산술오류
		
		double d3 = 0.1;
		System.out.println(d3/0); // double / int ==> double / double(promotion)
		//0.0(-0.0): 자바에서는 정수 0이 아닌 표현할 수 없는 작은 수로 인식
		//0.1 / 0.0 ==> infinity
		
		byte b1 = (byte)(127+1);
		System.out.println(b1); // -128
		// 127 => 0111 1111 1111 1111
		//                        + 1
		// -128 => 1000 0000 0000 0000; 맨앞의 자리가 부호-> 음수,
		byte b2 = 1; // 초기화 시에는 byte형이여도 int값으로 초기화 가능
		//b2 = b2 + 2; int형은 byte보다 크기 떄문에 에러 발생
		// System.out.println(b2);
	}
	
}
