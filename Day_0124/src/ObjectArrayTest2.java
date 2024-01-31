class Person { 
	private String name;
	private int age;
	
	public Person() { }

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void output() {
		System.out.println(name + " : " + age);
	}
}
public class ObjectArrayTest2 {

	public static void main(String[] args) {
		// 단일 객체 생성
		Person p = new Person("홍길동", 25); 
		// p.output();
		
		// person 타입의 데이터를 저장할 수 있는 객체 배열 생성
		
		Person[] pary = new Person[5];
		int size = 0; // 객체가 몇번방까지 들어가있는지 기억하는 변수
		
		// 5개의 방에 각각의 단일 객체 생성
		// ** create block
		pary[size] = new Person("전우치", 30);
		++size;
		
		pary[size] = new Person("임꺽정", 32);
		++size;
		
		pary[size] = new Person("홍길동", 25);
		++size;
		
		pary[size] = new Person("사오정", 19);
		++size;
		
		pary[size] = new Person("저팔계", 27);
		++size; // 5
		
		// **
		
		// 5개의 방이 다 차지 않은 경우, 빈 방은 NullPointerException 발생 -> 객체가 어디까지 들어가있는지 알아야함
//		for (Person tmp : pary) {
//			tmp.output();
//		}
		
		// 객체가 들어있는 방까지만 출력
		// ** print block
		for (int i=0; i<size; ++i) {
			pary[i].output();
		} //**
		
		// 전우치 탈퇴
		/* 1) 전우치가 몇번방에 있는지 확인 - 반복문으로 순회;search 해서 위치값 찾기; 10
		 * 2) 11->10, 12->11, 13->12 ... 비어있는 방; --size
		 * 3) for문으로 자리 하나씩 땡기는 것 처리
		*/
		
		// 서치할 위치값
		// 0으로 초기화할 시 존재하지 않는 회원인 경우 search할 시 if문에 걸리지 않아 0으로 위치값이 됨
		// 0번방의 회원이 삭제됨, 존재하지 않는 위치값으로 초기화해야함
		int searchIndex = -1; 
		// 저팔계가 몇번방에 있는지 확인
		// ** search block
		for (int i=0; i<size; ++i) {
			if (pary[i].getName().equals("저팔계")) {
				searchIndex = i;
				break;
			}// end of if
		} // end of for
		
		System.out.println("저팔계 위치값: " + searchIndex);
		// **
		
		
		// 인덱스값이 -1이 아닌 경우에만 for문 돌아 자리 떙기기
		// ** delete block
		if(searchIndex != -1) {
			for(int i=searchIndex; i<size-1; ++i) {
				pary[i] = pary[i+1];
			}
			--size;
		}
		else {
			System.out.println("존재하지 않는 회원입니다");
		} // **
		
		
		System.out.println("저팔계 탈퇴 후");
		for (int i=0; i<size; ++i) {
			pary[i].output();
		}
		
		// 회원가입 시 확인사항
		// 배열의 자리가 다 차서 회원가입을 더 할 수 없는 경우
		if (size >= pary.length) {
			System.out.println("인원이 다 찼습니다.");
		}
		
		
	}

}
