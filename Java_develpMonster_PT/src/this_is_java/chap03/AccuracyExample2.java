package this_is_java.chap03;

public class AccuracyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp / 10.0;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다.");
		// 정확한 계산이 필요하다면 정수 연산으로 변경해서 계산해야 한다.
	}

}
