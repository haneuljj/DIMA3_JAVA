/* [문제-25] 데이터 교환
 * 1차원 정수형 배열 10개를 선언하고, 교환하기
 * 역순으로 나
 */
public class Exam_25 {

	public static void main(String[] args) {
		int[] iary = new int[10];
		int temp;
		
		for(int i=0; i<iary.length; ++i)
			iary[i] = (int) (Math.random() * 99 + 1); // 1이상 100미만의 난수
		
		System.out.println("## 처리 전");
		for(int i=0; i<iary.length; ++i) // 난수 10개
			System.out.print(iary[i] + " ");
		
		// 교환 작업
		for(int i=0; i<iary.length/2; ++i) {
			temp = iary[i];
			iary[i] = iary[iary.length-(i+1)]; // 0-9 , 1-8, 2-7, 3-6, 4-5 끼리 교
			iary[iary.length-(i+1)] = temp;
		}
		
		System.out.println("\n");
		System.out.println("## 처리 후");
		for(int i=0; i<iary.length; ++i)
			System.out.print(iary[i] + " ");

	}

}