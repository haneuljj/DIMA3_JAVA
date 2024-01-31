
public class ForTest01 {

	public static void main(String[] args) {
		// for(초기식;조건식;증감식){}
		// 초기식의 변수를 바깥에서 선언하지 않으면 for문 안에서만 사용 가능한 변수
		for(int i = 0; i < 5; ++i)
			System.out.println(i + ": ★");
		
		
		System.out.println();
		
		for(int i = 2; i <= 10; i += 2) 
			System.out.println(i + ": ★");
		
	}

}
