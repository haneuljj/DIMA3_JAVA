// UI클래스: 사용자의 화면에 보이는 부분들
// 입력, 출력 부분

package ui;

import java.util.Scanner;

import service.FitnessService;
import service.FitnessServiceImpl;
import vo.Fitness;

public class FitnessUI {

	Scanner keyin = new Scanner(System.in);
	FitnessService service = new FitnessServiceImpl(); // 서비스 클래스 객체 생성

	public FitnessUI() {
		String choice; 
		
		// 0입력할때까지 반복
		while(true) {
			menu();
			choice = keyin.next();
			
			switch(choice) {
			case "1" : create(); break;
			case "2" : read(); break;
			case "3" : update(); break;
			case "4" : delete(); break;
			case "5" : readAll(); break;
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
	/**
	 * 회원 가입을 처리하는 메서드
	 * parameter: 없음
	 * return: 없음
	 */
	private void create() {
		System.out.println(" [ 회원 등록 ] ");
		
		String id, name; // create 메서드의 지역 변수 - 함수가 닫히면 사라짐, 외부로부터 입력받을 값들
		double weight, height;
		
		
		// 객체 배열이 꽉찼을 경우
		if (service.getCount() > FitnessServiceImpl.MAX) {
			System.out.println("## 가능한 회원가입 인원이 초과되었습니다 ! ");
			return;
		}
		
		
		// 정보 입력받기
		System.out.print("> 아이디 :"); id = keyin.next();
		// 아이디 중복확인
		int searchIndex = service.search(id);
		if (searchIndex != -1) {
			System.out.println("## 이미 존재하는 아이디 입니다 !");
			return;
		}
		
		System.out.print("> 이  름 :"); name = keyin.next();
		System.out.print("> 키(cm) :"); height = keyin.nextDouble();
		System.out.print("> 몸무게(kg) :"); weight = keyin.nextDouble();
		
		//** 서비스 클래스에서 처리할 부분 - 회원 등록 처리, 객체 배열에 저장
		Fitness fitness = new Fitness(id, name, height, weight);
		boolean result = service.insert(fitness);
		
		if(result) System.out.println("## 회원등록 완료 !\n");
		
	}
	
	/**
	 * 회원의 id를 입력받아 해당 회원의 정보를 조회하는 메서드
	 * parameter: 없음
	 * return: 없음
	 */
	private void read() {
		System.out.println(" [ 회원 조회 ] ");
		
		if (service.getCount() == 0) { 
			System.out.println("## 등록된 회원이 없습니다.\n"); 
			return;
		}
		
		// 검색할 사람의 아이디 입력
		String id;
		System.out.print("> ID를 입력하세요: ");
		id = keyin.next();
		
		int searchIndex = service.search(id);
		//-1이 반환되면 에러메시지 출력
		// 아니면 정보 출력
		if (searchIndex == -1) {
			System.out.println("## 잘못된 ID이거나 존재하지 않는 ID입니다.\n");
			return;
		}
		
		//** 서비스 클래스에서 처리할 부분 - 객체 배열에서 입력 받은 id에 해당하는 객체를 찾아 정보 출력
		Fitness fitness = service.selectOne(id);
		// println()은 자동으로 객체에 .toString()을 붙여서 사용됨 -> 재정의한 toString()의 문자열 반환값 출력
		System.out.println(fitness);
	}

	/**
	 * 회원의 정보를 찾아서 키와 몸무게를 다시 입력받아
	 * 그 두 개의 정보를 수정하는 메서드
	 * parameter: 없음
	 * return: 없음
	 */
	private void update() {
		System.out.println(" [ 정보 수정 ] ");
		
		if (service.getCount() == 0) { 
			System.out.println("## 등록된 회원이 없습니다.\n"); 
			return;
		}

		// 수정할 사람의 아이디 입력
		double weight, height;
		String id;
		
		System.out.print("> 수정할 ID를 입력하세요: ");
		id = keyin.next();
		
		int searchIndex = service.search(id);
		
		if (searchIndex == -1) {
			System.out.println("## 잘못된 ID이거나 존재하지 않는 ID입니다.\n");
			return;
		}

		System.out.print("> 키(cm) :"); height = keyin.nextDouble();
		System.out.print("> 몸무게(kg) :"); weight = keyin.nextDouble();
		
		//** 서비스 클래스에서 처리할 부분 - 해당 객체를 찾아 정보 수정 
		// 서비스 클래스의 함수의 매개변수에 전달할 fitness 객체 생성
		Fitness fitness = new Fitness(id, null, height, weight);
		boolean result = service.update(fitness);
		
		if(result) System.out.println("## 정보 수정 완료 !\n");
		
	}
	
	/**
	 * 회원 탈퇴를 처리하는 메서드
	 * parameter: 없음
	 * return: 없음
	 */
	private void delete() {
		System.out.println(" [ 회원 탈퇴 ] ");
		
		if (service.getCount() == 0) { 
			System.out.println("## 등록된 회원이 없습니다.\n"); 
			return;
		}
		
		// 탈퇴할 사람의 아이디 입력
		String id;
		System.out.print("> 탈퇴할 ID를 입력하세요: ");
		id = keyin.next();
		
		int searchIndex = service.search(id);
		
		if (searchIndex == -1) {
			System.out.println("## 잘못된 ID이거나 존재하지 않는 ID입니다.\n");
			return;
		} // end of if
 
		String confirm; 
		System.out.println("> 정말 탈퇴하시겠습니까? (y/n) ");
		confirm = keyin.next();
		
		if(!(confirm.equals("Y") || confirm.equals("y"))) {
			System.out.println("## 탈퇴 취소되었습니다 !\n");
			return;
		}
		
		//** 서비스 클래스에서 처리할 부분
		// 회원 삭제 처리
		boolean result = service.delete(id);
		if(result) System.out.println("## 탈퇴 완료되었습니다 !\n");

	}
	
	private void readAll() {
		System.out.println(" [ 전체 조회 ] ");
		
		int size = service.getCount();
		
		if (size == 0) { 
			System.out.println("## 등록된 회원이 없습니다.\n"); 
			return;
		}
		System.out.println("## 현재 회원 수: " + service.getCount());
		
		//** 서비스 클래스에서 처리할 부분 - 객체 배열 전체 반환
		Fitness[] members = service.selectAll();
		for(int i=0; i<size; ++i) {
			System.out.print(i+1 + ") ");
			System.out.println(members[i]);
		}
	}
	
	// 메뉴 출력 메서드
	private void menu() {
		System.out.println("===[ 디마 피트니스 회원관리 ]===");
		System.out.println("         1) 회원등록");
		System.out.println("         2) 회원조회");
		System.out.println("         3) 정보수정");
		System.out.println("         4) 회원탈퇴");
		System.out.println("         5) 전체조회");
		System.out.println("         0) 종    료");
		System.out.println("================================");
		System.out.print("            선    택: ");
	}
	

} // end of FitnessUI
