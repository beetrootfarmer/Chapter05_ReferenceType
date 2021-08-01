package ch05_1_reference_variable;

public class StringEqualsExample {
	public static void main(String[] args) {
//		static: 메모리, void:해당 매소드의 return; 타
		
//		System.out.println("Hello".); /* .붙였을때객체화 되어서,,인스턴스화 된 객체에 접*/
//		System.out.println("0x3BCD.toStrting.");
		
		String str1 = "java"; 
		String str2 = "java"; 
//		str1이 힘 영역에 저장.java로 저잦ㅇ. str1은힙 영역에서주소를 받아서사용하는것.......... 
//		System.out.println(str1 == str2); 결과는 true. 같은 주소를 참조하고있다는 것. 
		System.out.println(str1.hashCode()); /*주소값 볼 수 있*/
	
//		A a1 = new A();
//		a1.b /**/
		
		String str3 = new String("java");
		String str4 = new String("java"); /*new하면메모리를 더 차지하는것..*/
		System.out.println(  str3 == str4 ); /*new 하면 같은 객체를 참고하지 않다. 새롭게 생성된다!*/
		
		System.out.println(str3.equals(str4)); /*문자열비교시 내용이 같기때문에 true ! */
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	
	
//}
//class A{
//	int a = ();
//	int b = ();
//	
System.out.println("_____________________________________");

	String strVar5 = "신민철";
	String strVar6 = "신민철";

	if (strVar5 == strVar6) {
		System.out.println("strVar5과 strVar6는 참조가 같음");
	} else {
		System.out.println("strVar5과 strVar6는 참조가 다름");
	}
	if (strVar5.equals(strVar6)) {
		System.out.println("strVar5과 strVar6는 문자열이 같음");
	}

	String strVar7 = new String("신민철");
	String strVar8 = new String("신민철");

	if (strVar7 == strVar8) {
		System.out.println("strVar7과 strVar8는 참조가 같음");
	} else {
		System.out.println("strVar7과 strVar8는 참조가 다름");
	}
	if (strVar7.equals(strVar8)) {
		System.out.println("strVar7과 strVar8는 문자열이 같음");
	}
	}
}

