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

public class JuminIDValid2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String jumin = null;
		String gender = null, year, month, day;
		int age = 0;
		
		System.out.print("주민번호를 입력하세요: ");
		jumin = scanner.next();
		
		if(jumin.length() != 14) {
			System.out.println("잘못된 입력");
			return;
		}
		
		if(!(isValid(jumin))){
			System.out.println("잘못된 입력");
			return;
		};
		
		String[] tmp = jumin.split("-");
		if (!(isIdNumeric(tmp[0]) && isIdNumeric(tmp[1]))) {
			System.out.println("잘못된 입력");
			return;
		};
		
		if(!(codeCheck(jumin))){
			System.out.println("잘못된 입력");
			return;
		}; // 여기까지 통과 시 올바른 주민번호이므로 성별 체크 
		
		gender = gender(jumin);
		
		year = birthyear(jumin); 
		month = jumin.substring(2,4);
		day = jumin.substring(4,6);
		
		age = 2024 - Integer.parseInt(year) + 1;
		
		// 출력
		System.out.printf("당신은 %s년 %s월 %s일생, 나이는 %d세 %s입니다.", year, month, day, age, gender);
		
	}
	

	private static boolean codeCheck(String id) {
		int total = 0; // 누적합 담을 변수
		int temp = 0;
		int value = 2; // 곱할 값
		
		// 주민번호 마지막 자리 빼고 값을 곱해야함
		for (int i=0; i<id.length()-1; ++i) {
			if (i == 6) continue; // '-'자리는 skip
			temp = id.charAt(i) - '0'; //'1'(49) - '0'(48) = 1
			total += (temp * value); // 자리값 * value
			++value; // value를 증가
			
			if(value == 10) value = 2; // value가 10이되면 다시 2로 초기화하여 곱하기
		}
		
		/*나머지 = 합계를 11로 나눈 나머지, 코드값 = 11-나머지
			이렇게 계산된 코드값이 주민번호 마지막 오류검증 코드 자리와 같으면 주민번호
			는 올바른 것이다.
			이때 마지막 결과가 2자리인 경우 다시 10으로 나눈 나머지 값으로 검증을 한다.
		 */
		
		int digit = id.charAt(id.length()-1) - '0'; // 주민번호 마지막 자리(전체길이-1) 숫자! int값
		
		int valid = 11 - (total % 11); // 나머지 = 합계를 11로 나눈 나머지, 코드값 = 11-나머지
		if(valid > 9) valid = valid % 10; // 마지막 결과가 2자리인 경우 다시 10으로 나눈 나머지 값으로 검증
		
		System.out.println("끝자리: " + digit + ", " + valid);
		if(digit == valid) return true;
		
		return false;
	}
	
	private static String birthyear(String id) {
		String birth = null;
		char gender = id.charAt(7);
		
		if(gender == '1' || gender == '2') 
			birth = "19";
		else
			birth = "20";
		
		return  birth + id.substring(0, 2); 
	}
	
	private static String gender(String id) {
		if((id.charAt(7) - '0') % 2 == 0) // 성별 위치의 숫자가 2로 나누어 떨어지면 여자
			return "여자";
		return "남자"; // 아니면 남자
	}
	
	private static boolean isValid(String id) {
		boolean flag1 = false; // '-' 위치 체크
		boolean flag2 = false; // 성별이 1 ~ 4 범주인지 체크
		
		char gender = id.charAt(7);
		
		if (id.charAt(6) == '-') flag1 = true;
		
		if (gender >= '1' && gender <= '4') flag2 = true;
		else flag2 = false;
		
		return flag1 && flag2;
	}
	
	public static boolean isIdNumeric(String id) {
		boolean result = true;
		for (int i=0; i<id.length(); ++i) {
			char ch = id.charAt(i);
			if (ch < '0' || ch >'9') {
				result = false;
				break;
			} // end of if
		} // end of for
		return result;
	}
	
}
