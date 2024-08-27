package expDeepdive0822;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 프로그램을 종료하려면 0을 입력하세요.");

        while (true) {
            System.out.print("숫자 입력: ");
            int number = sc.nextInt();

            if (number == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (number % 2 == 0) {
                System.out.println(number + "는 짝수입니다.");
            } else {
                System.out.println(number + "는 홀수입니다.");
            }
        }

        sc.close();
    }
}
