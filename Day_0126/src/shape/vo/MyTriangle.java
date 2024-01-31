package shape.vo;

public class MyTriangle extends MyPoint {
	private double width;
	private double height;
	
	public MyTriangle() {
		super();
	}

	public MyTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calcArea() {
		return this.width * this.height * 0.5;
	}

	// 다형성 임시 테스트 메서드
		@Override
		public void temp() {
			System.out.println("Tirangle Class");
		}
	
	
	@Override
	public String toString() {
		return super.toString() + 
				", width" + width + ", height" + height + ", area=" + calcArea();
	}

}
