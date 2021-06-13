package this_is_java.chap04;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
			
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
			
		default:
			System.out.println("손님입니다.");
		// char 타입 변수도 switch문에 사용될 수 있으며, 케이스를 한번에 여러개 써놓아 조건을 더 늘릴 수 있다.
		// 영어 대소문자에 관계없이 똑같은 알파벳이면 동일하게 처리하도록 만듬 swtich문이다.
		}

	}

}
