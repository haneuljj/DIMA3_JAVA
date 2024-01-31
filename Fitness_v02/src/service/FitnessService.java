// 서비스 클래스
// 비즈니스 로직, 실제 기능적 요구사항들이 담긴 클래스

package service;

import java.util.Scanner;
import vo.Fitness;

public class FitnessService {

	Scanner keyin = new Scanner(System.in); 
	Fitness[] members = new Fitness[100]; // 최대 회원수가 100명인 객체 배열
	int size; // 현재 회원수
	

	public FitnessService() {
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
		if (size > members.length) {
			System.out.println("## 회원이 꽉 찼습니다 ! ");
			return;
		}
		
		
		// 정보 입력받기
		System.out.print("> 아이디 :"); id = keyin.next();
		System.out.print("> 이  름 :"); name = keyin.next();
		System.out.print("> 키(cm) :"); height = keyin.nextDouble();
		System.out.print("> 몸무게(kg) :"); weight = keyin.nextDouble();
		
		int searchIndex = search(id);
		if (searchIndex != -1) {
			System.out.println("## 이미 존재하는 아이디 입니다 !");
			return;
		}
		
		// 객체 배열에 넣기
		members[size] = new Fitness(id, name, height, weight); 
		++size;
		
		System.out.println("## 회원등록 완료 !\n");
		
	}
	
	/**
	 * 회원의 id를 입력받아 해당 회원의 정보를 조회하는 메서드
	 * parameter: 없음
	 * return: 없음
	 */
	private void read() {
		System.out.println(" [ 회원 조회 ] ");
		
		if (size == 0) { 
			System.out.println("## 등록된 회원이 없습니다.\n"); 
			return;
		}
		
		// 검색할 사람의 아이디 입력
		String id;
		System.out.print("> ID를 입력하세요: ");
		id = keyin.next();
		
		int searchIndex = search(id);
		//-1이 반환되면 에러메시지 출력
		// 아니면 정보 출력
		if (searchIndex == -1) {
			System.out.println("## 잘못된 ID이거나 존재하지 않는 ID입니다.\n");
			return;
		}
		else members[searchIndex].output();
	}

	/**
	 * 회원의 정보를 찾아서 키와 몸무게를 다시 입력받아
	 * 그 두 개의 정보를 수정하는 메서드
	 * parameter: 없음
	 * return: 없음
	 */
	private void update() {
		System.out.println(" [ 정보 수정 ] ");
		
		if (size == 0) { 
			System.out.println("## 등록된 회원이 없습니다.\n"); 
			return;
		}

		// 수정할 사람의 아이디 입력
		double weight, height;
		String id;
		
		System.out.print("> 수정할 ID를 입력하세요: ");
		id = keyin.next();
		
		int searchIndex = search(id);
		//-1이 반환되면 에러메시지 출력
		// 아니면 탈퇴 로직 실행
		if (searchIndex == -1) {
			System.out.println("## 잘못된 ID이거나 존재하지 않는 ID입니다.\n");
			return;
		}

		System.out.print("> 키(cm) :"); height = keyin.nextDouble();
		System.out.print("> 몸무게(kg) :"); weight = keyin.nextDouble();
		
		// setter로 키, 몸무게값 변경하기
		members[searchIndex].setWeight(weight);
		members[searchIndex].setHeight(height);
		
		System.out.println("## 정보 수정 완료 !\n");
		
	}
	
	/**
	 * 회원 탈퇴를 처리하는 메서드
	 * parameter: 없음
	 * return: 없음
	 */
	private void delete() {
		System.out.println(" [ 회원 탈퇴 ] ");
		
		if (size == 0) { 
			System.out.println("## 등록된 회원이 없습니다.\n"); 
			return;
		}
		
		// 탈퇴할 사람의 아이디 입력
		String id;
		System.out.print("> 탈퇴할 ID를 입력하세요: ");
		id = keyin.next();
		
		int searchIndex = search(id);
		//-1이 반환되면 에러메시지 출력
		// 아니면 정보 출력
		String confirm;
		
		if (searchIndex == -1) {
			System.out.println("## 잘못된 ID이거나 존재하지 않는 ID입니다.\n");
			return;
		} // end of if
 
		System.out.println("> 정말 탈퇴하시겠습니까? (y/n) ");
		confirm = keyin.next();
		
		if(!(confirm.equals("Y") || confirm.equals("y"))) {
			System.out.println("## 탈퇴 취소되었습니다 !\n");
			return;
		}
		
		// 회원 삭제
		for(int i=searchIndex; i<size-1; ++i) {
			members[i] = members[i+1];
		}
		--size;
		
		System.out.println("## 탈퇴 완료되었습니다 !\n");

	}
	
	private void readAll() {
		System.out.println(" [ 전체 조회 ] ");
		
		if (size == 0) { 
			System.out.println("## 등록된 회원이 없습니다.\n"); 
			return;
		}
		
		for(int i=0; i<size; ++i) {
			System.out.print(i+1 + ") ");
			members[i].output();
		}
	}

	
	/** search 메서드
	 * @param id
	 * @return index
	 */
	private int search(String id) {
		int index = -1;
		for (int i=0; i<size; ++i) {
			if (members[i].getId().equals(id)) {
				index = i;
				break;
			}
		}
		return index;
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
	
	

} // end of FitnessService
