package thisis.java.chap06;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	int gas;
	
	Car (String color, int cc) {
		
	}
	
	//	생성자
	Car() {
		
	}
	
	Car (String model){
		this(model, "은색", 250);		//	호출
	}
	
	Car (String model, String color) {
		this(model, color, 250);	//	호출
	}
	
	Car (String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;	//	공통 실행 코드
	}
	
	//	메소드
	void setGas(int gas) {		//	리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");		//	리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
			return false;	//	false를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true;	//	true를 리턴
	}
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달랍니다.(gas잔량:" + gas + ")");	//	리턴값이 없는 메소드로 gas 필드값이 0이면 return문으로 메소드를 강제 종료
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return;	//	메소드 실행 종료
			}
		}
	}
}
