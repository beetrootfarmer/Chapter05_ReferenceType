package ch05_2_array;

public class Arr {
	public static void main(String[] args) {
		
		int[][] arrs = new int[3][4];
/*참조타입(주소값(n바이트 메모리에 들어가는 숫자)이 저장) : 클래스, 배열
 * |첫주소4byte|4byte|4byte|...|...|...|...|...|...|...|...|
 * 첫 주소가 return된다 
 * 배열의 이름은 그 배열의 시작주소 값이다. int타입 배열A => 배열A이부분이 시작주소값
  		arrs[0] 배열의 시작주소 |	  |	  |	  |	 | new int[2][] 주소값이 두개가 나올거다((1차원 배열들의 합)의표지)
  		arrs[1]			  |	  |	  |	  |	 |new int[2]; 0 1 첫번째 주소
  		arrs[2]			  |	  |	  |	  |	 |new int[3]; 0 1 2 두번째 주소
  		
  		{arrs[0], arrs[1], arrs[2]}
  		
  		scores.length		-> 배열A의 길이 : 2
  		scores[0].length	-> 배열B의 길이 : 2
  		scores[1].length	-> 배열C의 길이 : 3
  		
 * arrs 와 arrs[0]은 어떻게 다르죠?
  */
		
		
	}

}
