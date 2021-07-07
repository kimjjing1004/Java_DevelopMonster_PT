package this_is_java.chap08;

public interface ChildInterface2 extends ParentInterface {

	@Override
	public default void method2() {	//	재정의
		/* 실행문 */
	}
	
	public void method3();
	
}
