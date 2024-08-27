package expDeepdive0826;

public class Triangle implements Shape{
	private int height;
	private int side;
	public Triangle(int height, int side) {
		super();
		this.height = height;
		this.side = side;
	}
	
	public double Area() {
		return (side*height)*0.5;
	}
	
	@Override
    public String getName() {
        return "삼각형";
    }

}
