package ch05_2_array;

public class ArrayCreatByValueListExample {
	public static void main(String[] args) {
		
		int[] scores = { 83, 90, 87 };
//		int[] socres = new int [3];
//		scores[0]=83;
		
		System.out.println("scores[0]:"+scores[0]);
		System.out.println("scores[0]:"+scores[1]);
		System.out.println("scores[0]:"+scores[2]);
		
		int sum = 0;
		for(int i=0; i<scores.lenghth; i++) {
			sum += scores[i];
			
		}
	}
}
