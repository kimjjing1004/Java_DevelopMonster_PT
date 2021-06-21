package this_is_java.chap07;

public class InstanceofExample {
	public static void method1(Parent3 parent3) {
		if (parent3 instanceof Child3) {					//	Child3 타입으로 변환이 가능한지 확인
			Child3 child3 = (Child3) parent3;
			System.out.println("method1 - Child3로 변환 성공");
		} else {
			System.out.println("method1 - Child3로 변환되지 않음");
		}
	}
	
	public static void method2(Parent3 parent3) {
		Child3 child3 = (Child3) parent3;					//	ClassCastException이 발생할 가능성 있음
		System.out.println("method2 - Child3로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent3 parentA = new Child3();
		method1(parentA);								//	Child3 객체를 매개값으로 전달
		method2(parentA);
		
		Parent3 parentB = new Parent3();
		method1(parentB);								//	Parent3 객체를 매개값으로 전달
		method2(parentB);	//	예외발생
	}

}
