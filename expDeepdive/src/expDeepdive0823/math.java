package expDeepdive0823;

import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		System.out.println("두 정수를 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println("두 값의 합은" + plus(A,B) + "입니다.");
		System.out.println("두 값의 차는" + minus(A,B) + "입니다.");
		sc.close();

	}
	
	public static int plus(int A, int B) {
		int C = A+B;
		return C;
		
	}
	
	public static int minus(int A, int B) {
		if(A>B) {
			int C=A-B;
			return C;
		}else {
			int C = B-A;
			return C;
		}
		
	}

}
