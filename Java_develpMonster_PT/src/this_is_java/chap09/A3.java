package this_is_java.chap09;

public class A3 {
	int field1;
	void method1() {
		
	}
	
	static int field2;
	static void method2() {
		
	}
	
	class B3 {
		void method() {
			field1 = 10;
			method1();
									//	모든 필드와 메소드에 접근할 수 있다.
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
			//	field1 = 10;		//	인스턴스 필드와 메소드는 접근할 수 없다.
			//	method1();
			
			field2 = 10;
			method2();
		}
	}

}
