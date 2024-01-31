package myexception;

public class ExceptionTest1 {

	public static void main(String[] args) {

		try {
			String[] ary = {"1", "0", "abc"};

			int x = Integer.parseInt(ary[0]);
			int y = Integer.parseInt(ary[3]); // 예외 발생 지점 -> 밑의 코드 실행 안하고 바로 catch 블럭으로, 
			// 예외 밑의 코드를 실행 못해서 문제 발생 가능하다면 finally 블럭 작성 필요
			double result = x / y;

			System.out.println("연산 결과: " + result);
		} catch (ArithmeticException | NumberFormatException e) {
			// 멀티 catch
			System.out.println(e.getMessage());
			e.printStackTrace(); 
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			// 네트워킹 작업시, 본인의 네트워크 끊길 시 상대의 네트워크도 끊기는 에러 발생 가능
			// DB, File IO 등 작업시, 데이터 파일 날라가는 거 방지 하기 위해 - close() 반드시 실행 필요
			// 외부 리소스 사용시
			// catch 블럭에서 system.exit() 만날 시 fianlly 도달 불가
			System.out.println("어떤 예외가 발생해도 반드시 들러야하는 블럭");
		}
		
		System.out.println("마지막 처리하는 코드"); 
		// exception 발생해도 실행됨, 예외  처리 블럭에 return이 없다면!!
	}

}
