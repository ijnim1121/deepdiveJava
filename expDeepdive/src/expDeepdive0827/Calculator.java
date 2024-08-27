package expDeepdive0827;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.println("간단한 계산기 프로그램");
                System.out.println("1: 덧셈, 2: 뺄셈, 3: 곱셈, 4: 나눗셈, 5: 종료");
                System.out.print("연산을 선택하세요: ");
                int choice = scanner.nextInt();
                
                if (choice == 5) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                
                if (choice < 1 || choice > 4) {
                    throw new IllegalArgumentException("잘못된 선택입니다. 1에서 5 사이의 숫자를 입력하세요.");
                }
                
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double num1 = scanner.nextDouble();
                System.out.print("두 번째 숫자를 입력하세요: ");
                double num2 = scanner.nextDouble();
                
                double result = 0;
                String operation = "";
                
                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        operation = "+";
                        break;
                    case 2:
                        result = num1 - num2;
                        operation = "-";
                        break;
                    case 3:
                        result = num1 * num2;
                        operation = "*";
                        break;
                    case 4:
                        if (num2 == 0) {
                            throw new ArithmeticException("0으로 나눌 수 없습니다.");
                        }
                        result = num1 / num2;
                        operation = "/";
                        break;
                }
                
                System.out.printf("%.2f %s %.2f = %.2f%n", num1, operation, num2, result);
            } catch (ArithmeticException e) {
                System.out.println("오류: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("오류: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("오류: 잘못된 입력입니다. 다시 시도해주세요.");
                scanner.nextLine(); // 입력 버퍼 비우기
            }
            
            System.out.println(); // 줄바꿈
        }
        
        scanner.close();
    }
}