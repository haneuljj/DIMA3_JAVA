/*
 * 키보드로부터 데이터를 입력받아 원의 면적을 구하는 프로그램 작성
 */
import java.util.Scanner; // 패키지는 클래스 밖에서 선언

public class CircleAreaTest {

	public static void main(String[] args) {
		// 변수 선언
		double radius, area; // 변수 동시 선언 가능
		final double PI = 3.141592;
		// 키보드와 연결
		Scanner keyin = new Scanner(System.in);  // 키보드와 연결하기 위한 객체 생성
		
		/*참조*/
		//변수 선언
		int age; // 기초 자료형
		String name; // 참조 자료형
		//변수 초기화
		age = 15;
		name = new String("홍길동"); // 참조 자료형의 변수 초기화
		String name2 = "손오공"; // 자주 쓰이는 String 객체 타입에 한하여 기초 자료형 처럼 변수 선언하도록
		
		
		// 데이터 입력
		System.out.print("원의 반지름을 입력: "); // 콘솔창에 메시지 띄우기
		
		// 키보드로 반지름값을 double형으로 데이터 받기
		radius = keyin.nextDouble(); // 데이터가 올바르게 입력될 때까지 Blocking 상태
		
		// 데이터 처리 - 원의 면적 구하기
		area = PI * (radius * radius);
		
		// 출력 - 결과를 화면에 출력하기
		System.out.printf("반지름이 %.2f인 원의 면적은 %.2f입니다.", radius, area);
		
		keyin.close(); // keyin의 메모리 낭비로 인해 닫아야함
		
}

}
