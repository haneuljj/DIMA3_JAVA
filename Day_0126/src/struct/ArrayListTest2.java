package struct;

import java.util.ArrayList;
import java.util.List;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}

public class ArrayListTest2 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();  //List <객체>
		
		// 리스트에 객체 추가
		list.add(new Person("홍길동", 12));
		list.add(new Person("전우치", 25));
		list.add(new Person("손오공", 30));
		list.add(new Person("사오정", 31));
		
		// 리스트 1번자리에 객체 삽입
		list.add(1, new Person("저팔계", 15));
		// 홍-저-전-손-사
		// 5개
		
		// 사오정 삭제, 반환타입: 해당 인덱스의 데이터
		Person p = list.remove(4); // p -> 사오정에 대한 Person 객체
		 
		// 손오공을 삼장법사로 수정, 반환타입: 해당 인덱스의 데이터(손오공)
		// 홍-저-전-삼
		p = list.set(3, new Person("삼장법사", 65));
		
		// 1번위치의 데이터 가져오기, 반환타입: 해당 인덱스의 데이터
		p = list.get(1);
	}

}
