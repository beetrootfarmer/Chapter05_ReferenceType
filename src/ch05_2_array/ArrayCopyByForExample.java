package ch05_2_array;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		oldIntArray = newIntArray; //newIntArray를 대입
		oldIntArray[3] = 4; //oldIntArray의 확장 배열에 값 입력
		oldIntArray[4] = 5;
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}
			System.out.println();
			System.out.println("배열크기: " + oldIntArray.length);

//		for(int i=0; i<oldIntArray.length; i++) {
//			System.out.println(oldIntArray[i] + ", ");
		
	}

	}
