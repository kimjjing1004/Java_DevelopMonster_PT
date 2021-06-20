package this_is_java.chap07;

public class Car3Example {
	public static void main(String[] args) {
		Car3 car3 = new Car3();
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car3.run();
			if (problemLocation != 0) {
				System.out.println(car3.tires[problemLocation - 1].location + " HankookTire로 교체");
				car3.tires[problemLocation - 1] = new HankookTire(car3.tires[problemLocation - 1].location, 15);
			}
			System.out.println("-------------------------------");
		}
	}

}
