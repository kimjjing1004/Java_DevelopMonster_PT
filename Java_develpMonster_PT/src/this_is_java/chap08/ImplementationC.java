package this_is_java.chap08;

public class ImplementationC implements InterfaceC {
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}
																//	InterfaceA와 InterfaceB의 실체 메소드도 있어야 한다
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}
	
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}

}
