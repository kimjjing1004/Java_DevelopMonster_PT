package this_is_java.chap08;

public class VehicleExample3 {
	public static void main(String[] args) {
		Vehicle3 vehicle3 = new Bus();
		
		
		vehicle3.run();
//		vehicle3.checkFare();	(X)	// Vehicle 인터페이스에는 checkFare()가 없음
		
		Bus bus = (Bus) vehicle3;	//	강제 타입 변환
		
		bus.run();
		bus.checkFare();	//	Bus 클래스에는 checkFare() 가 있음
	}

}
