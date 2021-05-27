package thisis.java.chap02;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		int i = 128;
		
		if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {		// (i < -128) || (i > 127)과 동일
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		} else {
			byte b = (byte) i;
			System.out.println(b);
			// Casting할때 주의할 점은 변환 후에도 데이터 값이 보존될 수 있게 검사해보는 것이 좋다
		}

	}

}
