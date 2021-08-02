package ch05_1_reference_variable;

public class JavaType2 {
	public static void main(String[] args) {
		
		int iv = 10;
		double dv = 10.0;
		
		System.out.println(iv);
		System.out.println(dv);
		
		int[] ar0 = new int[2];
		int[] ar1 = new int[3];
		ar1[2] = 3;
		int[] ar2 = new int[2];
		
		System.out.println(ar0); //[I@15db9742 주소(라 생각해도무방한거)가 찍	
		System.out.println(ar1);
		System.out.println(ar2);

		//int형 1차원 배열을 갖는 3개짜리 2차원 배열 생성
		int [][] arrs = new int[3][];
		arrs[0] = ar0;
		arrs[1] = ar1;
		arrs[2] = ar2;
//		arrs[1][]
		
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				System.out.println(arrs[i][j] + j++);
				
			}
		}
		System.out.println();
		
		for(int[] elements : arrs ) {
			for(int e: elements) {
				System.out.println(e+ ",");
			}
		}
		
//		int [][] arrs = {ar0, ar1, ar2};
		
	}

}
