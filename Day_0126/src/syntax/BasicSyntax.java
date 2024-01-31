package syntax;

import java.util.Objects;

class Friend {
	String name;
	int age;
	
	public Friend(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// Object로부터 상속받은 메서드인 equals()를 오버라이딩
//	@Override
//	public boolean equals(Object obj) {
//		if (!(obj instanceof Friend)) return false; // 전달받은 객체가 같은 타입이 아니면 false 반환
//		
//		Friend tmp = (Friend)obj; // 다운 캐스팅; 입력받은 Object타입의 객체를 Friend타입으로 맞추기
//		
//		// 이름도 같고 나이도 같으면, 같은 데이터로 인정
//		if( (this.name.equals(tmp.name)) && (this.age == tmp.age) ) 
//			return true;
//		
//		return false;
//	}
//	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", age=" + age + "]";
	}
	
	// 자동 생성 가능
	// 내용이 같으면 객체를 하나만 만듦
	@Override
	public int hashCode() {
		return Objects.hash(age, name); // 데이터를 넣어서 주소를 계산하는 함수
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friend other = (Friend) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}

public class BasicSyntax {

	public static void main(String[] args) {
		Friend f1 = new Friend("홍길동", 10);
		Friend f2 = new Friend("홍길동", 10);
		
		String s1 = "사과";
		System.out.println(s1.equals("사과")); //true
		
		System.out.println(f1.equals(f2)); // equals()를 오버라이딩전에, false -> 둘의 참조변수가 달라 다른 객체임,, 
		// equals()를 오버라이딩후, true
		
		// 참조변수값이 다르지만 !  값이 모두 같아서 true로 출력하고 싶다면,
		// Object로부터 상속받은 메서드인 equals()를 오버라이딩
		
		System.out.println(f1 == f2);
		System.out.println(f1.hashCode() == f2.hashCode());
		
	}

}
