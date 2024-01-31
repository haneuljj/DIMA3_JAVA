
public class ArrayTest8 {

	public static void main(String[] args) {
		int[] ary1 = {1, 2, 3, 4, 5};
		int[] ary2 = new int[5];
		
		// 원본 배열의 길이를 넘어서 복사하면 에러
		System.arraycopy(ary1, 2, ary2, 1, 3); // (복사할 원본 배열, 원본배열의 어디부터 복사, 복사될 복사본, 복사본의어디부터 복사, 복사할 길이)
		for (int temp : ary2)
			System.out.print(temp + " ");
	}

}
