package shape.main;

import shape.vo.MyCircle;
import shape.vo.MyPoint;
import shape.vo.MyRectangle;
import shape.vo.MyTriangle;

public class ShapeMain {

	public static void main(String[] args) {
		/* 다형성 */
		// 부모의 참조 변수가 자식 객체의 위치값을 갖도록 한다
		// MyPoint 객체인데 실제 동작은 자식 객체인 MyCircle로 함
		MyPoint p = new MyCircle(); // 다운캐스팅(부모 타입을 자식의 타입으로 변환)
		p.temp(); // 자식클래스의 temp()함수 실행
		
		//MyPoint tmp = (MyPoint)p; // 업캐스팅(자식을 부모로 변환)
		//tmp.temp(); // 자신의 함수 실행, MyPoint로 강제 캐스팅
		
		
		MyCircle tt = new MyCircle(); 
		MyPoint tmp = ((MyPoint)tt); // 업캐스팅
		
		// 변수 instanceof 타입: 변수가 타입인지 여부
		System.out.println(p instanceof MyPoint); //true, p가 선언된 타입
		System.out.println(p instanceof MyCircle); //true, p가 실제로 가리키는 타입 !!, 객체가 실제로 가리키는 타입이 무엇인지 확인할 때 가장 많이 씀
		System.out.println(tt instanceof MyPoint); //true
		// 관계가 있어야 t/f 출력, 아무 관계 없으면 에러
		
		
		System.out.println(p); // 자신(부모)의 toString()이 아닌 자식 클래스의 toString() 실행
		p.calcArea(); // 자식 클래스의 함수 동작, 동적 바인딩; 부모의 메서드가 추상메서드일 때 발생
		
		p = new MyTriangle();
		p.temp();
		System.out.println(p); // 자신(부모)의 toString()이 아닌 자식 클래스의 toString() 실행
		
		p = new MyRectangle();
		p.temp(); // temp()함수가 없는 자식 클래스인 경우 자신(부모)의 temp()함수 실행
		System.out.println(p); // 자신(부모)의 toString()이 아닌 자식 클래스의 toString() 실행
		
		
		
		
		
		
		
		//
		MyCircle c = new MyCircle(5.0);
		
		c.setX(5); // 부모의 private 변수에 자식이라도 직접 접근 불가, 메서드를 통해서 접근해야함
		c.setY(5);
		System.out.println(c);
		
		//
		MyTriangle t = new MyTriangle(20, 8);
		
		t.setX(9);
		t.setY(10);
		System.out.println(t);
		
		//
		MyRectangle r = new MyRectangle(10,10);
		
		r.setX(1);
		r.setY(1);
		System.out.println(r);
	}

}
