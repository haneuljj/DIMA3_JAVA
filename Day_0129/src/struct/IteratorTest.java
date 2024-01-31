package struct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IteratorTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("사과");
		list.add("배");
		list.add("바나나");
		list.add("포도");
		list.add("딸기");
		
		// iterator; iterator 객체를 반환, <iterator안의 객체의 데이터 타입>
		Iterator<String> iter = list.iterator(); 
		// pointer를 움직이면서 다음 객체 가리킴, 가리킨 곳에 객체가 있는지 없는지
		while (iter.hasNext()) 
			System.out.println(iter.next()); // 다음 가리킨 곳에 객체가 있으면, 그 객체를 반환하는 것을 반복
		
		// ***
		// iterator를 이용하여 map 전체 데이터 순회하기, map은 직접적으로 iterator 사용불가
		// 1) map데이터에서 key를 목록으로 받아오기 -> set형태로 반환됨 (keyset())
		// 2) iterator()를 적용
		// 3) key를 이용하여 데이터 전체 순회
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "홍길동");
		map.put(2, "임꺽정");
		map.put(3, "전우치");
		map.put(4, "손오공");
		map.put(5, "사오정");
		
		// 1)
		Set<Integer> keys = map.keySet();
		// 2)
		Iterator<Integer> iter2 = keys.iterator();
		// Iterator<Integer> iter2 = map.keySet().iterator(); // method chaining
		
		// 3)
		while (iter2.hasNext()) {
			Integer key = iter2.next(); // key를 순회하며 가져오기
			String value = map.get(key); // 가져온 key값으로 value 값 가져오기
			System.out.println(key + " : " + value);
		}
	}

}
