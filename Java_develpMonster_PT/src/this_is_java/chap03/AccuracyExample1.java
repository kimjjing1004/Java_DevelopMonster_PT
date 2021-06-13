package this_is_java.chap03;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다.");
		// 출력이 0.299999999999999999999993 조각이 남는다.
		// 부동소수점 타입(float, double)은 0.1을 정확히 표현할 수 없어 근사치로 처리하기 때문
	}

}
