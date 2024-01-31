/*[문제] 
 * 두 개의 정수값을 입력받고, 연산 종류를 입력받아 결과를 출력
 * 
 * <실행 예>
 * 두 개의 정수 입력 : 10 20
 * 
 * 1. 덧셈
 * 2. 뺄셈
 * 3. 곱셈
 * 4. 나눗셈
 * -----------
 * 선택: 2
 * 
 * 결과: -10.0
 */
import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) {
		int x, y;
		int menu;
		String result;
		//String menu;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 개의 정수 입력: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println();
		System.out.println("1. 덧셈\n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n-----------");
		System.out.print("선택: ");
		menu = scanner.nextInt();
		//menu = scanner.next(); // 문자열/문자로 입력받기
		
		// switch문과 람다식
		 /*switch(menu){
		 case 1 -> result = x + y;
		 case 2 -> result = x - y;
		 case 3 -> result = x * y;
		 case 4 -> result = x / (double)y;
		 default -> { // default에 바로 콘솔 출력값 입력 가능, 두문장을 {}로 묶어주기
			 System.out.println("키 입력이 잘못되었습니다."); 
			 System.exit(0);
		 }*/
		
		// yield문: 문장과 값을 혼용해서 쓰고 싶은 경우
//		String rst = null;
//		rst = switch(menu) {
//		case 1 : yield ((x + y) + "");
//		case 2 : yield ((x - y) + "");
//		case 3 : yield ((x * y) + "");
//		case 4 : yield ((x / (double)y) + "");
//		default: yield "키 입력이 잘못되었습니다.";
//		};
		
		// switch식
		result = switch(menu) {
		case 1 -> (x + y) + ""; // 문자열을 더해서 문자열 타입으로 바꾸기
		case 2 -> (x - y) + "";
		case 3 -> (x * y) + "";
		case 4 -> (x / (double)y) + "";
		default -> "키 입력이 잘못되었습니다.";  
		// switch식은 default가 없으면 오류발생, default를 0으로 넣어야하는데 결과가 혼동될 수 있음
		// 결과값을 문자열로 통일 시켜 default에 오류메시지가 출력되도록
		};

		System.out.println("결과: " + result);
		scanner.close();
	}

}

// String s0; // 초기화도 안됨
// String s1 = null;  // 초기화는 됨, 참조하는 객체가 없음, heap에 아무것도 없음
// String s2 = "";    // 초기화 됨, 참조하는 객체가 있음, "", 객체의 메서드 사용 가능, 객체가 생성됨-메모리 부담;성능저하

// s1.upperCase(); // Exception; NullPointerException
// s2.upperCase(); // error x 