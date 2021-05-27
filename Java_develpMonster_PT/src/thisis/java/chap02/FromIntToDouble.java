package thisis.java.chap02;

public class FromIntToDouble {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		// double은 정수 타입 int에서 값을 변환해도 데이터 값이 손실이 없기 때문에
		// 출력을 하면 0이 찍힌다.
	}

}
