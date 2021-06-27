package this_is_java.chap08;

public class RemoteControlExample3 {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio2();
		rc.turnOn();
		rc.setMute(true);
	}

}
