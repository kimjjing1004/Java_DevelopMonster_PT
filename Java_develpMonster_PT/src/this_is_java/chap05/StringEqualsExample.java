package this_is_java.chap05;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";	//	변수가 동일한 문자열	//	그래서 서로 참조가 같다(동일한 String객체 참조)
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");	//	다른건 고려 안하고 순수하게 문자열만 고려
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");	//	new연산자를 사용해서 직접 String객체를 생성하면 힙영역에 새로운 객체를 만듦
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");	//	이 경우 서로다른 String 객체를 참조함 그래서 다름
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}

	}

}
