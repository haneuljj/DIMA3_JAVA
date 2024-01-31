// call by reference
public class MethodTest3 {

	public static void main(String[] args) {
		int[] arr = {10, 20};
		
		
		System.out.println(arr[0] + ", " + arr[1]); // 10, 20
		
		exchange(arr); // call by reference
		
		System.out.println(arr[0] + ", " + arr[1]); // 20, 10
		
	}

	public static void exchange(int[] arr) {
		int temp;
		temp = arr[0];
		arr[0] = arr[1]; 
		arr[1] = temp;
		
	}
	
//	public static int[] exchange(int[] arr) { // 반환값 지정시, 데이터 타입 맞추기, 함수를 받는 곳에서도 같은 타입으로 받아야함
//		int temp;
//		temp = arr[0];
//		arr[0] = arr[1]; 
//		arr[1] = temp;
//		
//		return arr;
//		
//	}
	
}
