package thisis.java.chap02;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 실수값 저장
		double var1 = 3.14;
//		float var2 = 3.14;		// 컴파일 에러(Type mismatch)
		float var3 = 3.14F;		// 가수를 표현하는데 있어서 float에 비해 double이 약 두배의 자릿수가 배정되어있다
								// (float 가수: 23bit / double 가수: 52bit)
								// float보다 double이 더 정밀한 값을 저장할 수 있기 때문에 정밀도를 요구하는 계산에서 double을 사용
								// 자바는 실수 Literal의 기본 타입을 double로 간주! 이것은 실수 Literal을 float타입 변수에 그냥 저장할 수 없다는 뜻!
								// 그래서 실수 Literal을 float타입 변수에 저장하려면 Literal 뒤에 F를 붙여야한다!
		
		// 정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println("var1: " + var1);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
	}
}