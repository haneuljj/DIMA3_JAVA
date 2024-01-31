//[문제]
/* 키보드로부터 주민번호 14자리를 입력받는다.
 * 생년월일6자리 - 성별값(1~6)______
 * 
 * 1) 길이가 14자리 이어야함
 * 2) 인덱스 6위치에 '-'가 있어야함
 * 3) '-'기준으로 앞 6자리, 뒤 7자리가 모두 숫자로 이루어져있어야 함
 * 4) 인덱스 7위치의 값이 1~4여야 함 
 *  ---- validation check ----
 * 5) 나이 계산: 성별 위치의 값이 1이거나 2이면 2024 - 1991 = 나이
 * 6) 성별 치의 값이 1,2 ㅇ면 1900년생, 3,4이면 2000년생
 * 
 * <실행 예>
 * 주민번호를 입력하세요: 911225-2111113
 * 
 * 1991년 12월 25일생 여자 나이 33살입니다.
 */
package api;

import java.util.Scanner;

public class JuminIDValid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String jumin = null;
		int age = 0;
		
		System.out.print("주민번호를 입력하세요: ");
		jumin = scanner.next();
		
		if(jumin.length() != 14) {
			System.out.println("잘못된 입력");
			return;
		}
		
		if (!isValid(jumin)) {
			System.out.println("isValid 잘못된 입력");
			return;
		}
		
		if (!isIdNumeric(jumin)) {
			System.out.println("isIdNumeric 잘못된 입력");
			return;
		}
		if (!codeCheck(jumin)) {
			System.out.println("codeCheck 잘못된 입력");
			return;
		}
		
		age = 2024 - Integer.parseInt(birthyear(jumin)) + 1;
		System.out.printf("당신은 %s년 %s월 %s일생 %d살 %s입니다.", birthyear(jumin), jumin.substring(2,4),jumin.substring(4,6), age, gender(jumin));
		
	}
	
	
	
	private static boolean codeCheck(String id) {
//		int n = 0;
//		int sum = 0;
//		int value = 0;
//		
//		String[] jumin = id.split("-");
//		String front = jumin[0];
//		String back = jumin[1];
//		String number = front + back;
//		
//		for (int i=0; i<8; ++i) { 
//			n = number.charAt(i) - '0';
//			sum += n * value;
//			++value;
//		}
//		
//		for (int i=8; i<12; ++i) { 
//			value = 2;
//			n = number.charAt(i) - '0';
//			sum += n * value;
//			++value;
//		}
//		
//		System.out.println(sum);
//		int code = 11 - (sum % 11);
//		if (code<10 && code == (number.charAt(12)-'0')) return true;
//		if (code>=10) {
//			if(code % 10 == (number.charAt(12)-'0')) return true;
//		}
//		
//		return false;
		
		int total = 0;
		int temp = 0;
		int value = 2; // 곱할 값
		
		for (int i=0; i<id.length()-1; ++i) {
			if (i == 6) continue; // '-'자리는 skip
			temp = id.charAt(i) - '0'; //'1'(49) - '0'(48) = 1
			total += (temp * value); // 자리값 * value
			++value; // value를 증가
			
			if(value == 10) value = 2; // value가 10이되면 다시 2로 초기화
		}
		
		/*나머지 = 합계를 11로 나눈 나머지, 코드값 = 11-나머지
			이렇게 계산된 코드값이 주민번호 마지막 오류검증 코드 자리와 같으면 주민번호
			는 올바른 것이다.
			이때 마지막 결과가 2자리인 경우 다시 10으로 나눈 나머지 값으로 검증을 한다.
		 */
		
		int digit = id.charAt(id.length()-1) - '0'; // 주민번호 마지막 자리 숫자
		
		int valid = 11 - (total % 11); // 나머지 = 합계를 11로 나눈 나머지, 코드값 = 11-나머지
		if(valid > 9) valid = valid % 10;
		
		System.out.println("끝자리: " + digit + ", " + valid);
		if(digit == valid) return true;
		
		return false;
	}
	
	private static String birthyear(String id) {
		String birthyear = null;
		
		if(id.charAt(7) == '1' || id.charAt(7) == '2') {
			birthyear = "19" + id.substring(0, 2);
		}
		
		if(id.charAt(7) == '3' || id.charAt(7) == '4') {
			birthyear = "20" + id.substring(0, 2);
		}
		return birthyear;
	}
	
	private static String gender(String id) {
		String gender = null;
		
		if(id.charAt(7) == '1' || id.charAt(7) == '3') {
			gender = "남자";
		}
		
		if(id.charAt(7) == '2' || id.charAt(7) == '4') {
			gender = "여자";
		}
		return gender;
	}
	
	private static boolean isValid(String id) {
		// '-' 위치 체크
		if (id.charAt(6) != '-') return false;
		
		// 성별이 1 ~ 4 범주인지 체크
		if (!(id.charAt(7) >= '1' && id.charAt(7) <= '4')) return false;
		
		return true;
	}
	
	public static boolean isIdNumeric(String id) {
		String[] jumin = id.split("-");
		String front = jumin[0];
		String back = jumin[1];
		
		if(!(StringTest2.isNumeric(front)||StringTest2.isNumeric(back))) return false;
		else return true;

	}
	
}
