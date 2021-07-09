package this_is_java.chap08;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
		
	}
	
	public static void main(String[] args) {
		printSound(new Cat2());
		printSound(new Dog2());
		
	}

}
