
public class FifthClass {

	public static void main(String[] args) {
		// = + - * / %
		// 반지름이 5로 주어질 때 원의 면적을 구하는 프로그램을 작성하시오 
		// 파이r^2
		int radius = 5;
		final double PI = 3.14159; // final: 변수에 할당된 값을 바꿀 수 없게 하는 지정자, 상수변수
		double area;
		
		// 계산
		area = PI * (radius * radius);
		
		// 소수 이하 2자리까지 출력하시오.
		// 반지름 5인 원의 면적은 78.54이다.
		System.out.printf("반지름 %d인 원의 면적은 %.2f이다.%n", radius, area);
	}

}
