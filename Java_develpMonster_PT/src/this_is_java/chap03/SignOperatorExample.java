package this_is_java.chap03;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		// -연산자는 변수 값의 부호를 양수는 음수로, 음수는 양수로 바꾼다.
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
//		short result3 = -s;	// 컴파일 에러
		int result3 = -s;
		// 부호 연산자를 사용할 때 주의할 점은 부호 연산자의 산출 타입은 int 타입이 된다는 것이다.
		// short 타입 값을 부호 연산하면 int 타입 값으로 바뀐다. 그래서 컴파일 에러가 발생한다.
		System.out.println("result3=" + result3);

	}

}
