package struct;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		// Set은 인터페이스 HashSet은 인터페이스를 구현한 클래스 
		Set<String> set = new HashSet<>();
		
		set.add("아이스 아메리카노");
		set.add("카페모카");
		set.add("아이스초코");
		set.add("자바칩 프라푸치노");
		set.add("돌체라떼");
		
		set.contains("허니블랙티"); // false
		
		set.add("카페모카"); // false, 이미 존재하는 데이터는 추가할 수 없음, 데이터 중복 불가
		
		set.size(); // 5
		set.isEmpty(); // false
		// set.clear();
		set.remove("아메리카노"); // false, 존재하지 않는 데이터 삭제 불가
		
		// get()은 없음, set은 인덱스가 존재하지 않아서
		// 데이터를 꺼내오려면 iterator로 형변환 후 꺼내기

	}

}
