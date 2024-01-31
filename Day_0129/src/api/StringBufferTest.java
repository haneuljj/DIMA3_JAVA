package api;

// import java,lang 패키지 내부의 클래스는 import 하지 않아도 자동 import 
public class StringBufferTest {

	public static void main(String[] args) {
		// 1) StringBuffer 객체 생성 필요
		StringBuffer buff1 = new StringBuffer(); // 기본생성 **
		StringBuffer buff2 = new StringBuffer("울릉도"); // 문자열을 넣어서 생성
		StringBuffer buff3 = new StringBuffer(100); // 용량 지정하여 생성
		
		// 전체 용량이 얼마인지 반환
		System.out.println("buff1의 용량: " + buff1.capacity()); // 16 - 기본 용량
		System.out.println("buff2의 용량: " + buff2.capacity()); // 19
		System.out.println("buff3의 용량: " + buff3.capacity()); // 100
		
		// 문자열 추가하기
		buff2.append(" 동남쪽").append(" 뱃길따라 ").append(200).append("리")
			.append(" 외로운 섬하나 새들의 고향 ").append("그 누가 아무리 자기네 땅이라고 우겨도")
			.append("독도는 우리 땅");
		
		System.out.println("buff2의 용량: " + buff2.capacity()); // 메모리를 자동으로 늘림, 글자 포함 뒤 여유공간까지
		// insert(), reverse(), trimToSize()
		System.out.println("buff2의 길이: " + buff2.length()); // 실제 글자 개수
		
		buff2.trimToSize(); // 비어있는 buffer를 지워버림
		System.out.println("buff2의 용량: " + buff2.capacity()); 
		System.out.println("buff2의 길이: " + buff2.length());
		
		// 삽입, 추가 등 모든 작업을 마친 후 일반 문자열로 변환
		String str = buff2.toString();
		
	}

}
