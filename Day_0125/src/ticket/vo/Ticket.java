package ticket.vo;

// 상속하려는 용도
public abstract class Ticket {
	// Field
	private int number;
	private int price;
	
	// Constructor
	public Ticket() {
		super();
	}

	public Ticket(int number, int price) {
		super();
		this.number = number;
		this.price = price;
	}
	
	// 추상 메서드
	public abstract void myMethod() ;
	
	// getter, setter
	public int getNumber() {
		return number;
	}

	public int getPrice() {
		return price;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("번호:%d, 가격:%,d", number, price);
	}
	
	
	
	
	
}
