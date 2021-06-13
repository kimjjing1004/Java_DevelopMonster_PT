package this_is_java.chap02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		// 강제 타입 변환을 Casting이라 한다.
		// 클 그릇의 물을 작은 그릇 안에 모두 넣을 수 없는 것과 동일한 이치
		// 하지만, 큰 그릇을 작은 그릇 사이즈로 쪼개어서 한 조각만 작은 그릇에 넣는다면 가능
		// int 타입을 4개의 byte로 쪼갠 다음, 끝에 있는 1byte만 byte 타입 변수에 저장
		// 다만 1byte만 담게 되므로 원래 int 값은 보존되지 않는다 (00001010만 저장하고 나머지는 버려진다)
	}
}
