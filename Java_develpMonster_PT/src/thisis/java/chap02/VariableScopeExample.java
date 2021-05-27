package thisis.java.chap02;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15; // 정수 타입(int)로 v1변수를 선언하고 초기값 15를 변수 v1에 저장
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5;	// v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
								// v2가 선언된 곳은 if 블록 내부이므로 if블록 바깥쪽인 10라인에서는 사용할 수 없다.
	}

}
