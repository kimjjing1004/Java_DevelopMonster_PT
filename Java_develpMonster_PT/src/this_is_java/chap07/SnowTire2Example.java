package this_is_java.chap07;

public class SnowTire2Example {
	public static void main(String[] args) {
		SnowTire2 snowTire2 = new SnowTire2();
		Tire2 tire2 = snowTire2;
		
		snowTire2.run();
		tire2.run();
	}

}
