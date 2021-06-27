package this_is_java.chap08;

public class RemoteControlExample2 {
	public static void main(String[] args) {
		
		RemoteControl rc = null;	//	인터페이스 변수 선언
		
		rc = new Television();		//	Television 객체를 인터페이스 타입에 대입
		rc.turnOn();				//	인터페이스의 turnOn(), turnOff() 호출
		rc.turnOff();				//	인터페이스의 turnOn(), turnOff() 호출
		
		rc = new Audio();			//	Audio 객체를 인터페이스 타입에 대입
		rc.turnOn();				//	인터페이스의 turnOn(), turnOff() 호출
		rc.turnOff();				//	인터페이스의 turnOn(), turnOff() 호출
		
	}

}
