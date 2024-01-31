// Deep Copy
// - java.utils.Arrays

import java.util.Arrays;

public class ArrayTest6 {

	public static void main(String[] args) {
		int[] source = {1, 2, 3, 4, 5};  // 복사할 원본 배열
		int[] target; // 복사될 배열
		int[] target2;
		
		target = Arrays.copyOf(source, 3); // (원본 배열명, 복사할 길이)
		for(int temp : target)
			System.out.print(temp + " ");
		
		System.out.println();
		
		// 원본의 크기보다 크게 newLength값을 주면 초과된 길이는 0으로 채워짐
		target2 = Arrays.copyOf(source, 10); // (원본 배열명, 복사할 길이)
		for(int temp : target2)
			System.out.print(temp + " ");
	}

}
