package thisis.java.chap02;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		// 정수 타입을 실수 값으로 변환 할때 float보다는 double을 쓰는것이 좋다
		// 그이유는 int 값을 손실없이 변환하려면 double이 float보다 표현할 수 있는 값이 더 넓기 때문에 손실이 없다.

	}

}
