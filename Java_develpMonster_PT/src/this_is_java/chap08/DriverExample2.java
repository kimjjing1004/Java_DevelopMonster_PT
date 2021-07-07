package this_is_java.chap08;

public class DriverExample2 {
	public static void main(String[] args) {
		Driver2 driver2 = new Driver2();
		
		Bus2 bus2 = new Bus2();
		Taxi2 taxi2 = new Taxi2();
		
		driver2.drive(bus2);	//	자동 타입 변환: Vehicle2 vehicle2 = bus2;
		driver2.drive(taxi2);	//	자동 타입 변환: Vehicle2 vehicle2 = taxi2;
	}

}
