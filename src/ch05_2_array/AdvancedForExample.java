package ch05_2_array;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 }; //배열 선언
		
		int sum = 0; //총합 값 초기화
		for (int score : scores) { //score 
			sum = sum + score;
		}
		System.out.println("점수 총합= " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균= " +avg);
		
	}
}


