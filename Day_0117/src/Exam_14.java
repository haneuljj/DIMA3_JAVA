/* [문제]
 * 놀이동산에서 열차를 운행합니다. 5명이 타면 출발합니다. 150~180이면 열차에 탑승가능 
 * 
 * <실행 예>
 * 키는 얼마? 150
 * 1명 탑승
 * 
 * 키는 얼마? 149
 * 1명 탑승
 * 
 * 키는 얼마? 181
 * 1명 탑승
 * 
 * 키는 얼마? 172
 * 2명 탑승
 * ...
 * 키는 얼마? 177
 * 5명 탑승
 * 열차 출발합니다.
 */

import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {
		int height = 0;
		int total = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("탑승을 시작합니다.");
		
		while(true) {
			// 5명 충족할 시 반복 종료
			if (total == 5) {
				System.out.println("열차 출발합니다.");
				break;
			} // end if
			
			System.out.print("\n키는 얼마? ");
			height = scanner.nextInt();
			
			// 키 조건 충족시 인원 추가
			if((height >= 150) && (height <= 180)) {
				++total;
				System.out.printf("%d명 탑승\n", total);
			} //end if
			
			// 키 조건 미충족시 인원 추가하지 않고 출력만
			else {
				System.out.printf("%d명 탑승\n", total);
			} //end else
		} // end while
		scanner.close();
	} // end main()

}
