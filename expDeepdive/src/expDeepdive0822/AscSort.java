package expDeepdive0822;

import java.util.Scanner;
import java.util.Arrays;

public class AscSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("정렬된 배열: " + Arrays.toString(numbers));

        sc.close();
    }
}