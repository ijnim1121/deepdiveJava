package javaEx02;

public class CalculatorEx {

	public static void main(String[] args) {
		// static 필드 사용 : 클래스명.멤버double 
		double result1 = 10*10*Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println(result1 + ", " + result2 + ", " + result3);

	}

}
