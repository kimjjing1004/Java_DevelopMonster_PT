package this_is_java.chap08;

public class Car2 {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
	};
	
	void run() {
		for (Tire tire : tires) {
			tire.roll();
		}
	}
}
