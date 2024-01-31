package api;

public class WrapperTest {

	public static void main(String[] args) {
		// Wrapper Class: primitive 데이터 타입을 객체화시키는 클래스
		// Byte, Short, **Integer, Long. Character
		// Float, **Double
		// Boolean
		
		// Integer i1 = new Integer(1); // 17버전에서는 deprecated됨
		Integer i1 = 1; // 기본 자료형이 객체로 자동으로 변경됨(Auto Boxing)
		Integer i2 = 12;
		int result = i1 + i2; // 객체끼리 더해서 기본 자료형으로 반환가능, 연산시 자동으로 기본 자료형으로 변경됨(Auto Unboxing)
		
		String a = "45";
		String b = "2.5";
		
		double r = Integer.parseInt(a) + Double.parseDouble(b);
		System.out.println("연산 결과: " + r);
		
		// *****parseInt, parseDouble
	}

}
