package phone;

// VO - 하나(한사람)에 대한 정보
/* <클래스 구성>
 * 1)변수 선언
 * 2)생성자
 * 3)setter, getter
 * 4)일반 메서드
 */
public class FriendVO {
	// 이름, 전화번호, 생년월일, 나이
	private String name;
	private String phoneNo;
	private String birthday;
	private int age;
	
	
//	// Constructor method: 개발자가 생성자를 클래스에 만들지 않으면 JVM이 만듦 (기본 생성자), 개발자가 만들면 만들지 않음
//	// FriendVO(클래스를 지칭) vo = new FriendVO()(생성자를 지칭);
//	// 보통 기본생성자는 비어있음; public 클래스명() { }
//	public FriendVO() { // 반환타입이 없고, 메소드이름이 클래스명과 동일
//		// 메서드가 비어있어도 변수들을 기본값으로 초기화하는 역할
//		// 직접 기본값 세팅 가능
////		this.name = "사오정";
////		this.phoneNo = "010-1111-2222";
////		this.birthday = "2000. 12. 25";
////		this.age = 24;
//	}
//
//	// 생성자 오버로딩
//	// 기본생성자를 만들지 않고 오버로딩만 하면 JVM이 기본생성자 만들지 않음
//	// 따라서 기본 생성자는 무조건 만드는 것이 필요
//	public FriendVO(String name, String phoneNo, String birthday, int age) {
//		this.name = name;
//		this.phoneNo = phoneNo;
//		this.birthday = birthday;
//		this.age = age;
//	}
	
	// Constructor, 기본생성자
	public FriendVO() { }
	
	// Constructor, 생성자 오버로딩, 매개변수로 넣은 데이터로 변수가 초기화 됨
	public FriendVO(String name, String phoneNo, String birthday, int age) {
	this.name = name;
	this.phoneNo = phoneNo;
	this.birthday = birthday;
	this.age = age;
}


	// 이미 초기화 되어있는 것의 값을 변경, 조회
	// setter, getter
	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	// 출력 메서드
	public void output() {
		System.out.printf("이름: %s, 번호: %s, 나이: %d, 생년월일: %s", name, phoneNo, age, birthday);
	}
}



