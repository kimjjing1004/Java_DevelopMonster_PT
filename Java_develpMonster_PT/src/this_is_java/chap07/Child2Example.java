package this_is_java.chap07;

public class Child2Example {
	public static void main(String[] args) {
		Parent2 parent2 = new Child2();						//	자동 타입 변환
		
		parent2.field1 = "data1";
		parent2.method1();
		parent2.method2();
		
		/*
		parent.field2 = "data2";			//	(불가능)
		parent.method3();					//	(불가능)
		*/
		
		Child2 child2 = (Child2) parent2;					//	강제 타입 변환
		
		child2.field2 = "yyy";				//	(가능)
		child2.method3();					//	(가능)
	}
}