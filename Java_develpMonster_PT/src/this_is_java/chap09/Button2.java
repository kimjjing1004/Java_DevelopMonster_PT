package this_is_java.chap09;

public class Button2 {
	OnClickListener listener;	//	인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {	//	매개 변수의 다형성
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();			//	구현 객체의 onClick() 메소드 호출
	}
	
	interface OnClickListener {		//	중첩 인터페이스
		void onClick();
	}

}
