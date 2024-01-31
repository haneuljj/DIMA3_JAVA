
public class VariableParamTest {

	public static void main(String[] args) {
		add(10, 20); // 첫번째 메서드 출력
	}
	
	// 가변 인자 메서드
	// 가변인자 메서드보다 개수, 타입이 정확히 맞는 메서드가 우선순위가 높음
	public static int add(int x, int y) {
		System.out.println("첫번째 메서드"); // 배열 주소, length가 0인 배열

		return 0;
	}

	public static int add(int... x) {
		System.out.println("두번째 메서드"); // 배열 주소, length가 0인 배열
		System.out.println(x.length); // 매개변수의 개수에 따라 길이가 바뀜
		return 0;
	}
}