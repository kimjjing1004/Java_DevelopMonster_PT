package this_is_java.chap07;

class A2 {
	
}

class B2 extends A2 {
	
}

class C2 extends A2 {
	
}

class D2 extends B2 {
	
}

class E2 extends C2 {
	
}

public class PromotionExample {
	public static void main(String[] args) {
		B2 b2 = new B2();
		C2 c2 = new C2();
		D2 d2 = new D2();
		E2 e2 = new E2();
		
		A2 a1 = b2;
		A2 a2 = c2;
		A2 a3 = d2;
		A2 a4 = e2;
		
		B2 b1 = d2;
		C2 c1 = e2;
		
//		b b3 = e;	//	컴파일에러(상속 관계에 있지 않음)
//		c c2 = d;	//	컴파일에러(상속 관계에 있지 않음)
	}

}
