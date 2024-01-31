public class ArrayTest4 {

	public static void main(String[] args) {
		int[][] ary = new int[3][5];  // 15개의 변수가 생성; [0][0] ~ [2][4]까지 생성
		int count = 0;
		
		for(int i=0; i<ary.length; ++i) { // 행 반복 
			for(int j=0; j<ary[i].length; ++j ) { // 열 반복 
				ary[i][j] = ++count;
			}
		}
		
		// 출력
		for(int i=0; i<ary.length; ++i) {
			for(int j=0; j<ary[i].length; ++j ) {
				System.out.printf("%3d ", ary[i][j]);
			}
			System.out.println();
		}
		

	}

}