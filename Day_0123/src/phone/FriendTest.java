package phone;

public class FriendTest {

	public static void main(String[] args) {
		FriendVO friend1; // 선언
		friend1 = new FriendVO(); // 생성
		friend1.output(); // 기본값으로 변수들이 초기화되어있음
		
		FriendVO friend2 = new FriendVO("홍길동", "010-1111-3333", "1995.01.01", 30);
		friend2.output();
	}

}
