public class ArrayTest2 {
	public static void main(String[] args) {
		double[] darr = new double[10]; // 배열의 길이 10개

		// 난수를 이용해 초기화 하기
		for(int i=0; i < darr.length; ++i)
			darr[i] = Math.random(); // 0.0이상 1.0미만의 난수 10개

		// 출력하기
		for(int i=0; i < darr.length; ++i)
			System.out.print(darr[i] + " ");
		System.out.println();
		

		// 2) 
		// 난수를 이용해 초기화 하기
		for(int i=0; i < darr.length; ++i)
			darr[i] = Math.random() * 100; //0 ~ 1 ==> 0이상 100미

		// 출력하기
		for(int i=0; i < darr.length; ++i)
			System.out.print(darr[i] + " ");
		System.out.println();

		
		// 3) 
		int[] arr = new int[10];
		for(int i=0; i < arr.length; ++i)
			// arr[i] = (int)(Math.random() * 100 + 1); //1이상 101미만
			// -50~49
			arr[i] = (int)(Math.random() * 100 -50);
		
		// 출력하기
		for(int i=0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}