package this_is_java.chap04;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
			
		case "과장":
			System.out.println("500만원");
			break;
			
		default:
			System.out.println("300만원");
		}
		// 자바6까지는 swith문 괄호에는 정수타입(byte, char, short, int, long)변수나
		// 정수값을 산출하는 연산식만 올 수 있었다. 자바 7부터는 String타입의 변수도 올 수 있다.

	}

}
