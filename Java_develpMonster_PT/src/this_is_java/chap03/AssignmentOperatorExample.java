package this_is_java.chap03;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		
		result += 10;
		System.out.println("result=" + result);
		result -= 5;
		System.out.println("result=" + result);
		result *= 3;
		System.out.println("result=" + result);
		result /= 5;
		System.out.println("result=" + result);
		result %= 3;
		System.out.println("result=" + result);
		// result += 10은 result = result + 10이랑 동일하므로
		// 초기값을 0으로 선언한 것을 대입하면 10이 출력
		// result -= 5도 마찬가지 같은 원리로 10을 대입하면 5가 출력
		// 마찬가지로 5를 대입하면 15가 출력
		// 15를 대입하면 3이 출력
		// 3을 대입하면 0이 출력
	}

}
