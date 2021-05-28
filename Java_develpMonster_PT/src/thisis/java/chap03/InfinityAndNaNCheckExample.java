package thisis.java.chap03;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
//		double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z + 2);	// 문제가 되는 코드
		// 연산의 결과가 Infinity 또는 NaN이면 절대로 다음 연산을 수행하지 못하게 해야한다.
		// 이 후 데이터가 엉망이 될 수 있다.(은행 계좌 특히 조심)

	}

}
