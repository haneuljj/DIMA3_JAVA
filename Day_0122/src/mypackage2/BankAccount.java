/* [연습문제 - 29]
 * VO 클래스를 설계하시오
 * BankAccount
 * 멤버 변수: 계좌주(name), 계좌번호(no), 잔고(balance) -> private
 * 멤버 메서드: 입금(deposit), 출금(withdraw), 출력(output)
 */

package mypackage2;

public class BankAccount {
	// 멤버변수
	private String name;
	private String no;
	private int balance;
	
	// setter; 클래스의 필드(멤버 변수) 값을 외부에서 설정(변경)할 수 있도록 하는 메서드
	// Setter 메서드는 주로 private으로 선언된 멤버 변수의 값을 변경하는 역할 
	// 이를 통해 클래스의 캡슐화(Encapsulation) 원칙을 유지하면서 외부에서 필드에 값을 할당할 수 있도록 함
	public void setName(String n) {
		name = n;
	}
	
//	public void setName(String name) {
//		this.name = name; // this. ;우리 변수를 의미하는 것 지칭
//	}
	
	public void setNo(String num) {
		no = num;
	}
	
	public void setBalance(int b) {
		balance = b;
	}
	
	// getter; 클래스의 필드(멤버 변수) 값을 외부에서 읽을 수 있도록(조회) 하는 메서드
	// getter 메서드는 주로 private으로 선언된 멤버 변수의 값을 반환하는 역할 
	// 이를 통해 클래스의 캡슐화(Encapsulation) 원칙을 유지하면서 외부에서 필드에 접근할 수 있도록 하는 것이 가능
	public String getName() {
		return this.name;  // this객체, 우리 멤버에 사용
	}
	
	public String getNo() {
		return this.no;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	
	// 일반 메서드
	public void deposit(int amount) {
		balance = balance + amount;
		// balance += amount;
	}
	
	public void withdraw(int amount) {
		if (amount <= balance) balance = balance - amount;
		else System.out.println("출금가능액을 초과하였습니다.\n");
	}
	
//	public int withdraw(int amount) {
//		if (amount < balance) return 0;
//		balance -= amount;
//		return amount;
//	}
	
	public void output() {
		System.out.println("계좌주명: " + name);
		System.out.println("계좌번호: " + no);
		System.out.printf("잔고: %,d\n" , balance);
		System.out.println();
	}
}
