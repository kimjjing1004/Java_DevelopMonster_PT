package this_is_java.chap03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		
		double result6 = (double) v1 / v2;
		System.out.println("result6=" + result6);
		// result6을 실수로 저장 시키고 싶으면 정수(int)타입 v1,v2 둘 중 하나를 (double)타입으로 강제 변환해야한다
	}

}
