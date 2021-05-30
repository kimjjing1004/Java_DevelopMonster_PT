package thisis.java.chap03;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
		// strVar1과 starVar는 서로 동일한 String 객체의 번지값을 가지지만,
		// strVar3은 객체 생성 연산자인 new로 생성한 새로운 String 객체의 번지값을 가지고 있다.
		// String 객체의 문자열 자체만 비교하려면 equals() 메소드를 사용하면 된다.
	}

}
