package this_is_java.chap03;

public class BitShiftExample {

	public static void main(String[] args) {
		System.out.println("1 << 3 = " + (1 << 3));
		System.out.println("-8 >> 3 = " + (-8 >> 3));
		System.out.println("-8 >>> 3 = " + (-8 >>> 3));
		// (1 << 3)
		// 4byte인 int로 변환 하면 총 32bits인 전체를 왼쪽으로 3bits 이동할때
		// 맨 왼쪽 3bits는 밀려서 버려지고, 맨 오른쪽에는 3bits는 영으로 채우면
		// 값은 2진수에서 10진수로 변환하여 정수 8이 출력
		
		// (-8 >> 3)
		// 32bits 전체를 오른쪽으로 3bits 이동할 때 맨 오른쪽 3bits는 밀려서 버려지고,
		// 맨 왼쪽에 새로 생기는 3bits는 최상위 부호 비트(MSB)와 동일한 값으로 채워진다.
		// 따라서 -8은 최상위 부호 비트가 1이므로 맨 왼쪽 빈 공간은 1로 채워진다.
		// 32bits가 모두 1이면 정수 -1이므로 -1이 출력
		
		// (-8 >>> 3)
		// 32bits 전체를 오른쪽으로 3bits 이동할 때 맨 오른쪽 3bits는 밀려서 버려지고,
		// 맨 왼쪽에 새로 생기는 3bits는 무조건 0으로 채워진다.
		// 변환된 2진수를 10진수로 변환하면 정수 536870911이 출력
	}

}
