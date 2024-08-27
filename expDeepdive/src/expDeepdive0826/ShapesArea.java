package expDeepdive0826;

public class ShapesArea {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(5);
		shapes[1] = new Rectangle(4,6);
		shapes[2] = new Triangle(3,4);
		
		for (Shape shape : shapes) {
            System.out.printf("%s의 면적: %.2f%n", shape.getName(), shape.Area());
        }
		
		

	}

}
