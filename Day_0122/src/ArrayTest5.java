
public class ArrayTest5 {

	public static void main(String[] args) {
		// 2차원 배열의 선언과 생성
		int[][] iArrays = new int[3][5];
		
		// 배열의 length속성을 이용하여 2차원 배열을 순회하면서 값을 초기화
		int initVal = 0;
		for (int i = 0; i < iArrays.length; i++) {
			for(int j = 0; j < iArrays[i].length; j++)
				iArrays[i][j]= initVal++;
		}
		
		//2차원 배열을 순회하면서 값을 출력
		for (int i = 0; i< iArrays.length; i++) {
			for (int j = 0; j < iArrays[i].length; j++) {
				System.out.print("[" + i + "][" + j + "]: " + iArrays[i][j]);
				System.out.print("\t");
			}
		System.out.println();
		}
	}

}
