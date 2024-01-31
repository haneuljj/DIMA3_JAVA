package mypackage2;

public class ScoreTest {

	public static void main(String[] args) {
		// Score 클래스를 생성하기
		// Score(클래스명) 변수명 = new Score();
		Score s1 = new Score(); // s1-객체. Score 클래스 생성, static이 아닌 클래스는 new를 사용하여 객체 생성(참조값 생성)
		// s1.id ="123"; // 직접 접근, private 변수는 직접 접근 불가
		
		// setter를 사용하여 접근
		s1.setId("123");
		s1.setName("홍길동");
		s1.setKor(100);
		s1.setEng(88);
		s1.setMat(91);
		s1.calcAvg();
		s1.output();
		
		// s2 객체를 임의로 생성하여 결과를 출력하시오
		Score s2 = new Score();
		
		s2.setId("124");
		s2.setName("전하늘");
		s2.setKor(100);
		s2.setEng(80);
		s2.setMat(90);
		s2.calcAvg();
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
