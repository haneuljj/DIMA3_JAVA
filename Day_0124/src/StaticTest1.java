// 하나의 파일에는 public을 가진 클래스가 딱 하나여야함
// main()을 가지고 있고 파일명과 이름이 같은 클래스만 pubilc을 가질 수 있음
// 클래스가 하나의 파일에 여러개인 경우 - 소스코드의 파일은 하나이지만, 클래스 파일은 클래스의 개수만큼 생성됨
// 다른 파일이라도 같은 클래스가 존재시 중복되어서 생성 불가, 테스트용이 아니면 하나의 파일에는 하나의 클래스만 만드는 게 좋음

class Sample {
	public int s1; // 인스턴스 변수 -> 객체 생성시마다 새롭게 생성됨
	public static int s2; // 클래스 변수 -> 처음 하나 만들어지면 더이상 생성되지 않음
	// 클래스변수; 공용으로 사용되는 것 ex) 예금 이자율, 사용자마다 같아서 공통으로 사용가능
}

public class StaticTest1 {

	public static void main(String[] args) {
		Sample.s2 += 1;
		System.out.println(Sample.s2); // 따로 객체 생성 안해도 s2는 static 변수, 클래스 변수이기 때문에 클래스명.변수명으로 접근 가능
		
		Sample temp = new Sample(); // 인스턴스 변수는 객체 생성해야 접근 가능
		temp.s1 += 1;
		System.out.println(temp.s1);
		
		//
		Sample.s2 += 1;
		System.out.println(Sample.s2); // 2; 클래스변수는 메모리에 계속 올라가 있어서 위의 1값에 +1
		
		temp = new Sample(); // 새롭게 객체가 생성됨, 메모리에 다시 올라감
		temp.s1 += 1;
		System.out.println(temp.s1); // 1
	}

}
