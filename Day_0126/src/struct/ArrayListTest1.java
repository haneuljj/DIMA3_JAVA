package struct;

import java.util.ArrayList;
import java.util.List;

import shape.vo.MyPoint;

public class ArrayListTest1 {

	public static void main(String[] args) {
		// List는 인터페이스이고 ArrayList는 List를 구현한 클래스이기 때문에 List로는 객체 생성 불가
		// 객체 생성가능한 것 : concreate class
		// 객체 생성 불가능한 것 : abstract class, interface
		List<String> list = new ArrayList<>();
		
		List<MyPoint> points = new ArrayList<>(); // <상위클래스>로 선언시 배열리스트안에 상위클래스를 포함한 하위클래스도 들어갈 수 있음
		List objs = new ArrayList<>(); // 최상위 클래스인 Objects이기때문에 모든 클래스 들어갈 수 있음, raw type list -> 지양
	 	
		
		
		// CREATE
		// list 배열리스트에 객체를 추가하는 방법 - 객체 타입이 문자열
		list.add("사과");
		list.add("배");
		list.add("바나나");
		list.add("복숭아");
		list.add("딸기");
		
		// RETRIEVE
		// list 배열리스트에서 데이터 꺼내는 법 
		System.out.println(list.get(1));
		
		// 중간에 데이터 삽입
		list.add(1, "수박"); // 데이터 추가하는 add()함수의 오버로딩된 add()
		
		// list 배열의 길이 출력
		System.out.println("데이터의 개수: " + list.size());
		
		// list 배열에 들어있는 데이터 전체 순회
		for(String s : list) System.out.println(s);
		
		System.out.println("=====================");
		System.out.println(list); // [사과, 수박, 배, 바나나, 복숭아, 딸기]
		// ArrayList의 toString이 주소가 아닌 배열의 데이터 목록을 출력하도록 오버라이딩 되어있음
		
		// 수정 (배 -> 오렌지)
		list.set(2, "오렌지");
		System.out.println("=====================");
		System.out.println(list); 
		
		// 삭제
		list.remove(0);
		
		System.out.println("남은 데이터: " + list.size());
		System.out.println(list);
		System.out.println("=====================");
		
		list.clear();
		System.out.println("남은 데이터: " + list.size());
		System.out.println(list);
		
		// 리스트에 데이터가 포함되어있는지 여부
		list.contains("수박");
		
		// 배열의 사이즈가 0인지 여부
		list.isEmpty(); // list.size == 0 ?
		
	}

}
