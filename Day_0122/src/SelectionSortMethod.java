// 정렬 부분을 메서드로 변경
public class SelectionSortMethod {

	public static void main(String[] args) {
		int[] ary = new int[10];
		
		// 데이터를 발생해서 초기화
		for(int i=0; i<ary.length; ++i) 
			ary[i] = (int)(Math.random() * 99 + 1); // 1 ~ 99의 난수 생성
		
		System.out.println("## 정렬 전");
		for(int temp : ary) System.out.print(temp + " ");
		
		System.out.println("\n");
		
//		int temp;
//		// 선택정렬 (오름차순)
//		for(int i=0; i<ary.length-1; ++i) {
//			for(int j=i+1; j<ary.length; ++j) {
//				if(ary[i] > ary[j]) {
//					temp   = ary[i];
//					ary[i] = ary[j];
//					ary[j] = temp; 
//				}
//			}
//		} // 선택정렬 끝
		
		selectionSort(ary);
		
		System.out.println("## 정렬 후");
		for(int tmp : ary) System.out.print(tmp + " ");
		
		System.out.println("\n");
	}
	
	public static void selectionSort(int[] ary) {
		int temp;
		// 선택정렬 (오름차순)
		for(int i=0; i<ary.length-1; ++i) {
			for(int j=i+1; j<ary.length; ++j) {
				if(ary[i] > ary[j]) {
					temp   = ary[i];
					ary[i] = ary[j];
					ary[j] = temp; 
				}
			}
		} // 선택정렬 끝
	}

}

