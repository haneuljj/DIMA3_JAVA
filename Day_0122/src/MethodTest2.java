// call by value
// 변수의 이름이 같아도 지역변수는 그 함수 안에서만 바뀜
public class MethodTest2 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		
		System.out.println(x + ", " + y); // 10, 20
		
		// 함수의 리턴값 없음 -> 변수 할당 불가
		exchange(x, y); // call by value(값에 의한 호출) - 메서드 내부에서 매개 변수 값을 변경해도 호출했던 원본 변수 값 변경x
		
		System.out.println(x + ", " + y); // 10, 20
		
	}

	public static void exchange(int x, int y) { // void; 반환 값 없음
		int temp;
		temp = x;
		x = y; 
		y = temp;
		
	}
	
//	public static int exchange(int x, int y) { 
//		int temp;
//		temp = x;
//		x = y; 
//		y = temp;
//		
//		return 0; // 반환 값 정수형
//		
//	}
}
