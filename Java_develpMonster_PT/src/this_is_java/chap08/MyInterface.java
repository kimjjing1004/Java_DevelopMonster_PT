package this_is_java.chap08;

public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface-method2 실행");	//	default 메소드
	}

}
