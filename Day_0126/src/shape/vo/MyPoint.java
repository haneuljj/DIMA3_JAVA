package shape.vo;

public abstract class MyPoint {
	private int x;
	private int y;
	
	// Constructor
	public MyPoint() {
		super();
	}

	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	// Setter, getter
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// method
	//추상메서드; 면적 구하기
	public abstract double calcArea() ; 

	// 다형성 임시 테스트 메서드
	public void temp() {
		System.out.println("Point Class");
	}
	
	
	
	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
}
