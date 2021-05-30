package thisis.java.chap03;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // true
		// v2가 double 타입으로 변환하고 비교하기 때문에 true
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // false
		System.out.println((float)v4 == v5); // true
		System.out.println((int)(v4 * 10) == (int)(v5 * 10)); // true
		// 0.1f는 0.1의 근사값으로 표현되어 0.1보다 큰 값이 되어 버린다.
		// 방법은 피연산자 모두 flaot 또는 int 타입으로 강제 변환한 후 비교 연산하면 된다. 
	}

}
