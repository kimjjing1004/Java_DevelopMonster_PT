package this_is_java.chap06;		//	만약에 패키지가 다르다면...

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;	//(o)
//		a.field2 = 1;	//(x)	//	default 필드 접근 불가(컴파일 에러)
//		a.field3 = 1;	//(x)	//	private 필드 접근 불가(컴파일 에러)
		
		a.method1();	//(o)	
//		a.method2();	//(x)	//	default 메소드 접근 불가(컴파일 에러)
//		a.method3();	//(x)	//	private 메소드 접근 불가(컴파일 에러)
	}
	
	/*
	//필드
		A a1 = new A(true);		//	(o)
//		A a2 = new A(1);		//	(x)		// default 생성자 접근 불가(컴파일 에러)
//		A a3 = new A("문자열");	//	(x)		// private 생성자 접근 불가(컴파일 에러)
	*/
}
