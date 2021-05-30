package thisis.java.chap03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자 이군요");
		}
		
		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자 이군요");
		}
		
		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0 ~ 9 숫자 이군요");
		}
		// &&, & : 피연산자 모두가 true일 경우에만 연산 결과는 true
		// ! : 피연산자의 논리값을 바꿈(반전)
		
		
		int value = 6;
		
		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		// ||, | : 피연산자 중 하나만 true이면 연산 결과는 true

	}

}
