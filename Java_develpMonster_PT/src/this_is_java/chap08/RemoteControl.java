package this_is_java.chap08;

public interface RemoteControl {
	//	상수								//	public static final 생략가능
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//	추상 메소드							//	public abstract 생략가능
	public void turnOn();					//	메소드 선언부만 작성(추상 메소드)
	public void turnOff();					//	메소드 선언부만 작성(추상 메소드)
	public void setVolume(int volume);		//	메소드 선언부만 작성(추상 메소드)
	
	//	디폴트 메소드
	default void setMute(boolean mute) {	//	public 생략 가능
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}	//	실행 내용까지 작성
	}
	
	//	정적 메소드
	static void changeBattery() {			//	public 생략 가능
		System.out.println("건전지를 교환합니다.");
	}
}
