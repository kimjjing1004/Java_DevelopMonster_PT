package thisis.java.chap06;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
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
}