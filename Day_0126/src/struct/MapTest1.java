package struct;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>(); // <key, value>, Integer: 정수를 객체타입으로
		
		// 데이터 추가
		map.put(100, "홍길동");
		map.put(200, "사오정");
		map.put(300, "저팔계");
		
		System.out.println(map);
		
		// 데이터 수정
		map.put(100, "삼장법사"); // 원래 키가 100인 홍길동이 사라지고 값이 바뀜, replace
		
		System.out.println(map);
		
		// 데이터 조회 - get(key)
		// 정수 300이 객체 300으로 변경 (Auto Boxing)
		System.out.println(map.get(300)); // key값으로 접근 -> value값 출력
		
		System.out.println(map.get(700)); // null, 없는 key값 넣을 시
		
		// 데이터 포함하는지
		map.containsKey(700); // false
		map.containsValue("삼장법사"); // true
		
		// 데이터 삭제
		map.remove(200); //키가 200인 데이터 삭제
		
		// 데이터 수정
		// 두 메소드의 차이?
		map.replace(800, "전우치"); // 수정만 가능
		System.out.println(map);
		System.out.println("================================");
		
		map.put(800, "전우치"); // 수정도 되고 추가도 됨
		System.out.println(map);
		
		System.out.println(map.size());
		
		map.clear();
		
		map.keySet();
		
		
	}

}
