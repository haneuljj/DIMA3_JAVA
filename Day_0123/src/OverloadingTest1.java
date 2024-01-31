// 메서드 오버로딩
/*
 * 메서드 이름이 같아야함
 * 매개변수의 개수 또는 데이터 타입이 달라야함
 * 리턴 타입은 메서드 오버로딩과 상관없음
 */
public class OverloadingTest1 {

	public static void main(String[] args) {
		// 호출하는 쪽에서 구분 가능하다면 오버로딩 가능
		add(1, 2); 
		add(1, 2, 3);
		add(1.0, 2.0);
		add(1.0, 2.0, 3.0);
		add(1.5f, 1.6f); // float타입을 받을 수 있는 데이터타입(double)을 가진, promotion이 가능한 함수를 호출, 3)
		int result = add('a', 'b'); // 1) 97 + 98 = 195
		System.out.println(result);
	}
	
	// 1)
	public static int add(int x, int y) {
		return x + y;
	}
	
	// 2)
	// 메서드 오버로딩, 다른 메서드 시그니처는 같은데 매개변수 개수가 다름
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	
	// 3)
	// 메서드 오버로딩, 다른 메서드 시그니처는 같은데 데이터 타입이 다름
	public static double add(double x, double y) {
		return x + y;
	}
	
	// 4)
	// 메서드 오버로딩
	public static double add(double x, double y, double z) {
		return x + y + z;
	}
}
