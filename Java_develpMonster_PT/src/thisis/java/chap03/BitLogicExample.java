package thisis.java.chap03;

public class BitLogicExample {

	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 & 25 = " + (45 | 25));
		System.out.println("45 & 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45)); 

	}	// 45, 25의 비트 연산은 각각 이진수 상태에서 4byte인 int타입으로 자동 타입 변환 후 연산된다.
		// byte, short, char 타입을 비트 논리 연산하면 그 결과는 int 타입이 된다.

}
