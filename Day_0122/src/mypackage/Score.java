package mypackage;

// 사용자 정의 클래스, VO(Value Object) 
public class Score {
	// 학생 아이디, 이름, 국어, 영어, 수학, 평균
	
	// 멤버변수(인스턴스 변수), main method 아닌 class 내에 바로 정의됨
	String id;  
	String name;
	int kor;
	int eng;
	int mat;
	double avg;
	// 같은 클래스 안의 멤버변수들은 우리멤버 -> 접근가능(따로 선언 안해도)

	// 멤버 메서드
	public void calcAvg() { //default 지정자-> 같은 패키지의 클래스들끼리 접근 가능
		avg = (kor + eng + mat) / 3.0;
	}
	
	// static 붙이면 우리멤버 아님 - static을 붙일 경우; 클래스와 상관없이 기능해야하는 경우, 클래스 생성시,사라질시 같이 생성되고 사라지지 않음
	// 우리멤버로 될 경우, Score 변수 생성 할 필요 없음
	public void output() {
		System.out.printf("%s :  %.2f\n", name, avg);
	}
}
