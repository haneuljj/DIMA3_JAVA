// 배열
/*
- 같은 타입의 변수를 모아놓은 변수의 집합
- 대량의 정보를 저장할 때 유용하며, index를 통해 접근하므로 반복적인 처리가 가능
- 동일한 데이터 타입과 동일한 이름으로 정의된 각각의 변수는 자신만의 고유한 숫자로 된 인덱스로 구분되며, 인덱스 값은 0부터 시작
- 자바 배열은 모든 Primitive Type의 데이터와 reference Type을 저장
 */

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] arr1; // 변수 선언
		arr1 = new int[10]; // 변수 생성  
		
		System.out.println(arr1); // 타입@주소값; 배열을 가리키는 참조변수
		System.out.println(arr1[0]); // 배열의 0번째값 출력
		System.out.println(arr1.length); // 배열의 길이 출력
		// System.out.println(arr1[10]);
		
		// 배열의 값출력
		for (int temp : arr1) // for(타입 변수명 : 배열명) { 명령문 }
			System.out.print(temp + " ");
		
		
	}

}