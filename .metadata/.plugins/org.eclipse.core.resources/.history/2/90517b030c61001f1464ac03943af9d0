package expDeepdive0823;

public class array {

    // 배열의 평균을 계산하는 메서드
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            return 0; 
        }
        
        int sum = 0;
        for (int num : array) {
            sum += num; // 배열의 모든 요소를 더함
        }
        return (double) sum / array.length; // 평균 계산
    }

    // 배열 요소를 변경하는 메서드
    public static void updateElement(int[] array, int index, int newValue) {
        if (array != null && index >= 0 && index < array.length) {
            array[index] = newValue; // 지정된 인덱스의 값을 변경
        } else {
            System.out.println("잘못된 인덱스입니다."); // 인덱스가 유효하지 않은 경우
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // 배열의 평균 계산
        double average = calculateAverage(numbers);
        System.out.println("배열의 평균: " + average);

        // 배열 요소 변경
        updateElement(numbers, 2, 100); // 인덱스 2의 요소를 100으로 변경

        // 변경된 배열 출력
        System.out.print("변경된 배열: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
