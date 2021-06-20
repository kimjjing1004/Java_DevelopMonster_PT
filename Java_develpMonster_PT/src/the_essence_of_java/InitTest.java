package the_essence_of_java;

public class InitTest {
	static int cv = 1;		//	명시적 초기화
	int iv = 1;				//	명시적 초기화
	
	static {
		cv = 2;				//	클래스 초기화 블럭
	}
	
	{
		iv = 2;				//	인스턴스 초기화 블럭
	}
	
	InitTest(){
		iv = 3;				//	생성자
	}
	
	public static void main(String[] args) {
//		InitTest it = new InitTest();
//		System.out.println(it.cv);
//		System.out.println(it.iv);
		
		
	}

}
