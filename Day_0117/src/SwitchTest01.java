
public class SwitchTest01 {

	public static void main(String[] args) {
		int score = 98;
		String clz = "";  // 초기화:clz값에 비어있는 문자열을 참조(위치값존재), String clz = null 초기화: 아무것도 참조하지 않음
		
		// switch의 case: place holder, 조건에 따른 실행 위치 정도, break없으면 밑으로 떨어져 break문 만날때까지 떨어지며 실행 
		// 최적화에 유리, {} 생략 불가
		switch(score / 10) {
		case 10: // 밑의 case로 떨어져서 실행
		case 9: clz = "A학점"; break;  // switch 문 빠져나가기
		case 8: clz = "B학점"; break; 
		case 7: clz = "C학점"; break; 
		case 6: clz = "D학점"; break;
		default: clz = "F학점"; // 모든 case에 걸리지 않을 시 실행
		}
		
		System.out.println(clz);
	}

}
