package this_is_java.chap07.protectedEx;

import this_is_java.chap07.A;
public class D extends A {
	public D() {
		super();				//	(o)
		this.field = "value";	//	(o)
		this.method();			//	(o)		// new 연산자를 사용해서 생성자를 직접 호출할 수는 없다
	}

}
