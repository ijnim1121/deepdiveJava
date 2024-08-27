package expDeepdive0827;

public class Triangle implements Shape {
	private String name;
	private double side;
	private double height;
	private double half;
	
	public Triangle() {
		name = "삼각형";
		side = 4.0;
		height = 5.0;
		half = 0.5;
	}
	@Override
	public void calculateArea() {
		System.out.println("삼각형의 넓이는"+ half*side*height + "입니다.");
	}

}
