package expDeepdive0827;

public class Rect implements Shape {
	private String name;
	private double w;
	private double h;
	
	public Rect() {
		name = "직사각형";
		w = 3.0;
		h = 6.0;
	}
	@Override
	public void calculateArea() {
		System.out.println("직사각형의 넓이는"+ w*h + "입니다.");

	}

}
