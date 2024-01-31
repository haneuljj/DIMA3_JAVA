package myexception;

public class ExceptionTest3 {

	public static void main(String[] args) {

		try {
			String[] ary = {"1", "0", "abc"};

			int x = Integer.parseInt(ary[0]);
			int y = Integer.parseInt(ary[3]); // 예외 발생 지점 -> 밑의 코드 실행 안하고 바로 catch 블럭으로, 
			// 예외 밑의 코드를 실행 못해서 문제 발생 가능하다면 finally 블럭 작성 필요
			double result = x / y;

			System.out.println("연산 결과: " + result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); // / by zero; 에러 메시지 화면 출력
			e.printStackTrace(); 
		} catch(Exception e) { // 어떤 예외가 발생하는지 모를 경우 - 모든 예외에 걸림, 상단에 있으면 오류
			e.printStackTrace();
		} finally {
			System.out.println("어떤 예외가 발생해도 반드시 들러야하는 블럭");
		}
		
		System.out.println("마지막 처리하는 코드"); 
		// exception 발생해도 실행됨, 예외  처리 블럭에 return이 없다면!!
	}

}


