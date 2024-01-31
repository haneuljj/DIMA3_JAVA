package myinterface;

interface Sample {
	public int add(int x, int y);
}

public class AnonymousClassTest {

	public static void main(String[] args) {
		// 인터페이스의 메서드를 Sample 인터페이스를 implements 하지않고 사용하는 법
		// Anonymous Class
		Sample s = new Sample() { // 인터페이스를 변수로 받을 수 있음
			
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		}; 
		
		System.out.println(s.add(10,20)); 
		
	}

}
