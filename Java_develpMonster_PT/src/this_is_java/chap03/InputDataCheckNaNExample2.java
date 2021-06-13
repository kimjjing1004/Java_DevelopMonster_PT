package this_is_java.chap03;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN"; 
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if (Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			// if 조건식을 넣어서 val의 값이 NaN인지를 검사하여 막아준다.
			
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);
		// currentBalance 값이 연산 후에도 보존된다.
	}

}
