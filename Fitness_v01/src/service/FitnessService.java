// 서비스 클래스
// 비즈니스 로직, 실제 기능적 요구사항들이 담긴 클래스

package service;

import java.util.Scanner;
import vo.Fitness;

public class FitnessService {
	// main안에 있으면 main에서만 사용가능한 지역변수
	// fitnessmain 클래스 안에 있으면 다른 함수에서도 사용가능한 **멤버**가 됨, 멤버끼리 자유롭게 사용 가능
	// 생성자를 통해서 생성되는 것이 아니라 클래스 실행 시 메모리에 올라감
	// 클래스마다 같은 값이 사용되기에, 객체가 변하지 않기에 생성과 동시에 선언
	// 클래스 안의 변수가 값이 변하지 않은 상수 값으로 쓰려면
	// public final static 데이터 타입 = 상수 값;
	Scanner keyin = new Scanner(System.in); // 멤버, 다른 함수내에서 따로 생성할 필요없이 같은값만 사용, 선언과 동시에 생성
	Fitness fitness; // fitness 객체 선언을 클래스 안에서, fitness vo 객체를 멤버로 -> 여러 함수에서 자유롭게 활용 필요
	
	// 메인 메서드 -> 생성자, 클래스의 변수들을 자유롭게 사용가능
	public FitnessService() {
//		Fitness member1 = new Fitness(); // 생성자: 메모리 확보 후 초기화
//		member1.output();
//		
//		// Fitness member2 = new Fitness("1", "홍길동", 180, 88, 23.5, "정상");
//		// bmi와 bmi 결과는 직접 넣지 않고 키, 몸무게를 입력받으면 알아서 계산되서 값이 나오도록 fitness 클래스 변경 필요
//		
//		Fitness member2 = new Fitness("1", "홍길동", 180, 88);
//		member2.output();
//		
//		member2.setWeight(70); // 몸무게의 변경 -> bmi와 결과도 변경되어야 함(setter에 변경 메서드도 포함되어야)
//		member2.output();
//		
//		member2.setHeight(175); // 키의 변경 -> bmi와 결과도 변경되어야 함
//		member2.output();
		
		// main()은 멤버가 아님, menu()가 멤버, static이 아닌 우리멤버를 static인 main에서 호출하기 위한 방법
		// FitnessService service = new FitnessService(); 
		String choice; 
		
		// 0입력할때까지 반복
		while(true) {
			menu();
			choice = keyin.next();
			// choice = keyin.next(); // error, keyin이 static 변수가 아니어서 static인 main에서 그냥 호출 안됨
			
			switch(choice) {
			case "1" : create(); break;
			case "2" : read(); break;
			case "3" : update(); break;
			case "4" : delete(); break;
			case "0" : 
				System.out.println("## 프로그램을 종료합니다.");
				return;
			default: 
				System.out.println("## 메뉴를 다시 선택하세요.");
				keyin.nextLine(); // 입력 버퍼 비우기
			}// end of switch
		}// end of while
		
	} // end of main


	// 일반메서드
	// 회원 등록 메서드
	private void create() {
		System.out.println(" [ 회원 등록 ] ");
		
		String id, name; // create 메서드의 지역 변수 - 함수가 닫히면 사라짐, 외부로부터 입력받을 값들
		double weight, height;
		
		System.out.print("> 아이디 :"); id = keyin.next();
		System.out.print("> 이  름 :"); name = keyin.next();
		System.out.print("> 키(cm) :"); height = keyin.nextDouble();
		System.out.print("> 몸무게(kg) :"); weight = keyin.nextDouble();
		
		// 우리멤버 -> fitness객체 선언을 FitnessMain클래스 안에서 함
		fitness = new Fitness(id, name, height, weight); // 입력받은 값으로 객체 생성
		System.out.println("## 회원등록 완료 !\n");
		
	}
	
	// 회원 조회 메서드
	private void read() {
		System.out.println(" [ 회원 조회 ] ");
		
		if (fitness == null) { 
			System.out.println("## 등록된 회원이 없습니다.\n"); 
			return;
		}
		
		fitness.output();
		
	}
	
	// 정보 수정 메서드
	private void update() {
		System.out.println(" [ 정보 수정 ] ");
		
		if (fitness == null) { 
			System.out.println("## 등록된 회원이 없습니다.\n"); 
			return;
		}
		
		double weight, height;

		System.out.print("> 키(cm) :"); height = keyin.nextDouble();
		System.out.print("> 몸무게(kg) :"); weight = keyin.nextDouble();
		
		// setter로 키, 몸무게값 변경하기
		fitness.setWeight(weight);
		fitness.setHeight(height);
		System.out.println("## 정보 수정 완료 !\n");
	}
	
	// 회원 탈퇴 메서드
	private void delete() {
		System.out.println(" [ 회원 탈퇴 ] ");
		
		if (fitness == null) { 
			System.out.println("## 등록된 회원이 없습니다.\n"); 
			return;
		}
		 
		String confirm;
		
		System.out.println("> 정말 탈퇴하시겠습니까? (y/n) ");
		confirm = keyin.next();
		
		if(!(confirm.equals("Y") || confirm.equals("y"))) {
			System.out.println("## 탈퇴 취소되었습니다 !\n");
			return;
		}
		
		fitness = null; // fitness 객체의 참조가 불가능해지면서 garbage collector가 삭제하게 되어있음
		System.out.println("## 탈퇴 완료되었습니다 !\n");
	}
	
	// 메뉴 출력 메서드
	private void menu() {
		System.out.println("===[ 디마 피트니스 회원관리 ]===");
		System.out.println("         1) 회원등록");
		System.out.println("         2) 회원조회");
		System.out.println("         3) 정보수정");
		System.out.println("         4) 회원탈퇴");
		System.out.println("         0) 종    료");
		System.out.println("================================");
		System.out.print("            선    택: ");
	}
	
	

} // end of FitnessService
