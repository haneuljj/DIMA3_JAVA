class Parent {
	private int money = 2000;
	
	// 생성자
	public Parent() {
		super();
		//System.out.println("Parent 기본 생성자");
	}
	
	public Parent(int money) {
		super();
		this.money = money;
		//System.out.println("Parent 오버로딩 생성자");
	}

	// 일반 메서드
	public int earning() {
		return this.money *= 2;
	}
	public void output() {
		System.out.println("부모 현재 자산: " + money + ", 투자 수익: " + this.earning());
	}
}

class Child extends Parent {
	private int property = 1000;
	
	// 생성자
	public Child() {
		// 부모의 기본 생성자가 없으면 오류, 자식의 생성시 부모의 기본생성자 필수!
		super(); // 부모의 기본 생성자를 호출하는 코드 !! , this() -x, 생략가능 - 생략시 JVM이 강제로 호출
		System.out.println("Child 기본 생성자");
		
		// this.earning(); // 부모의 메서드도 사용가능 - this,super 모두사용 가능, 붙이지 않으면 this라고 인식
		// super.earning(); 
	}	
	
	public Child(int property) {
		super();
		this.property = property;
	}

	// 메서드
	public int gather() {
		return property *= 3;
	}
	
	// 오버라이딩 - 부모클래스에서 상속받은 메서드를 재정의함
		// 메소드의 이름, 매개변수의 개수, 타입, 반환 타입이 모두 같아야함 -> 다르게 하면 오버로딩 ! 
		// 본래 부모의 메서드는 감춰지고 재정의한 메서드만 사용가능
		@Override
		public void output() {
			super.output(); // 부모의 메서드 호출 -> 부모의 메서드, 본인의 메서드 결과 둘 다 출력
			System.out.println("자식 현재 자산: " + property + ",  증식 자산: " + this.gather());
		}
		
		// 출력 코드(output)를 vo에 따로 만들지 않고
		// toString을 오버라이딩하여 많이 사용
		@Override
		public String toString() {
			return "Child [property=" + property + "]";
		}
		
}


public class InheritanceTest1 {

	public static void main(String[] args) {
//		Parent p = new Parent();
//		p.output();
		
		Child c = new Child(); // 부모의 기본 생성자에 있는 출력문구도 함께 출력됨
		c.output();
		c.gather();
		c.earning();
		System.out.println(c.toString()); //Child@277c0f21 - toString()을 오버라이딩 하지 않은경우; 객체의 해시값 출력
		// println() 메소드는 전달인자로 객체를 받으면 자동으로 toString()을 호출하도록 설계
		System.out.println(c); //Child@277c0f21
		
	}

}
