package the_essence_of_java;

class Tv2 {
	boolean power;	//	전원상태(on/off)									//	클래스
	int channel;	//	채널												//	인스턴스
																			//	맴버변수
	void power() {															//	스테틱변수
		power = !power;														//	클래스변수
	}																		//	인스턴스변수
	void channelUp() {														//	멤버메서드
		++channel;															//	스테틱메서드
	}																		//	인스턴스메서드
	void channelDown() {													//	변수
		--channel;															//	자료형 정의
	}																		//	선언
}																			//	호출
																			//	반환
class CaptionTv extends Tv2 {												//	매개변수
	boolean caption;	//	캡션상태(on/off)								//	지역변수
	void displayCaption(String text) {										//	등등
		if (caption) {
			//	캡션 상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}

class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;						//	조상 클래스로부터 상속받은 맴버
		ctv.channelUp();						//	조상 클래스로부터 상속받은 맴버
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;						//	캡션(자막) 기능을 견다
		ctv.displayCaption("Hello, World");
	}

}
