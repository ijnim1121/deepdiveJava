package expDeepdive0827;

public class Circle implements Shape {
	private String name;
	private double  radius;
	
	public Circle() {
		name = "원";
		radius = 3;
	}

	@Override
	public void calculateArea() {
		System.out.println("원의 면적은" + radius*radius*Math.PI + "입니다.");

	}

}
