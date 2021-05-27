package thisis.java.chap02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 1000000000000;		// 컴파일 에러
		long var4 = 1000000000000L;		// long타입의 변수를 초기화할 때에는 이것은
										// 4byte 정수 데이터가 아니라 8byte 정수 데이터임을
										// 컴파일러에게 알려주기 위한 목적이기 때문에 정수값 뒤에 L을 붙여야한다
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}
