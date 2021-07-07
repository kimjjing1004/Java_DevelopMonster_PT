package this_is_java.chap08;

public class Driver3 {
	public void drive(Vehicle3 vehicle3) {	//	vehicle 가 Bus객체 이거나 Taxi객체 일 수도 있다
		if (vehicle3 instanceof Bus) {	//	vehicle 매개 변수가 참조하는 객체가 Bus인지 조사
			Bus bus = (Bus) vehicle3;	//	Bus 객체일 경우 안전하게 강제 타입 변환시킴
			
			bus.checkFare();	//	Bus 타입으로 강제 타입 변환을 하는 이유
		}
		vehicle3.run();
	}

}
