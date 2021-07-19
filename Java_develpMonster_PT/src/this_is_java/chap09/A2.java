package this_is_java.chap09;

public class A2 {
	//	인스턴스 필드
	B2 field1 = new B2();			//	(o)
	C2 field2 = new C2();			//	(o)
	
	//	인스턴스 메소드
	void method1() {
		B2 var1 = new B2();			//	(o)
		C2 var2 = new C2();			//	(o)
	}
	
	//	정적 필드 초기화
//	static B2 field3 = new B2();	//	(x)
	static C2 field4 = new C2();	//	(o)
	
	//	정적 메소드
	static void method2() {
	//	B2 var1 = new B2();			//	(x)
		C2 var2 = new C2();			//	(o)
	}
	
	//	인스턴스 멤버 클래스
	class B2 {
		
	}
	
	//	정적 멤버 클래스
	static class C2 {
		
	}

}
