package ch05_2_array;

public class MainStringArrayArgument {
	public static void main(String[] args) {
//  특정 조건에 따른 실행을 명령하고 싶을 
	String version = "";
	if(args != null) {
		version = args[0];
		if(version.equals("kor")) {
			System.out.println("안녕하세요~");
		} else {
			System.out.println("Hello~");
		}
	}
	}

}
