/* [문제-27] 5x5열의 2차원 배열을 생성하고 정수 난수를 이용해 
 * 초기화 하고 각 행의 마지막열에 0열~3열까지의 합계를
 * 구하는 프로그램을 작성하시오
 */
public class Exam_27 {
	public static void main(String[] args) {
		int[][] ary = new int[5][5];
		
		// 난수로 초기화
		for(int i=0; i<ary.length; ++i) {
			for(int j=0; j<ary[i].length-1; ++j) { // 0~3까지 반복, 각행의 0~3열에는 난수 들어있음 
				ary[i][j] = (int)(Math.random() * 20 + 1); // 1~20까지의 난수
				ary[i][4] += ary[i][j]; // 각 행의 마지막 열값에는 합계값 할당
			}
		}
		// 결과 출력
		for(int i=0; i<ary.length; ++i) {
			for(int j=0; j<ary[i].length; ++j) {
				System.out.printf("%3d ", ary[i][j]);
			}
			System.out.println();
		}	
	}
}
