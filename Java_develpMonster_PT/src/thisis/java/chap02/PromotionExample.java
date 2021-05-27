package thisis.java.chap02;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;		// int <- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;			// int <- char
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue;		// long <- int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	// double <- int
		System.out.println(doubleValue);
		// 자동 타입 변환은 변환 이전의 값과 변환 이후의 값이 동일하다.(손실 없이 그대로 보존)
		// 작은 그릇의 물을 큰 그릇으로 옮기더라도 물의 양은 변하지 않는다는 것과 유사하다.
		// ex) 1byte를 --> int(4byte)로 자동타입변환 하면 00001010 값이 그대로 유지 나머지는 전부다 0으로 처리되어 남게된다.
		// 자동 타입 변환에서 단 하나의 예외가 있다!
		// char는 2byte의 크기를 가지지만, 범위가 0 ~ 65535이므로 음수가 저장될 수 없다!
		// 따라서 음수가 저장될 수 있는 byte 타입을 char타입으로 자동변환 시킬 수 없다!
	}

}
