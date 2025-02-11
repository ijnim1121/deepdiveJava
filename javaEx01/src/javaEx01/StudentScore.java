package javaEx01;

public class StudentScore {

	public static void main(String[] args) {
		// 3명의 학생이 있고, 각 학생은 4개의 과목 점수를 가짐
		int[][] scores = {
				{90,70,80,100},//1번 학생의 과목별 점수 
				{85, 65, 77, 90},//2번 학생 
				{80, 75, 85, 95}//3번 학
		};
		
		//학생별로 평균 점수를 계산하고 출력
		for(int i=0; i<scores.length; i++) { //각 학생별로 반복 
			int sum = 0;
			for(int j=0; j<scores[i].length; j++ ) { //해당 학생의 각 과목 점수를 
				sum += scores[i][j];
			}
			double avg = sum / (double)scores[i].length; //평균 점수 계산
			System.out.println((i+1 + "번 학생의 평균 점수: " +avg));
		}
			
		}

}
