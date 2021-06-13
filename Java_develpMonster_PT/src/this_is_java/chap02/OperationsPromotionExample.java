package this_is_java.chap02;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;	// 컴파일러 에러
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		// 자바는 정수 연산일 경우 int 타입을 기본으로 한다. 이유는 피연산자를 4byte로 단위로 저장하기 때문
		// 크기가 4btye보다 작은 타입 (byte, char, short)은 4byte인 int타입으로 변환된 후 연산이 수행
		// 결과도 int 타입이 된다.
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;	// 컴파일러 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
//		int intValue6 = 10 / 4.0;	// 컴파일러 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		// 연산은 기본적으로 같은 타입의 피연산자(operand) 간에만 수행되기 때문에
		// 두 피연산자 중 크기가 큰 타입으로 자동 변환된 후 연산을 수행

	}

}
