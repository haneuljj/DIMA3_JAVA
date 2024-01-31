package mypackage;

public class ScoreTest {

	public static void main(String[] args) {
		// Score 클래스를 생성하기
		// Score(클래스명) 변수명 = new Score();
		Score s1 = new Score(); // s1-객체. Score 클래스 생성, static이 아닌 클래스는 new를 사용하여 객체 생성(참조값 생성)
		s1.id ="123";
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 90; 
		s1.mat = 88;
		s1.calcAvg();
//		System.out.println(s1.name + " : " + s1.avg);
//		output(s1); // v2
		s1.output(); // v3
		
		// s2 객체를 임의로 생성하여 결과를 출력하시오
		Score s2 = new Score();
		s2.id = "124";
		s2.name = "전하늘";
		s2.kor = 100;
		s2.eng = 90;
		s2.mat = 80;
		s2.calcAvg();
//		System.out.println(s2.name + " : " + s2.avg);
//		output(s2);
		s2.output();
		
	}
	
	// v2: 위에서 출력문을 위한 메소드를 생성하시오
	// output()
//	public static void output(Score a) {
//		System.out.printf("%s :  %.2f\n", a.name, a.avg);
//		
//	}
	//v3: output메소드를 Score클래스 안으로
}
