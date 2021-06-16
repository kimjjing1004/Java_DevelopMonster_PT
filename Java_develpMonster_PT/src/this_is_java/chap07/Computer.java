package this_is_java.chap07;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r *r;	// Math.PI는 수학 계산과 관련된 필드와
								// 메소드들을 가지고 있는 클래스로, 자바 표준 API를 제공
	}
	

}
