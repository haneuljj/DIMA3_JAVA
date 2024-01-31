package main;

import service.FitnessService;

public class FitnessMain {
	public static void main(String[] args) {
		new FitnessService(); // 서비스 클래스 생성, 생성자 가져오기, 비즈니스 로직만 가져오기
		// 생성자 안에 while문 있음
		// while문에서 return 문을 만나 빠져나오면 종료
		// 외부에서 호출하는 것은 서비스 생성자만
		// 서비스안에 있는 것 메서드들은 생성자 내에서 호출되는 것이기때문에 prviate이어도 괜찮음
		
	}
} 
