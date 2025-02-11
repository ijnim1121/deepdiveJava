package expDeepdive0826;

public class Rectangle implements Shape{
	
	private double width;
	private double height;
	//생성
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return width*height;
	}
	
	public double Area() {
		return width*height;
	}
	
	@Override
    public String getName() {
        return "사각형";
    }

	
	public double perimeter()
	{
		return 2*(width+height);
	}

	public static void main(String[] args) {
		// 직사각형 객체 생성
		Rectangle rectangle = new Rectangle(5.0, 3.0);
		
		System.out.println("직사각형의 넓이 : " + rectangle.area());
		System.out.println("직사각형의 둘레 : " + rectangle.perimeter());

	}

}
