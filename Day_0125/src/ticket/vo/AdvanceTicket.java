package ticket.vo;

public class AdvanceTicket extends Ticket{
	private int beforeDate; // 몇 일 전 구매했나?

	public AdvanceTicket() {
		super();
	}

	public AdvanceTicket(int beforeDate) {
		super();
		this.beforeDate = beforeDate;
		
		// 구매일에 따라 가격값 세팅
		if (beforeDate <= 10) this.setPrice(50000);
		else if (beforeDate < 5) this.setPrice(80000);
		
	}
	
	// 부모의 멤버를 신경써야할 때 -> 보통 자기 필드만 가지고 생성하고 부모의 멤버들은 세터로 세팅
	public AdvanceTicket(int beforeDate, int number, int price) {
		super(number, price); // 부모쪽으로 멤버 넘겨서 생성 및 초기화
		this.beforeDate = beforeDate;
		
		// 구매일에 따라 가격값 세팅
		if (beforeDate < 10) this.setPrice(50000);
		else if (beforeDate < 5) this.setPrice(80000);
		
	}

	@Override
	public String toString() {
		
		return super.toString() + "\n" + "AdvanceTicket [beforeDate=" + beforeDate + "] " + "price=" + this.getPrice();
	}

	// 추상클래스인 부모 클래스가 가지고 있는 추상 메서드 반드시 오버라이드 
	@Override
	public void myMethod() {
		
	}
	
	

}
