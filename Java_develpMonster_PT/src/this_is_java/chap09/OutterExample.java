package this_is_java.chap09;

public class OutterExample {
	public static void main(String[] args) {
		Outter2 outter2 = new Outter2();
		Outter2.Nested nested = outter2.new Nested();
		nested.print();
	}
}
