package this_is_java.chap02;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = true; // boolean은 논리타입으로써, 1byte(8bit)로 표현되는 논리값(true/false)처럼 두가지 상태값을 저장할 수 있는 데이터 타입.
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}
}