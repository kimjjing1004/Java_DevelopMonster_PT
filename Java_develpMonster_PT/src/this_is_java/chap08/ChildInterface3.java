package this_is_java.chap08;

public interface ChildInterface3 extends ParentInterface {

	@Override
	public void method2();	//	ParentInterface의 default메소드인 method2()를 추상 메소드로 재선언한다
	
	public void method3();	//	자신의 추상 메소드 선언

}
