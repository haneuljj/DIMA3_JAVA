
package service;

import vo.Fitness;

public interface FitnessService {
	// 배열의 크기
	public static final int MAX = 100; // 전체 회원 수를 정해진 상수값으로 선언 -> UI쪽에서도 쓸 수 있음
	
	// 추상메서드
	public boolean insert(Fitness fitness);
	public Fitness selectOne(String id);
	public boolean update(Fitness fitness);
	public boolean delete(String id);
	public Fitness[] selectAll();
	public int search(String id);
	public int getCount();
	
}
