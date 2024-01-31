package ticket.vo;

public class WalkupTicket extends Ticket{
	
	public WalkupTicket() {	}
	public WalkupTicket(int number, int price) {
		super(number, price); // 외부로부터 받은 매개변수를 부모쪽 생성자로 넘겨서 초기화
	}
	
	// 추상클래스인 부모 클래스가 가지고 있는 추상 메서드 반드시 오버라이드 
	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		
	}
	
}
