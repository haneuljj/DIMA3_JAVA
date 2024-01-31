/* [문제-26] 배열의 중복제거
 */
public class Exam_26 {

	public static void main(String[] args) {
		int[] iary = new int[5];
		int temp;
		
		for(int i=0; i<iary.length; ++i) {
			iary[i] = (int)(Math.random() * 99 + 1); // 1이상 100미만 난수
			
			for(int j= 0; j<i; j++) { 
				if (iary[j] == iary[i]) { // i번째 배열값을 배열의 다른값들과 비교, 같으면,
					--i; // i를 감소시켜 다시 난수 생성하도록
					break; // 중복값 발견 시 다시 배열에서 난수 생성하도록 바깥 for문으로 이동
				} 
			}
		} 
		
		System.out.println("## 중복 제거 결과");
		for(int i=0; i<iary.length; ++i)
			System.out.print(iary[i] + " ");
	}
}