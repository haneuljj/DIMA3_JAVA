
public class OperatorTest3 {

	public static void main(String[] args) {
		/*
		boolean b1 = true;
		boolean b2 = false;
		boolean result;
		
		result = b1 && b2; // &&; 둘 다 true일 때만 true
		result = b1 || b2; // ||; 둘 중 하나만 true면 true
		result = !b1; // !; true면 false로 false면 true로 변환
		*/
		
		// 출결점수 80점이상 , 세 과목 평균이 60이상, 과락(40점 미만)이 없을 경우에만 수료한다고 가정했을 때
		boolean graduate; // 수료 여부 변수
		int attendance = 100;
		int trade = 100;
		int it = 100;
		String name = "전하늘";
		
		graduate = (attendance >= 80) && ((attendance + trade + it) / 3.0 >= 60) && (attendance >= 40 && trade >= 40 && it >= 40);
		
		String result = (graduate) ? "수료" : "미수료";
		System.out.println(name + "님은 " + result + "입니다.");
		
		/* 단축연산(Short Circuit)
		 * A && B의 진위값을 통해 결과
		 * A가 false인 경우 B를 확인하지 않아도 결과는 false로 결정되기 때문에
		 * B에 대한 연산 하지 않음
		 * 
		 * A || B의 진위값을 통해 결과
		 * A가 true인 경우 뒤쪽 연산 하지 않음
		 * 
		 * 단축 연산을 하지 않는 논리연산자: &, |
		 * 피연산자가 정수이면 비트 연산
		 * boolean값에 사용시, 단축연산하지 않고 논리연산
		 */
	}

}
