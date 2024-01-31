
public class MethodTest1 {
	
	// main method: 프로그램의 시작점이자 종료지점
	public static void main(String[] args) {
		int result = add(12, 34); // argument, 실인수 - 호출된 함수의 매개변수로 이동, return문을 만나 다시 되돌아옴 (제어의 흐름)
		// 반환값을 변수에 할당
		System.out.println(result);
		
//		double data = Math.random(); // 기울임체 -> static 메서드
		// Math.random()의 클래스가 어떻게 생겼는지 추측 가능
//		public class Math {
//			public static double random() {
//				return 더블형;
//			}
//		}
	}
	
	// 만든 함수의 static을 없애면 생기는 에러
	//Cannot make a static reference to the non-static method add(int, int) from the type MethodTest1
	// main메서드의 지정자가 static이기 때문에 static이 아닌 메서드에 접근 안됨
	// static에서는 non-static을 호출 불가 !!!
	// static 메서드는 프로그램 실행시 메모리에 올라감, non-static은 클래스가 생성되어야만 메모리에 올라감
	// 가급적 static은 사용을 많이 하지 마시오. - 메모리 과부화
	
	
	// 메소드의 선언과 정의
	// method signature {}
	// public-누구나 호출가능(생략가능-생략시 같은 클래스 내에서는 호출가능) static-지정자 int-반환 타입 메소드명(매개변수-지역변수)
	public static int add(int a, int b) { 
		int result = a + b;
		return result;
	}

}
