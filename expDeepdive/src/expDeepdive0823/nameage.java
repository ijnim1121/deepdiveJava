package expDeepdive0823;

import java.util.Scanner;

public class nameage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("이름을 입력해주세요: ");
        String name = sc.nextLine(); 
        
        System.out.print("나이를 입력해주세요: ");
        int age = sc.nextInt();
        
        System.out.println("사용자의 이름은 " + name + "이며, 사용자의 나이는 " + age + "입니다.");

        sc.close(); 
    }
}

