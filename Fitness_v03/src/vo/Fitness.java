// 피트니스 멤버 관리 프로젝트
// 데이터 추상화
/* 회원 아이디: 임의의 숫자; PK(중복되지 않아야한다, 빈값 안됨)
 * 회원 이름: 임의의 문자열; (중복가능, 빈값 안됨)
 *  키: double; 값변경가능해야함(setter필요),빈값은 0값으로초기화
 *  몸무게: double; 값변경가능해야함(setter필요),빈값은 0값으로초기화
 *  BMI: 키와 몸무게로 계산되어 산출되는 값
 *  BMI 결과값: BMI로 계산되어 산출되는 값
 */

// 구조화
/*
 * 변수선언/ 생성자2종류/ setter,getter / toString() 오버라이딩
 */

// 관련있는 정보들을 캡슐화할 VO 클래스
// 서비스 클래스에서 이용하는 정보들
package vo;

public class Fitness {
	
	// 멤버변수 선언
	private String id;
	private String name;
	private double height;
	private double weight;
	private double bmi;
	private String result;
	
	// 생성자
	// : setter 전에 메모리 확보 역할
	public Fitness() { 
		super();
	}

	public Fitness(String id, String name, double height, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
		
		calcBMI(); // 입력받은 키와 몸무게로 bmi와 결과값 계산하여 초기화
	}
	

	// setter, getter
	// setter: 메모리가 확보되어 있지 않으면 변경 불가, 생성자가 없으면 불가능
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public double getBmi() {
		return bmi;
	}

	public String getResult() {
		return result;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
		calcBMI(); // 키가 바뀌면 bmi와 결과값이 바뀌어야함
	}

	public void setWeight(double weight) {
		this.weight = weight;
		calcBMI(); // 몸무게가 바뀌면 bmi와 결과값이 바뀌어야함
	}
	
	// 일반 메서드
	// 출력 메서드
	@Override
	public String toString() {
		return String.format("ID: %s, Name: %s, Height: %.2fcm, Weight: %.2fkg, BMI: %.2f, %s\n", id, name, height, weight, bmi, result);
	}
	
	// BMI 계산 메서드 - 반복적으로 사용되기 때문에 메서드로 분리
	private void calcBMI() {
		this.bmi = weight / (height * height * 0.0001);
		calcResult();
	}
	
	// BMI 결과 계산 메서드
	private void calcResult() {
		if(bmi >= 35) result = "고도 비만";
		else if(bmi >= 30) result = "중도 비만";
		else if(bmi >= 25) result = "경도 비만";
		else if(bmi >= 23) result = "과체중";
		else if(bmi >= 18.5) result = "정상";
		else result = "저체중";
	}
	
	
}
