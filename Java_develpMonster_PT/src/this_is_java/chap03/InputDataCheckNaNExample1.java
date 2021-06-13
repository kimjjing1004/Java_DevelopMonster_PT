package this_is_java.chap03;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		String userInput = "NaN"; // "NaN"문자열
		double val = Double.valueOf(userInput);
		// 입력값을 double타입으로 변환하여 val에 값을 저장
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
		// "NaN" 문자열은 Double.valueOf() 메소드에 의해 double 타입으로 변환되면 NaN이 된다.
		// val에는 NaN이 저장되고, NaN이 산술연산이 가능해지기 때문에 이후에 어떠한 수와 연산을 수행하게 해서는 안된다.(데이터 망가짐)
		
	}

}
