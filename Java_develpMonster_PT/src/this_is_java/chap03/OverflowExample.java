package this_is_java.chap03;

public class OverflowExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		//	컴파일러 에러는 발생하지 않지만 쓰레기값이 나옴
		// 그 이유는 int값의 범위를 초과 했기 때문
		
		long a = 1000000;
		long b = 1000000;
		long c = a * b;
		System.out.println(c);
		// long을 써줘야한다
		
	}

}
