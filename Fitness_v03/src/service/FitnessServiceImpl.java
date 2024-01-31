// 자료(객체배열, 객체배열의 사이즈 변수)에 접근하는 것들은 service클래스에 있어야함

package service;

import vo.Fitness;

public class FitnessServiceImpl implements FitnessService {
	// UI에서 전달받은 값을 가지고 처리할 기능들만 포함
	// 출력하는 문장을 가지면 안됨
	// Service 클래스에 필요한 멤버, 메서드 설계
	// 객체 배열 (CRUD)
	// public static final int MAX = 100; // 전체 회원 수를 정해진 상수값으로 선언 -> UI쪽에서도 쓸 수 있음
	Fitness[] members = new Fitness[MAX];
	int size = 0; // 기능들을 처리하는 데 필요한 객체 배열 크기 변수
	
	
	/**
	 * 파라미터로 전달된 Fitness 객체를 객체 배열에 저장
	 * @param fitness : 객체 배열에 저장할 정보
	 * @return boolean : 객체 배열에 저장되었는지 여부
	 */
	public boolean insert(Fitness fitness) {
		// 객체 배열이 잘 삽입되는 경우 - true, 객체 배열이 삽입안되는 경우 - false
		boolean result = false;
		
		// 객체 배열에 저장
		members[size] = fitness;
		++size;
		result = true;
		
		return result;
	}
	
	/**
	 * id를 전달받아 객체 배열 내에 해당 아이디를 검색하여 결과반환
	 * @param id : 검색할 ID
	 * @return Fitness: 검색결과
	 */
	public Fitness selectOne(String id) {
		// 정보 조회 -> id를 통해 정보 조회, 정보가 있을시 Fitness 객체 반환, 없으면 null 반환
		Fitness f = null; 
		for (int i=0; i<size; ++i) {
			if (members[i].getId().equals(id)) {
					f = members[i]; // id에 해당하는 Fitness 객체 저장
					break;
			}
		}
		
		return f; // 저장한 Fitness 객체 반환
	}
	
	/**
	 * 파라미터로 전달된 Fitness 데이터를 배열에서 검색하여 데이터 수정
	 * @param fitness : 수정하고자 하는 데이터
	 * @return boolean: 수정성공했는지 여부
	 */
	public boolean update(Fitness fitness) {
		// 아이디, 키, 몸무게를 받아 객체의 정보 수정, 정보가 수정되거나 안되거나
		int searchIndex = search(fitness.getId());
		
		members[searchIndex].setWeight(fitness.getWeight());
		members[searchIndex].setHeight(fitness.getHeight());
		
		return true;
	}
	
	/**
	 * 아이디를 전달받아 배열에서 아이디 검색 후 해당 Fitness 객체 삭제
	 * @param id : 삭제하고자 하는 ID 값
	 * @return boolean : 삭제 여부
	 */
	// searchIndex 전달하지 않는 이유: 자료구조를 바꿀 때도 활용하려고
	public boolean delete(String id) {
		// 아이디를 받아 해당 Fitness 객체를 삭제하거나 안하거나
		int searchIndex = search(id);
		
		for(int i=searchIndex; i<size-1; ++i) {
			members[i] = members[i+1];
		}
		--size;
		
		return true;
	}
	
	/**
	 * Fitness 배열 전체를 반환
	 * @return Fitness []
	 */
	public Fitness[] selectAll() {
		
		return members;
	}
	
	/** 회원 정보가 담긴 객체 배열에서 입력받은 아이디에 해당하는 위치값 찾는 메서드
	 * @param id : 입력받는 아이디 정보
	 * @return index : 검색한 아이디의 위치 정보
	 */
	public int search(String id) {
		int index = -1;
		for (int i=0; i<size; ++i) {
			if (members[i].getId().equals(id)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * 현재 회원 수를 반환하는 메서드
	 * @return size: 현재 회원의 수
	 */
	public int getCount() {
		return size;
	}
}
