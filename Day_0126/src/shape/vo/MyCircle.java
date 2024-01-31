package shape.vo;

public class MyCircle extends MyPoint {
	private double radius;
	
	// Constructor
	public MyCircle() {
		super();
	}

	public MyCircle(double radius) {
		super();
		this.radius = radius;
	}

	// setter, getter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// method
	@Override
	public double calcArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	// 다형성 임시 테스트 메서드
	@Override
	public void temp() {
		System.out.println("Circle Class");
	}

	@Override
	public String toString() {
		return super.toString() + 
				", radius=" + radius + ", area=" + calcArea();
	}


}
