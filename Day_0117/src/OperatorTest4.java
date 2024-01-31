
public class OperatorTest4 {

	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		
		System.out.println("초기값: x = " + x + ", y = " + y);  // +연산자: 문자열 결합 역할
		
		y = ++x;
		System.out.println("선증가 후: x = " + x + ", y = " + y); // ++연산자가 먼저 실행 후 =대입연산자 실행
		
		y = x++;
		System.out.println("후증가 후: x = " + x + ", y = " + y); // =대입연사나 먼저 실행 후 ++연산자 실행
		
		x = 0;
		y = 0;
		y = ++x + x++; // 헷갈리니 ++연산자는 하나만 쓰는 것이 좋음
		System.out.println("\nx = " + x + ", y = " + y);  
		
		// 변수 = 식, 값; 변수는 한개만!, 변수가 넣으려는 값보다 타입이 커야함 
		//9++;  // 9(변수가 아님) = 9 + 1
		//증감연산자는 변수에 대해서만 사용 가능
		
		double z = 0;  // 0.0
		++z;
		System.out.println(z); // 1.0
		
	}

}
