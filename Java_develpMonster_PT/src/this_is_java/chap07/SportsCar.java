package this_is_java.chap07;

public class SportsCar extends Car {

	@Override
	public void speedUP() {
		speed += 10;
	}
	
	/*
	@Override
	public void stop() {
		System.out.println("스포츠가를 멈춤");
		speed = 0;
	}
	*/	// 오버라이딩을 할 수 없음

}
