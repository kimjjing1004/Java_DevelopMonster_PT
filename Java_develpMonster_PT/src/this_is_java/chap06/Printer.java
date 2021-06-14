package this_is_java.chap06;

public class Printer {
	
	// 리턴값이 없는 메소드(void)	// 메소드 오버로딩
	void println(int value) {
		System.out.println(value);
	}
	
	void println(boolean value) {
		System.out.println(value);
	}
	
	void println(double value) {
		System.out.println(value);
	}
	
	void println(String value) {
		System.out.println(value);
	}
	
	// 정적 메소드
	/*
	static void println(int value) {
		System.out.println(value);
	}
	
	static void println(boolean value) {
		System.out.println(value);
	}
	
	static void println(double value) {
		System.out.println(value);
	}
	
	static void println(String value) {
		System.out.println(value);
	}
	*/
}
