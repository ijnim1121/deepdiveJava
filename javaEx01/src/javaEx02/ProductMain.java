package javaEx02;

import java.time.LocalDate;

public class ProductMain {

	public static void main(String[] args) {
		//p 객체 (Student 클래스의 인스턴스)
		Product p = new Product(1001, "노트북", 1000000, "삼성", LocalDate.of(2024, 8, 24), 10);
		System.out.println(p);
	}

}
