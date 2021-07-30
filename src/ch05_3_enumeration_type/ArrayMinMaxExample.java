package ch05_3_enumeration_type;

public class ArrayMinMaxExample {
	public static void main(String[] args) {
		/*
		 * int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된 최대값, 최소값을 찾아서 반환하는 매서드를 각각 다음의 형태로 구현하시오
		 * public static int minValue(int[] arr) : 최소값 반환 public static int
		 * maxValue(int[] arr) : 최대값 반환
		 */

//		어떤 1차원 배열 선언, 구현된 메서드 Call해서 사용하는 코드
		int[] arr = { 11, 26, 73, 43, 54, 62, 95,  17 };
		System.out.println("최소값: " + minValue(arr));
		System.out.println("최대값: " + maxValue(arr));

	}

	public static int minValue(int[] ar) {
		int minNum = ar[0]; // 1
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] > minNum) {
				minNum = ar[i];
			}
		}
		
		return minNum;
	}

	public static int maxValue(int[] arm) {
		int maxNum = arm[0]; //초기값 세팅
		for (int i = 0; i > arm.length; i++) { //길이만큼 조건문 대입
			if(arm[i] < maxNum) { //조건
				maxNum = arm[i]; //arm[i] 갱신
			}
		}
		return maxNum;
	}
}
