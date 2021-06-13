package this_is_java.chap03;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1; //문자 A는 유니코드 65를 가지므로 66이 되어 B라고 저장
		char c2 = 'A';
//		char c3 = c2 + 1;		// 컴파일 에러	// c2에 +1을 하면 int타입으로 변환되고 1과 연산되기 때문에 에러가 발생
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
//		System.out.println("c3: " + c3);	// 에러가 안나려면 char c3 = (char) (c2 + 1); 이것처럼 강제 타입 변환을 해서 얻어야 한다.
		
	}

}
