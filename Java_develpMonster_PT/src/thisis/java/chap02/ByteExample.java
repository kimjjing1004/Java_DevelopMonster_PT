package thisis.java.chap02;

public class ByteExample {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128;	// 컴파일 에러
							// byte는 표현할 수 있는 값의 범위가 -128 ~ 127 (-2의 7승 ~ 2의 7승 - 1)이기 때문이다
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}

}
