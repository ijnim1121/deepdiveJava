package javaEx01;

import java.util.Scanner;

public class javaEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//do-while 문 : while문 안에 구문 한번은 실행해야 할 때, 조건식을 나중에 비교
		// 사용자가 맞출 때까지 숫자를 추측하는 게임
		int secret = 7;
		int guess;
		
//		System.out.print("숫자를 맞춰보세요(1-10): ");
//		guess = sc.nextInt();
//		
//		while( guess != secret ) {
//			System.out.print("숫자를 맞춰보세요(1-10): ");
//			guess = sc.nextInt();
//		}
		
		do {
			System.out.print("숫자를 맞춰보세요(1-10): ");
			guess = sc.nextInt();
		} while(guess != secret);
		
		System.out.println("축하합니다! 정답입니다.");
		
		
	}
}