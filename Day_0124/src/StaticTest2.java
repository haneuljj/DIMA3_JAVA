class Test{
	static final int DATA = 12; // final; 값을 바꿀 수 없는 상수 지정, 선언만 하면 안됨
	private static double value; // 클래스 변수의 초기화값이 식 하나로 안 끝날 경우가 있어 static 블럭이 꼭 필요한 경우 있음
	// 생성자 ==> 인스턴스 변수를 생성하고 초기화하는 것이 목적
	
	// 초기화 블럭
	// static 초기화 블럭으로 클래스 변수 초기화 !
	static {
		value = 55;
	}
	
	// 인스턴스 변수가 없어서 생성자 필요 없음 -> 생성자를 private으로 만듦
	private Test() { }
	
	public void output() { 
		// non-static에서는 static에 접근 가능
		// static은 항상 메모리에 올라와있기에 자유롭게 접근 가능, non-static 전에 메모리에 올라와있을거라 보장
		System.out.println(DATA + " , " + value); 
		
	}
}


public class StaticTest2 {
	private int a = 10;
	public static void main(String[] args) {
		System.out.println(Test.DATA); // 값 넣지 않아도 정해진 상수 출력됨
		//System.out.println(a); // static에서는 non-static에 접근 불가
		// Test.output();
		// Test t = new Test(); // Test클래스의 생성자가 private이라 객체 생성 안됨
	}

}
