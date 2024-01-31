package api;

public class StringTest1 {

	public static void main(String[] args) {
		String str1  = "무궁화 꽃이 피었습니다.";
		String str2  = "무궁화 꽃이 피었습니다."; // 이미 존재하는 데이터, 새로 메모리 공간 만들지 않음, 같은 객체 가리킴
		String str3  = new String("무궁화 꽃이 피었습니다."); // 안에 내용은 같지만 서로 다른 주소로 새로운 메모리 공간 만듦 
		
		// String pool 메모리 공간의 특징
		// - 동일한 데이터가 있을 경우 한 개만 만듦, 새롭게 생성하지 않음
		
		System.out.println(str1 == str2); // 주소 비교 - true    
		System.out.println(str1.equals(str2)); // 내용 비교 -  true
		
		System.out.println(str1 == str3); // 주소 비교 - false
		System.out.println(str1.equals(str3)); // 내용 비교 - true
		
		// **** String; immutable 데이터, 값 수정 불가
		String str4 = null; // 아무것도 가리키지 않음
		str4 = "무궁화";
		str4 = str4 + " 꽃이";
		str4 = str4 + " 피었습니다.";
		// +연산을 하면 기존의 객체를 수정하는 것이 아니라, 그 객체를 버리고 계속 객체를 새로 생성하여 가리킴 -> JVM에 부담 가중, 성능 저하
		System.out.println(str4);
		
	}

}
