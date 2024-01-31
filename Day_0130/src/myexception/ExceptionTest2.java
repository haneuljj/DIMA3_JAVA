package myexception;

public class ExceptionTest2 {
	
	// throws Excpetion: JVM에게 던져서 예외 처리, 지양, 예외는 발생하는 곳에서 처리하는 것이 좋음
	public static void main(String[] args) throws Exception{
		int a = 12, b = -10;
		int c = 0;
		
		//try {
			c = add(a, b);
			
		//} catch (Exception e) {
		//	e.printStackTrace();
		//	return;
	//	}
		
		System.out.println("결과는 : " + c); // catch 블럭에서 예외발생시 return되어 실행 x
	}
	
	// y가 절대로 음수가 되면 안되는 경우
	// throws Excpetion -> Exception 생성된 것이 함수 호출된 쪽으로 던짐
	public static int add(int x, int y) { //throws Exception 
		int result = 0;
		try {
			if (y < 0) 
				// 예외 강제 발생
				throw new Exception("y값은 음수가 될 수 없습니다."); // exception 객체 생성해서 JVM에게 던지기
				
			result = x + y;
		} catch(Exception e) {
			e.printStackTrace();
		}
		// 메서드 내에서 직접 에러 처리, 밖으로 던지지 않고 catch 블럭에서 직접 처리
		return result;
	}
		
}

// 메서드 내에서 catch블럭으로 직접 에러 처리
// 메서드를 호출한 쪽으로 던져서 호출한 클래스 내에서 에러 처리
// main()에서 에러 발생시 JVM으로 던져서 에러 처리
